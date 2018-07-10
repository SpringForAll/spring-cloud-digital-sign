# spring cloud数字签名
在PDF文档上签署RSA2自签证书，正在开发中，请勿使用

[中文文档](https://github.com/SpringForAll/spring-cloud-digital-sign/blob/master/README_CN.md) | [English Document](https://github.com/SpringForAll/spring-cloud-digital-sign/blob/master/README.md)

## 待办事项

### frontend

* 添加用户上传一个或者多个doc文档的界面

* 添加用户填写参与签名甲乙双方个人信息的界面

* 在填写签署人信息界面，同步获取后台转换pdf文档的结果

* 添加带有证书的PDF下载页面

### backend

* 保存用户上传的doc文档

* 将用户上传的doc文档转换为PDF

* 获取用户个人信息并生成RSA2自签证书

* 封装签名算法、证书生成算法为digital-sign-core

* 调用封装好的签名算法，将数字证书签署在转换好的PDF合同上