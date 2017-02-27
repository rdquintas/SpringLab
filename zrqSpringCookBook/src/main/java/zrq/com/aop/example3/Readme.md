This example shows how to Spring Aspect Oriented Programming
But instead of creating proxy beans manually, I use here Auto Proxy Mechanism

In auto proxy mechanism, you just need to create a BeanNameAutoProxyCreator, and include all your beans 
(via bean name, or regular expression name) and ‘advisor’ into a single unit. 