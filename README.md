# spring-cloud-digital-sign
Sign personal RSA2 certificate in PDF documents  , under coding , plz don't use right now .

[中文文档](https://github.com/SpringForAll/spring-cloud-digital-sign/blob/master/README_CN.md) | [English Document](https://github.com/SpringForAll/spring-cloud-digital-sign/blob/master/README.md)

## to do list 

### frontend

* 添加用户上传一个或者多个doc文档的界面

* 添加用户填写参与签名甲乙双方个人信息的界面

* 在填写签署人信息界面，同步获取后台转换pdf文档的结果

* 添加带有证书的PDF下载页面

### backend

* 保存用户上传的doc文档

* 将用户上传的doc文档转换为PDF

* 获取用户个人信息并生成RSA2自签证书

* 调用封装好的签名算法，将数字证书签署在转换好的PDF合同上

## how to use

I'm making big change , plz don't use right now , thks.  

### run in docker 

* build maven project and push them into docker by running "build-images.sh"

    plz pay attention , you need install digital-sign-engine first . (if not , maven will report an error that no denpendency find . )
    
        cd digital-sign-engine
        
        mvn install
 
* running project by using docker-compose :
 
        docker-compose up -d 
        
    then , you can view http://localhost:1234/ and find : (this is going to take about 2~3 mins in Mac Pro , plz be patient)
    
    ![start_done.jpg](https://github.com/SpringForAll/spring-cloud-digital-sign/blob/master/pic/start_done.jpg)
     
    and in docker pannel , you can find : 
     
    ![docker_pannel.jpg](https://github.com/SpringForAll/spring-cloud-digital-sign/blob/master/pic/docker_pannel.jpg)
    
### run in your own IDE

* import the project .

* update your local hosts file , add "127.0.0.1 sign-eureka"

* start eureka first , then config-server , then gateway , then service ...    
     
### generate a keystore
            
A keystore is a container of certificate . 

Plz make sure all the pattern get their own empty constructor . 

* open your browser , and visit : http://localhost:2333/digital-sign-demo/demo/ks 

    if return msg is : "generate done" 
    
    you can find a demo.ks file in your project . 
    
### generate a certificate in your keystore

A certificate should saved in a keystore file 

but you can also export it to anywhere you like 

* open your browser , and visit : http://localhost:2333/digital-sign-demo/demo/generateCert

    if return msg is "generator done"
    
    your certificate file should be generated in your keysotre file . 
    
    in digital-sign-demo service , it was saved in demo.ks .
    
* now back to the project directory , and use the command : 

      keytool -list -v -keystore ./demo.ks
    
  you will get the certificate info .   
  
  like :
  
      您的密钥库包含 2 个条目
      
      别名: demo-a
      创建日期: 2018-3-16
      条目类型: PrivateKeyEntry
      证书链长度: 1
      证书[1]:
      所有者: CN=lisi, ST=Hangzhou, L=ZheJiang, C=China
      发布者: CN=lisi, ST=Hangzhou, L=ZheJiang, C=China
      序列号: 1f4468a0e78d77aa
      有效期开始日期: Fri Mar 16 15:52:16 CST 2018, 截止日期: Sat Mar 16 21:41:28 CST 2019
      证书指纹:
               MD5: BC:62:D2:9C:20:0F:2A:2C:3D:AA:D2:D1:DB:13:E4:8C
               SHA1: 42:F4:4F:60:49:E7:03:A1:FB:E4:A0:E4:54:EC:AB:88:FF:3B:61:6D
               SHA256: E8:51:75:C9:1B:36:D4:90:5D:24:B8:F9:AF:96:8E:92:95:C8:E7:CA:79:C2:0C:BF:F2:8F:99:7D:17:37:7F:A8
               签名算法名称: SHA256withRSA
               版本: 3
      
      
      *******************************************
      *******************************************
      
    
### export a certificate file to folder


              
## attention 

For personal certificate , you must identify Personal before using it (like short message)            
            
