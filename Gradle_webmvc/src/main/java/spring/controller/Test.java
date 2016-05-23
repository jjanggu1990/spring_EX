package spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test.do")
public class Test {
	
	@RequestMapping
	public String test(@ModelAttribute("command") Mo mo, HttpServletRequest request){
		System.out.println((String)mo.getMo());
		System.out.println((String)request.getParameter("name"));
		
		return "test";
	}

}
