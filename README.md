# Spring-Demo

#In this I've Created a Demo On  Basic Spring Application

#How to use @RequestBody and @ResponseBody Annotations in Spring


As the name suggest @RequestBody annotation is used to parse the incoming HTTP request while @ResponseBody annotation is used to convert your object into HTTP response in the form client is expecting like JSON, XML, or simply text. This is the basic, now let's look at these two annotations in detail. 



#1. @RequestBody annotation


The @RequestBody annotation links the HTTPRequest body to the domain object, in layman's words. Using HTTP Message Converters, the Spring framework automatically de-serializes incoming HTTPRequests and converts them to Java objects.

 To resolve the method argument based on the content type of the request, we send the body of the request via a HttpMessageConverter. If the preceding definitions appear confusing, the @RequestBody annotation allows us to get the request's content and transform it into a Java Object automatically.


Let's look at the procedure of registering a cricket player as an example.

For registration, API requires cricketer data.
The system will transmit cricketer data via HTTPRequest body if the cricketer fills out the whole registration form.


So, let's explain in terms of code

Below is our data model.


<img width="284" alt="image" src="https://user-images.githubusercontent.com/71483322/223324780-7f8f15ce-2ff9-4f19-a90a-ee924ce7c370.png">


Now, let's create a controller and explain where exactly @RequestBody annotation is used.

<img width="508" alt="image" src="https://user-images.githubusercontent.com/71483322/223324922-8741f5e4-c506-4c4d-89d7-6e9dd9409c09.png">

If a suitable Java type is given, Spring will automatically deserialize the JSON and convert it into a Java object much like we manually do using Jackson or Gson as explained here. As seen in the code above, the Registration object is annotated with @RequestBody which means the PostRequest has a body that contains the JSON format of the Registration object which is captured as a parameter by method register via our @RequestBody annotation. 

Java will automatically deserialize the incoming JSON into a Registration object if the JSON is valid and as per the Object naming conventions. 

This all is done by our annotation.

If we test our application via postman or any other client and pass the below data as body,

<img width="317" alt="image" src="https://user-images.githubusercontent.com/71483322/223325031-0b49efe5-cbbe-4f04-ab7b-e8c4308281c2.png">

