FROM openjdk
MAINTAINER ls "626292171@qq.com"
COPY target/apollo-demo.jar /usr/local/jar/app.jar

EXPOSE 8090
CMD ["java", "-jar", "/usr/local/jar/app.jar"]