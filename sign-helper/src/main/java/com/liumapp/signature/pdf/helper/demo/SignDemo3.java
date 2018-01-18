package com.liumapp.signature.pdf.helper.demo;

import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfSignatureAppearance;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.security.*;
import com.liumapp.signature.pdf.helper.utils.SignatureInfo;

import java.io.*;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;

/**
 * Created by liumapp on 9/25/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class SignDemo3 {

    private static final String cert_path = "/usr/local/tomcat/project/cerebrate/pfxSigner/data/liumapp.keystore";

    private static final String image_path = "/usr/local/tomcat/project/cerebrate/pfxSigner/data/sign.png";

    private static final String source_pdf = "/usr/local/tomcat/project/cerebrate/pfxSigner/data/test_tmp.pdf";

    private static final String output_pdf = "/usr/local/tomcat/project/cerebrate/pfxSigner/data/output.pdf";

    private static final String datasource = "/usr/local/tomcat/project/cerebrate/pfxSigner/data";

    public static final char[] PASSWORD = "111111".toCharArray();//keystory密码

    //    public static final char[] PASSWORD = null;

    /**
     * 单多次签章通用
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
                PdfContentByte over = stamper.getOverContent(1);
                image.setAbsolutePosition(0 , 0);
                image.scaleToFit(300 , 109);
                over.addImage(image);
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

    public static void main(String[] args) {

        try {
            SignDemo3 app = new SignDemo3();
            //将证书文件放入指定路径，并读取keystore ，获得私钥和证书链
            String pkPath = cert_path;
            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(new FileInputStream(pkPath), PASSWORD);
            String alias = ks.aliases().nextElement();
            PrivateKey pk = (PrivateKey) ks.getKey(alias, PASSWORD);
            Certificate[] chain = ks.getCertificateChain(alias);

            String src = source_pdf;

            //封装签章信息
//            SignatureInfo info1 = new SignatureInfo();
//            info1.setReason("理由1");
//            info1.setLocation("位置1");
//            info1.setPk(pk);
//            info1.setChain(chain);
//            info1.setCertificationLevel(PdfSignatureAppearance.NOT_CERTIFIED);
//            info1.setDigestAlgorithm(DigestAlgorithms.SHA1);
//            info1.setFieldName("mySig1");
//            info1.setImagePath(image_path);
//            info1.setRenderingMode(PdfSignatureAppearance.RenderingMode.GRAPHIC);


            SignatureInfo info2 = new SignatureInfo();
            info2.setReason("理由2");
            info2.setLocation("位置2");
            info2.setPk(pk);
            info2.setChain(chain);
            info2.setCertificationLevel(PdfSignatureAppearance.NOT_CERTIFIED);
            info2.setDigestAlgorithm(DigestAlgorithms.SHA1);
            info2.setFieldName("mySig2");
            info2.setImagePath(datasource + "/sign2.png");
            info2.setRenderingMode(PdfSignatureAppearance.RenderingMode.GRAPHIC);

//            SignatureInfo info3 = new SignatureInfo();
//            info3.setReason("理由3");
//            info3.setLocation("位置3");
//            info3.setPk(pk);
//            info3.setChain(chain);
//            info3.setCertificationLevel(PdfSignatureAppearance.NOT_CERTIFIED);
//            info3.setDigestAlgorithm(DigestAlgorithms.SHA1);
//            info3.setFieldName("mySig3");
//            info3.setImagePath(datasource + "/sign3.png");
//            info3.setRenderingMode(PdfSignatureAppearance.RenderingMode.GRAPHIC);

//            SignatureInfo info1 = new SignatureInfo();
//            info1.setReason("理由1");
//            info1.setLocation("位置1");
//            info1.setPk(pk);
//            info1.setChain(chain);
//            info1.setCertificationLevel(PdfSignatureAppearance.NOT_CERTIFIED);
//            info1.setDigestAlgorithm(DigestAlgorithms.SHA1);
//            info1.setFieldName("sig2");
//            info1.setImagePath(app.getClass().getResource("/template/yinzhang.png").getPath());
//            info1.setRenderingMode(PdfSignatureAppearance.RenderingMode.GRAPHIC);

//            app.sign(src, output_pdf, info1);
            app.sign(src, output_pdf, info2);
//            app.sign(src, output_pdf, info3);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
