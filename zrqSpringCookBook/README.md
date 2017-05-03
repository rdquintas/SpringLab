# zrqSpringCookBook
......
## Aspect Oriented Programming (AOP)

Project | Information
--- | ---
[zrq.com.aop.aspectj.annotationbased1](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/aop/aspectj/annotationbased1) | This example shows how to Spring Aspect Oriented Programming using AspectJ
[zrq.com.aop.aspectj.annotationbased2](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/aop/aspectj/annotationbased2) | This example shows how to Spring Aspect Oriented Programming ANNOTATION based 
[zrq.com.aop.aspectj.xmlbased](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/aop/aspectj/xmlbased) | This example shows how to Spring Aspect Oriented Programming using AspectJ without annotation, but instead XML Based config
[zrq.com.aop.example1](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/aop/example1) | This example shows how to Spring Aspect Oriented Programming. We use different combination on the XML config.
[zrq.com.aop.example2](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/aop/example2) | This example shows how to Spring Aspect Oriented Programming Here we define: Pointcut, Advice, Advisor. And we target a specific method - printName() - this time.
[zrq.com.aop.example3](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/aop/example3) | This example shows how to Spring Aspect Oriented Programming. But instead of creating proxy beans manually, I use here Auto Proxy Mechanism. In auto proxy mechanism, you just need to create a BeanNameAutoProxyCreator, and include all your beans (via bean name, or regular expression name) and "advisor" into a single unit. 
[zrq.com.aop.xmlbased](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/aop/xmlbased) | This example shows how to Spring Aspect Oriented Programming XML based


## Beans

Project | Information
--- | ---
[zrq.com.beans.annotation.autowired](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/annotation/autowired) | This example shows how to handle the annotation @Autowired
[zrq.com.beans.annotation.configuration1](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/annotation/configuration1) | This example shows alternative (JAVA based) to the XML config.
[zrq.com.beans.annotation.configuration2](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/annotation/configuration2) | This example shows alternative (JAVA based) to the XML config using Bean Injection 
[zrq.com.beans.annotation.qualifier](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/annotation/qualifier) | This example shows how to handle the annotation @Qualifier
[zrq.com.beans.annotation.required](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/annotation/required) | This example shows how to handle the annotation @Required
[zrq.com.beans.autowiring.byname](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/autowiring/byname) | This example show Dependency Injection SETTER/GETTER based
[zrq.com.beans.config.javabased](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/config/javabased) | Simple example with JAVA based Config beans creation
[zrq.com.beans.config.javabased.importconfig](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/config/javabased/importconfig) | Simple example with JAVA based Config beans creation. But this time with MULTIPLE import configs
[zrq.com.beans.dependency](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/dependency) |  
[zrq.com.beans.events.custom](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/events/custom) | This example shows how to Spring CUSTOM events
[zrq.com.beans.events.spring](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/events/spring) | This example shows how to Spring STANDARD built-in events
[zrq.com.beans.injection.constructor](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/injection/constructor) | This example show Dependency Injection CONSTRUCTOR based
[zrq.com.beans.injection.settergetter](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/injection/settergetter) | This example show Dependency Injection SETTER/GETTER based
[zrq.com.beans.validator](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/beans/validator) | This example uses Validator to validade beans


## Hibernate

Project | Information
--- | ---
[zrq.com.hibernate.example1](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/hibernate/example1) | Simple HIBERNATE example. Uses Hibernate config XML. If table doesn't exist, it will be created automatically. No need to run CREATE TABLE sql, before 1st app run.
[zrq.com.hibernate.example2](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/hibernate/example2) | Simple HIBERNATE example. Uses simple mapping XML config file. NO Hibernate config XML. Everything is done by code. It is necessary to run SQL before app 1st run
[zrq.com.hibernate.example3](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/hibernate/example3) | CRUD example HIBERNATE. JDBC properties file. Uses MySQL. Very complete example
[zrq.com.hibernate.example4](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/hibernate/example4) | CRUD example HIBERNATE with JPA. JDBC properties file. Uses MySQL. Very complete example


## JDBC

Project | Information
--- | ---
[zrq.com.jdbc.example1](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/jdbc/example1) | Simple JDBC example using DAO with JdbcTemplate
[zrq.com.jdbc.example2](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/jdbc/example2) | Simple JDBC example using DAO without JdbcTemplate
[zrq.com.jdbc.example3](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/jdbc/example3) | Simple JDBC example using DAO with JdbcTemplate using queryAll, find by ID, total lines, etc..
[zrq.com.jdbc.example4](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/jdbc/example4) | Simple JDBC example using DAO with JdbcTemplate using BATCH insert and update
[zrq.com.jdbc.example5](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/jdbc/example5) | Simple JDBC example using DAO with JdbcTemplate, EMBEDDED database HSQLDB, .sql scripts to create schema and data
[zrq.com.jdbc.example6](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/jdbc/example6) | Simple JDBC example using DAO with JdbcTemplate, EMBEDDED database HSQLDB, .sql scripts to create schema and data. Very complete example


## Files and Resources (.properties)

Project | Information
--- | ---
[zrq.com.properties.file](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/properties/file) | This examples shows how to read and map values from a .properties file
[zrq.com.properties.file2](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/properties/file2) | This examples shows how to read and map values from a .properties file. But I'm using XML config to define the location of the .properties file this time
[zrq.com.resource.txtfile](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/resource/txtfile) | This examples shows how to read a TXT file using getResource


## Spring Expression Language (SpEL)

Project | Information
--- | ---
[zrq.com.spel.annotationbased](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/spel/annotationbased) | This example shows SPEL (Spring Expression Language) with bean injection ANNOTATION based
[zrq.com.spel.annotationbased2](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/spel/annotationbased2) | This example shows SPEL (Spring Expression Language) method invocation example
[zrq.com.spel.annotationbased3](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/spel/annotationbased3) | This example shows SPEL (Spring Expression Language) Operators example
[zrq.com.spel.annotationbased4](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/spel/annotationbased4) | This example shows SPEL (Spring Expression Language) ternary operator (if-then-else) example
[zrq.com.spel.annotationbased5](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/spel/annotationbased5) | This example shows SPEL (Spring Expression Language) Lists, Maps example
[zrq.com.spel.annotationbased6](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/spel/annotationbased6) | This example shows SPEL (Spring Expression Language) using REGEX (Regular Expressions)
[zrq.com.spel.annotationbased7](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/spel/annotationbased7) | This example shows SPEL (Spring Expression Language) using ExpressionParser
[zrq.com.spel.xmlbased](https://github.com/rdquintas/SpringLab/tree/master/zrqSpringCookBook/src/main/java/zrq/com/spel/xmlbased) | This example shows SPEL (Spring Expression Language) with bean injection XMLbased
 
