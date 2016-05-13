package configuTest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Foo {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void doFoo(){
		System.out.println("foo.doFoo");
	}
	//积己磊 流饶
	@PostConstruct
	public void start(){
		System.out.println("Foo.start");
	}
	//家戈 流傈
	@PreDestroy
	public void stop(){
		System.out.println("Foo.stop");
	}
}
