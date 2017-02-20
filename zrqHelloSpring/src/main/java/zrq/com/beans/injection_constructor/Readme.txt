This example show Dependency Injection CONSTRUCTOR based

Please note that on this example I'm using this for my beans.xml
<property name="spellChecker" ref="spellChecker" />

You should note the difference in Beans.xml file defined in 
constructor-based injection and setter-based injection. 
The only difference is inside the <bean> element where we have 
used <constructor-arg> tags for constructor-based injection 
and <property> tags for setter-based injection.

Second important point to note is that in case you are passing 
a reference to an object, you need to use ref attribute of
<property> tag and if you are passing a value directly then you
should use value attribute.