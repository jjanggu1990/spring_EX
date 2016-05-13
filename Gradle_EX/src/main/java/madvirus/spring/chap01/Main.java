package madvirus.spring.chap01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import DI_pattern.Foo;

@SuppressWarnings("deprecation")
public class Main {

/*	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		WriteArticleService articleService = (WriteArticleService) beanFactory.getBean("writeArticleService");
		articleService.write(new Article());
	}*/
	public static void main(String [] args){
		AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		Foo f = context.getBean("foo", Foo.class);
//		context.registerShutdownHook();
		context.destroy();
		Foo f1= context.getBean("foo", Foo.class);
		f1.doBar();
	}
}