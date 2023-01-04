#Author Lorenzo Lince
#Shell Script automates the spring boot app docker build
#!/bin/bash
mvn clean install
docker build --tag=automation-ah .
