# Hello World Sample App

### This is a simple hello world application which has the following dependencies

- Spring Web
- Spring Actuator
- Spring Cloud Eureka Client
- Spring cloud Config Client
  
The /message API of the application prints the value of "message" environment variable which can be retrieve from the Config Server. If it is not present, print "default".
