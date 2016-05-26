package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mybatis.UserInfoDAO;

@Controller
public class UserInsertFormController {
	
	@RequestMapping("/UserInsertForm.do")
	private String input(){
		return "view/UserInsertForm";
	}
}
