FROM openjdk:17-jdk as build

# compile app
WORKDIR /java/src/app
ADD . /java/src/app
RUN ./gradlew build

# Now copy it into our base image.
FROM openjdk:17-jdk
COPY --from=build /java/src/app/build/libs/buysellhold-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

