package madvirus.spring.chap01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForAop {

	public static void main(String[] args) {
		String[] configLocations = new String[] { "applicationContext.xml", "commonConcern.xml" };
		//ApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		ApplicationContext context = new GenericXmlApplicationContext(configLocations);
		WriteArticleService articleService = (WriteArticleService) context.getBean("writeArticleService");
		articleService.write(new Article());
	}
}