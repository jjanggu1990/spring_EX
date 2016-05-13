package configuTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Bar {
	private Foo foo;
	
	@Required
	@Autowired
	@Qualifier("action")
	public void setFoo(Foo foo){
		this.foo = foo;
	}
	
	@Bean(name="scottFoo")
	public Foo activeFoo(){
		Foo foo = new Foo();
		foo.setName("scott");
		return foo;
	}
	
	public void doBar(){
		foo.doFoo();
	}
}
