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
cd hrsystem/hrs-parent/
mvn clean install
java -jar hrs-service/target/hrs-service-1.0.0-SNAPSHOT.jar
```
The above commands will compile, deploy and start the application. You can hit the below url to validate whether you are getting response from the server.
```shell
http://localhost:8090/hrs/v1/employees/1
```

The application DB is pre-loaded with the below employee record
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
http://localhost:8090/hrs/swagger-ui.html
```