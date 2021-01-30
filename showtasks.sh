#!/bin/bash

if /bin/bash ./runcrud.sh; then
  google-chrome http://localhost:8080/crud/v1/task/getTasks
else
  echo 'Error with deploying crud.war to tomcat9 server'
fi