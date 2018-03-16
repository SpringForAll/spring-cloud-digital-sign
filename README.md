# spring-cloud-digital-sign
Sign personal RSA2 certificate in PDF documents  , under coding , plz don't use right now .

## digital-sign-engine

* generate personal RSA2 certificate .

* save certificate in keystore . 

* sign certificate from keystore to PDF documents.

## digital-sign-service

* REST service . 

## how to use 

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
     
### generate a keystore
            
A keystore is a container of certificate . 

Plz make sure all the pattern get their own empty constructor . 

* open your browser , and visit : http://localhost:2333/digital-sign-demo/demo/ks 

    if return msg is : "generate done" 
    
    you can find a demo.ks file in your project . 
    
           
            
            
