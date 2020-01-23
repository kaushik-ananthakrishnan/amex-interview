# HR System

Api Documentation
- API version: 1.0
  - Build date: 2020-01-21T12:35:15.375+05:30

Api Documentation

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## HR Service testing

To test the service run the following commands:
```shell
cd amex-interview/hrsystem/hrs-parent/
mvn clean install
java -jar hrs-service/target/hrs-service-1.0.0-SNAPSHOT.jar
```
The above commands will compile, deploy and start the application. You can hit the below url to validate whether you are getting response from the server.
```shell
http://localhost:8090/hrs/v1/employees/1
```

The application DB is inserted with the following records on load
```shell
INSERT INTO EMPLOYEE (NAME, TITLE, MANAGER_ID) VALUES ('Kaushik', 'Ananthakrishnan', NULL);
INSERT INTO EMPLOYEE ( NAME, TITLE, MANAGER_ID) VALUES ('Jeff', 'Bezos', 1);
INSERT INTO EMPLOYEE (NAME, TITLE, MANAGER_ID) VALUES ('Bill', 'Gates', 1);
```

This will create 3 Employee records of which the client only knows about employee of id 1 which produces the following json:
```shell
{
    "id": 1,
    "name": "Kaushik",
    "title": "Ananthakrishnan",
    "reports": [
        {
            "id": 2,
            "name": "Jeff",
            "title": "Bezos",
            "reports": []
        },
        {
            "id": 3,
            "name": "Bill",
            "title": "Gates",
            "reports": []
        }
    ]
}
```

You can also check the api documentation in swagger by hitting the below url
```shell
http://localhost:8090/hrs/swagger-ui.html
```

## HR Client testing

You can add the following dependency to your application to test the HR client
```shell
<dependency>
    <groupId>com.amex.interview.hrs</groupId>
    <artifactId>hrs-client</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

There is a sample client test application which uses the HR client for fetching the employee record in the github url mentioned below
```shell
https://github.com/kaushik-ananthakrishnan/sample-hrs-consumer/blob/master/hrs-client-test/src/main/java/com/amex/hrs/hrsclienttest/HrsClientTestApplication.java
```