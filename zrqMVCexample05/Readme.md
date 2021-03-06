Simple MVC example.
This example shows different ways to map beans to URLs with xxxx-servlet.xml

- created using Dynamic Web Project
- with web.xml (servlet v3.1)
- with xxxx-servlet.xml
- adds value to model variable

I can call it like this
http://localhost:8080/zrqMVCexample05/hello.htm
http://localhost:8080/zrqMVCexample05/helloWorld.htm
http://localhost:8080/zrqMVCexample05/welcome.htm

We have inside this project different alternatives to map
beans to URLs

1) Mapping with BeanNameUrlHandlerMapping
This mapping allows us to map a bean using string wildcards 

2) Mapping with ControllerClassNameHandlerMapping
In Spring MVC, ControllerClassNameHandlerMapping use convention to map requested URL to Controller (convention over configuration). It takes the Class name, remove the ‘Controller’ suffix if exists and return the remaining text, lower-cased and with a leading “/”.

3) Mapping with ControllerClassNameHandlerMapping
Similar to 2) but this time I'm setting case_sensitive = true
this means for example hello.htm will work, but Hello.html won't.
Moreover, the prefix property allow us to prefix the URL.
The example with "customer" will make the URL to work like this instead:
http://localhost:8080/zrqMVCexample05/customer/hello.htm

4) Mapping with SimpleUrlHandlerMapping
SimpleUrlHandlerMapping class helps to explicitly map URLs with their controllers respectively
