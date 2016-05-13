package annoTest;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Bar {
	private Foo foo;
	
	@Required
	//@Autowired
	@Resource(name="foo")
	public void setFoo(Foo foo){
		this.foo = foo;
	}
	public void doBar(){
		foo.doFoo();
	}
}
