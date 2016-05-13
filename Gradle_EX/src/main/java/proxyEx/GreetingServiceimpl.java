package proxyEx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("gre_test")
public class GreetingServiceimpl implements GreetingService {

	private String greeting;
	
	@Value("abc")
	public void setGreeting(String greeting){
		this.greeting=greeting;
	}
	public void sayHello(String name) throws Exception {
		System.out.println("sayHello: "+greeting+" : "+name);
		throw new Exception("강제 예외 발생");
	}
	public void sayGoodbye(String name) {
		System.out.println("sayGoodbye: "+greeting+" : "+name);
	}

}
