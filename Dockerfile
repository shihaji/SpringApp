FROM public.ecr.aws/bitnami/java:latest
ADD target/springapp.jar springapp.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","springapp.jar"]