FROM java:8-jdk-alpine
MAINTAINER  Juan Alberto Resendiz Arteaga <jresendiz27@gmail.com>
VOLUME /opt
COPY ../libs/SIIPG_Reports-*.war ./SIIPG_Reports.war
EXPOSE 8080
# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
CMD ["java", "-jar" ,"./SIIPG_Reports.war"]