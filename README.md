Docker Spring boot

docker ps -a 

docker pull mysql

docker build --tag =firstImage:latest .

docker run -p8080:8081 firstImage:latest

openjdk:17-oracle

docker exec -t -i 9ede90ac0241 bash

docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=root -d mysql:latest

docker exec it mysql-container bash -1
