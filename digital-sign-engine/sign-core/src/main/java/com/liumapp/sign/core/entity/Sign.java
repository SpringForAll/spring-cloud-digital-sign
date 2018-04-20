package com.liumapp.sign.core.entity;

import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfSignatureAppearance;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.security.*;

import java.io.*;

/**
 * Created by liumapp on 2/27/18 2:35 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class Sign {

	/**
	 * 单多次签章通用
	 * @param src string source pdf
	 * @param target string target pdf
	 * @param signatureInfos SignatureInfo
	 */
	public static void sign(String src, String target, SignatureInfo... signatureInfos){
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
