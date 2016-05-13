package db_1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("db_Ex.xml");

		jdbcDao dao = context.getBean("jdbcDao",jdbcDao.class);
		List<User> mem = dao.selectAll();
		
		for(User user : mem){
			System.out.println(user);
		}
		System.out.println("END!!");
		
	}

}

