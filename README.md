# Spring-Demo

#In this I've Created a Demo On  Basic Spring Application

#How to use @RequestBody and @ResponseBody Annotations in Spring


As the name suggest @RequestBody annotation is used to parse the incoming HTTP request while @ResponseBody annotation is used to convert your object into HTTP response in the form client is expecting like JSON, XML, or simply text. This is the basic, now let's look at these two annotations in detail. 



##1. @RequestBody annotation
The @RequestBody annotation links the HTTPRequest body to the domain object, in layman's words. Using HTTP Message Converters, the Spring framework automatically de-serializes incoming HTTPRequests and converts them to Java objects.

 To resolve the method argument based on the content type of the request, we send the body of the request via a HttpMessageConverter. If the preceding definitions appear confusing, the @RequestBody annotation allows us to get the request's content and transform it into a Java Object automatically.


Read more: https://javarevisited.blogspot.com/2022/08/how-to-use-requestbody-and-responsebody.html#ixzz7vFF5eupW
