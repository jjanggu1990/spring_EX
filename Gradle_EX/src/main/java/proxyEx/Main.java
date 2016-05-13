package proxyEx;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("proxyEx.xml");
		
		GreetingServiceimpl gre=context.getBean("gre_test",GreetingServiceimpl.class);
		try{
		gre.sayHello("java");
		}catch(Exception e){
			
		}
		gre.sayGoodbye("python");
		
	}

}
