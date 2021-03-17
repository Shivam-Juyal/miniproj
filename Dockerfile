From openjdk:8
MAINTAINER Shivam Juyal  shivam.govind@iiitb.org
COPY ./target/miniproject-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "miniproject-1.0-SNAPHOT.jar"]
