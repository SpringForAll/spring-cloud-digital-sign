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

cd digital-sign-engine

mvn clean install

cd ..

cd digital-sign-config-server

mvn clean package docker:build

cd ..

cd digital-sign-demo

mvn clean package docker:build

cd ..

cd digital-sign-eureka

mvn clean package docker:build

cd ..

cd digital-sign-gateway

mvn clean package docker:build

cd ..

cd digital-sign-service/keystore-worker

mvn clean package docker:build

cd ../..

cd digital-sign-service/pdf-worker

mvn clean package docker:build

cd ../../
