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

docker run -e "JAVA_OPTS=-agentlib:jdwp=transport=dt_socket,address=8000,server=y,suspend=n" -p 8000:8000 -p 8080:8080 --name sign-demo liumapp/digital-sign-demo:v1.0.0 --hostname sign-demo




