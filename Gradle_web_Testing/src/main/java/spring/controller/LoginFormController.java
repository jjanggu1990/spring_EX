package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginFormController {
	@RequestMapping("/LoginForm.do")
	private String login(){
		return "view/LoginForm";
	}
}
