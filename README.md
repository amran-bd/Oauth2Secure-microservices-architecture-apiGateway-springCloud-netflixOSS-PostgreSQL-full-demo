# Oauth2Secure-microservices-architecture-apiGateway-springCloud-netflixOSS-PostgreSQL-full-demo
Introduction:
I wanted a solution where we can easily captured Oauth2 and Oauth2 client for the secure communication with all of the microservices. Focusing, how to achieve oauth2 full flavor into microservices architecture. User can’t access API without token. The token will be available when user given basic and authentication details to generate token for access API.  All requests will consider one entry point API-Gateway but, service-to-service can communicate. The API-Gateway will dynamic routing using Zuul Netflix OSS component.  Every request will check authorization when request will arrived into service and service will request authorization server to verify is either authenticate or not. The entire Meta configuration settled into the central configuration on github (You can manage on any repository).  

Goal:
-	Achieve authentication/authorization based on Spring security, Oauth2, Oauth2 client
-	Understanding microservices architecture using Spring Cloud, Netfllix OSS.
-	 Demonstration of microservice architecture based on Java and Spring
