package madvirus.spring.chap01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import DI_pattern.Foo;

public class Main_DI {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		//WriteArticleService articleService = (WriteArticleService) context.getBean("writeArticleService");
		//Foo f = context.getBean("foo1",Foo.class);
		Foo f = context.getBean("foo3",Foo.class);
		
		f.doBar();
	}
/*	public static void main(String[] args) {
		Article articledao = new Article();
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		//WriteArticleService articleService = (WriteArticleService) context.getBean("writeArticleService");
		//Foo f = context.getBean("foo1",Foo.class);
		WriteArticleServiceImpl f = context.getBean("WriteArticleServiceImpl",WriteArticleServiceImpl.class);
	}*/

}
