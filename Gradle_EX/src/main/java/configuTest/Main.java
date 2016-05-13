package configuTest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("annoTest.xml");
		
		Bar bar = context.getBean("bar", Bar.class);
		bar.doBar();
		
		Foo scott = context.getBean("scottFoo", Foo.class);
		System.out.println(scott.getName());
		context.registerShutdownHook();
		
		Foo tiger = context.getBean("foo1",Foo.class);
		System.out.println(tiger.getName());

	}

}
