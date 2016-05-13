package db_2_mybatis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = new GenericXmlApplicationContext("mybatis.xml");

		ZipcodeDAO dao = context.getBean("zdao",ZipcodeDAO.class);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("입력해봐 주소");
		String area4 = in.readLine();
		List<Zipcode> zip = dao.selectAllZip(area4);
		
		for(Zipcode area : zip){
			System.out.println(area.toString());
		}
		System.out.println("END!!");

	}
}
