# Oauth2Secure-microservices-architecture-apiGateway-springCloud-netflixOSS-PostgreSQL-full-demo
<b>Introduction:</b>

I wanted a solution where we can easily captured Oauth2 and Oauth2 client for the secure communication with all of the microservices. Focusing, how to achieve oauth2 full flavor into microservices architecture. User can’t access API without token. The token will be available when user given basic and authentication details to generate token for access API.  All requests will consider one entry point API-Gateway but, service-to-service can communicate. The API-Gateway will dynamic routing using Zuul Netflix OSS component.  Every request will check authorization when request will arrived into service and service will request authorization server to verify is either authenticate or not. The entire Meta configuration settled into the central configuration on github (You can manage on any repository).  

<pre>
Goal:
-	Achieve authentication/authorization based on Spring security, Oauth2, Oauth2 client
-	Understanding microservices architecture using Spring Cloud, Netfllix OSS.
-	 Demonstration of microservice architecture based on Java and Spring
</pre>

What are Microservices?
Microservices is a service-oriented architecture pattern where in applications are built as a collection of various smallest independent service units. It is a software engineering approach which focuses on decomposing an application into single-function modules with well-defined interfaces. These modules can be independently deployed and operated by small teams who own the entire lifecycle of the service. 
The term "micro" refers to the sizing of a microservice which must be manageable by a single development team (5 to 10 developers). In this methodology, big applications are divided into.

<pre>
Technology Stack: 
1.	Java 8+
2.	Spring Latest
3.	Spring security
4.	Oauth2, Oauth2 Client
5.	Spring Cloud
6.	Netflix OSS
7.	PostgreSQL
8.	IntliJ
</pre>
