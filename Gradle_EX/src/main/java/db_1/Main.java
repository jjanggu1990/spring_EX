package db_1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("db_Ex.xml");

		jdbcDao dao = context.getBean("jdbcDao2",jdbcDao.class);
		//dao.insertMember();
		List<User> mem = dao.selectAll();
		for(User user : mem){
			System.out.print(user.getMemberid()+", ");
			System.out.print(user.getPassword()+", ");
			System.out.print(user.getName()+", ");
			System.out.print(user.getEmail()+"\n");
		}
		System.out.println("END!!");
		System.out.println(dao.selectOne().getMemberid());
		System.out.println("¸î°³³Ä? "+dao.countMember());
	}

}

