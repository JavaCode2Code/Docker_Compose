Docker Spring boot

docker ps -a 

docker pull mysql

docker build --tag =firstImage:latest .
#forward 8080 to 8081
docker run -p8080:8081 firstImage:latest

openjdk:17-oracle

docker exec -t -i 9ede90ac0241 bash
#stateless container#
docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=root -d mysql:latest

docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=root mysql:latest

docker exec -it mysql-container bash  -l

mysql -uroot -p
Enter password:
show schemas;
use testdb
create table
show tatable;
docker stop 2374edc38a9a
#stateful conatainer#
docker create -v  /var/lib/mysql --name mysqldata mysql/mysql-server:latest
docker run -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root --volumes-from mysqldata --name=mysqldb mysql/mysql-server:latest

