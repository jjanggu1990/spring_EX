package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FindPasswordFormController {

	@RequestMapping("/FindPasswordForm.do")
	private String find(){
		return "view/FindPasswordForm";
	}
	
}
