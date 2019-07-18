docker build -t mysql ./docker/mysql

mvn clean package

cp -f ./target/exam1-0.0.1-SNAPSHOT.jar ./docker/java/app.jar

docker build -t exam ./docker/java