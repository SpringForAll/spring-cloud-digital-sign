#!/bin/bash

echo '============================================================='
echo '$                                                           $'
echo '$                      liumapp                              $'
echo '$                                                           $'
echo '$                                                           $'
echo '$  email:    liumapp.com@gmail.com                          $'
echo '$  homePage: http://www.liumapp.com                         $'
echo '$  Github:   https://github.com/liumapp                     $'
echo '$                                                           $'
echo '============================================================='
echo '.'

docker rmi liumapp/digital-sign-config-server:v1.0.0
docker rmi liumapp/digital-sign-demo:v1.0.0
docker rmi liumapp/digital-sign-eureka:v1.0.0
docker rmi liumapp/digital-sign-gateway:v1.0.0
docker rmi liumapp/keystore-worker:v1.0.0
docker rmi liumapp/pdf-worker:v1.0.0


