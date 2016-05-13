package db_2_mybatis;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context =
				new GenericXmlApplicationContext("mybatis.xml");

		MemberDAO dao = context.getBean("dao",MemberDAO.class);
		List<User> mem = dao.selectAllMem();
		
		for(User user : mem){
			System.out.println(user);
		}
		System.out.println("END!!");
		
		/*int x = dao.insertMem();
		if(x != 0){
			System.out.println( "insert OK!!");
		}*/
	}

}

