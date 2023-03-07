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

#############################################################################################
 
 @ModelAttribute is used for binding data from request param (in key value pairs),

but @RequestBody is used for binding data from whole body of the request like POST,PUT.. request types which contains other format like json, xml.

##############################################################################################


Spring automatically converts receiving JSON data in the HTTPRequestBody to the Registration java object, as seen in this example.


#2. @ResponseBody annotation in Spring MVC

To put it another way, @ResponseBody instructs the Spring framework to serialize a return object into JSON or XML and return it as part of the HTTPResponse.

When interacting with the REST API in Spring 4.x, we should use @RestController on a class level rather than @ResponseBody on a method level.

@RestController is a constructed annotation with @Controller and @ResponseBody that is itself a meta-annotation.

In the previous example, our register function returns a Cricketer object, which we want to deliver in the HTTPResponse as JSON.

We may still specify the content type that our function returns when we use the @ResponseBody annotation.

The generated property of the @RequestMapping may be used for this. Note that annotations like @PostMapping, @GetMapping, etc. define aliases for that parameter.


As seen in our controller below, we have @RestController annotation so we don't need @ResponseBody anymore. The @RestController will automatically add @ResponseBody when needed. 

<img width="524" alt="image" src="https://user-images.githubusercontent.com/71483322/223327229-76a0bf68-5187-4d94-a355-1e78ce7a4284.png">

But, if @RestController for any reason could not be annotated at the class level, we can anyways use @ResponseBody as shown below.

<img width="488" alt="image" src="https://user-images.githubusercontent.com/71483322/223327308-6e59c88a-e7ed-4c2d-a1d1-f3f925700a5e.png">


As shown above, we dictate that we are sending back the Cricketer object as a response. With @ResponseBody annotation, java automatically serializes it into JSON and sends it back.

![image](https://user-images.githubusercontent.com/71483322/223327395-e47db9cf-2e52-4534-ad15-fc425fdcfa07.png)

That's all about how to use Spring @RequestBody and @ResponseBody annotations in Java and Spring MVC. These annotations are crucial when using Spring and 

Spring Boot to develop our REST API. You can use them for parsing request data into your domain object as well as converting your domain object to HTTP response in

the format your client wants like JSON, XML or TEXT. If you use @RestContorller which you should then you don't need to explicitly use @RequestBody and 

@ResponseBody, its already taken care. 

