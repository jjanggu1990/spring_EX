package annoTest;

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
	@PostConstruct
	public void start(){
		System.out.println("Foo.start");
	}
	@PreDestroy
	public void stop(){
		System.out.println("Foo.stop");
	}
}
