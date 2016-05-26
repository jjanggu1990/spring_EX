package spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import mybatis.UserInfoDAO;
import spring.model.UserInfoCommand;

@Controller
public class UserModifyProController {
	@Autowired
	UserInfoDAO dao;
	
	public void setDao(UserInfoDAO dao){
		this.dao = dao;
	}
	
	@RequestMapping("/UserModifyPro.do")
	private String modify(@ModelAttribute("userinfo") UserInfoCommand info, HttpSession session){
		dao.modyfyUserInfo(info);
		
		return "view/TEST";
	}
}
