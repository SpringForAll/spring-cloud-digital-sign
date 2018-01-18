package com.liumapp.signature.pdf.worker;

import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfSignatureAppearance;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.security.*;
import com.liumapp.DNSQueen.worker.ready.StandReadyWorker;
import com.liumapp.ali.oss.utils.OssUtil;
import com.liumapp.pattern.sign.PdfSignPattern;
import com.liumapp.signature.pdf.helper.utils.SignatureInfo;
import com.liumapp.signature.pdf.config.Params;
import com.liumapp.signature.pdf.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;

/**
 * 在签署区域中应用用户证书
 * Created by liumapp on 11/28/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class Signer extends StandReadyWorker {

    @Autowired
    private Params params;

    @Autowired
    private OssUtil ossUtil;

    @Autowired
    private FileUtil fileUtil;

    @Override
    public String doWhatYouShouldDo(String whatQueenSays) {
        try {
            PdfSignPattern pdfSignPattern = PdfSignPattern.parse(whatQueenSays);

            String tmpPdfOut = pdfSignPattern.getTmpPdf() + "final";

            KeyStore ks = KeyStore.getInstance("jks");
            ks.load(new FileInputStream(params.getKeySotrePath() + "/" + "keystore.ks") , params.getKeyStorePd().toCharArray());
            PrivateKey pk = (PrivateKey) ks.getKey(pdfSignPattern.getAlias() , pdfSignPattern.getCertPd().toCharArray());
            Certificate[] chain = ks.getCertificateChain(pdfSignPattern.getAlias());

            SignatureInfo signatureInfo = new SignatureInfo();
            signatureInfo.setReason("数字签名");
            signatureInfo.setLocation("浙江葫芦娃网络技术有限公司");
            signatureInfo.setPk(pk);
            signatureInfo.setChain(chain);
            signatureInfo.setCertificationLevel(PdfSignatureAppearance.NOT_CERTIFIED);
            signatureInfo.setDigestAlgorithm(DigestAlgorithms.SHA256);
            signatureInfo.setFieldName(pdfSignPattern.getSignatureField());
            signatureInfo.setImagePath(params.getTmpDir() + "/" + pdfSignPattern.getTmpImg());
            signatureInfo.setRenderingMode(PdfSignatureAppearance.RenderingMode.GRAPHIC);

            sign(params.getTmpDir() + "/" + pdfSignPattern.getTmpPdf() , params.getTmpDir() + "/" + tmpPdfOut , signatureInfo);
            ossUtil.uploadFile("signed" + pdfSignPattern.getPdfKey() , new File(params.getTmpDir() + "/" + tmpPdfOut));

            fileUtil.deleteFile(params.getTmpDir() + "/" + pdfSignPattern.getTmpImg());
            fileUtil.deleteFile(params.getTmpDir() + "/" + pdfSignPattern.getTmpPdf());
            fileUtil.deleteFile(params.getTmpDir() + "/" + tmpPdfOut);

            return "signed" + pdfSignPattern.getPdfKey();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 单多次签章通用
     * @param src string source pdf
     * @param target string target pdf
     * @param signatureInfos SignatureInfo
     */
    public void sign(String src, String target, SignatureInfo... signatureInfos){
        InputStream inputStream = null;
        FileOutputStream outputStream = null;
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        try {
            inputStream = new FileInputStream(src);
            for (SignatureInfo signatureInfo : signatureInfos) {
                ByteArrayOutputStream tempArrayOutputStream = new ByteArrayOutputStream();
                PdfReader reader = new PdfReader(inputStream);
                //创建签章工具PdfStamper ，最后一个boolean参数是否允许被追加签名
                PdfStamper stamper = PdfStamper.createSignature(reader, tempArrayOutputStream, '\0', null, true);
                // 获取数字签章属性对象
                PdfSignatureAppearance appearance = stamper.getSignatureAppearance();
                appearance.setReason(signatureInfo.getReason());
                appearance.setLocation(signatureInfo.getLocation());
                //设置签名的签名域名称，多次追加签名的时候，签名预名称不能一样，图片大小受表单域大小影响（过小导致压缩）
                appearance.setVisibleSignature(signatureInfo.getFieldName());
                //读取图章图片
                Image image = Image.getInstance(signatureInfo.getImagePath());
                appearance.setSignatureGraphic(image);
                appearance.setCertificationLevel(signatureInfo.getCertificationLevel());
                //设置图章的显示方式，如下选择的是只显示图章（还有其他的模式，可以图章和签名描述一同显示）
                appearance.setRenderingMode(signatureInfo.getRenderingMode());
                /**
                 * 粘贴图片
                 */
//                PdfContentByte over = stamper.getOverContent(1);
//                image.setAbsolutePosition(0 , 0);
//                image.scaleToFit(300 , 109);
//                over.addImage(image);
                // 摘要算法
                ExternalDigest digest = new BouncyCastleDigest();
                // 签名算法
                ExternalSignature signature = new PrivateKeySignature(signatureInfo.getPk(), signatureInfo.getDigestAlgorithm(), null);
                // 调用itext签名方法完成pdf签章
                MakeSignature.signDetached(appearance, digest, signature, signatureInfo.getChain(), null, null, null, 0, signatureInfo.getSubfilter());
                //定义输入流为生成的输出流内容，以完成多次签章的过程
                inputStream = new ByteArrayInputStream(tempArrayOutputStream.toByteArray());
                result = tempArrayOutputStream;
            }
            outputStream = new FileOutputStream(new File(target));
            outputStream.write(result.toByteArray());
            outputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(null!=outputStream){
                    outputStream.close();
                }
                if(null!=inputStream){
                    inputStream.close();
                }
                if(null!=result){
                    result.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
