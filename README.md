# spring-cloud-digital-sign
Sign personal RSA2 certificate in PDF documents  , under coding , plz don't use right now .

## digital-sign-engine

* generate personal RSA2 certificate .

* save certificate in keystore . 

* sign certificate from keystore to PDF documents.

## digital-sign-service

* REST service . 

## digital-sign-ui

* Demo ui for beginners.

## how to use 

* build maven project and push them into docker by running "build-images.sh"
 
* running project by using docker-compose :
 
        docker-compose up -d 
        
    then , you can view http://localhost:1234/ and find :
    
    ![start_done.jpg](https://github.com/SpringForAll/spring-cloud-digital-sign/blob/master/pic/start_done.jpg)
     
     
            
            
