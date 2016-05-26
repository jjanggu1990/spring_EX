package spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mybatis.UserInfoDAO;
import spring.model.UserInfoCommand;

@Controller
public class LoginProController {
	
	@Autowired
	UserInfoDAO dao;

	public void setDao(UserInfoDAO dao) {
		this.dao = dao;
	}
	
	
	@RequestMapping("/LoginPro.do")
	private ModelAndView login(@ModelAttribute("logininfo") UserInfoCommand info, HttpSession session){
		ModelAndView mv = new ModelAndView("view/TEST");
		//result�� 1�̸� �α��� ���� 0�̸� ����
		int result = dao.login(info);
		if(result==1){
			session.setAttribute("memId", info.getEmail());
			return mv;
		}else{
			session.setAttribute("memId", null);
			return mv;
		}
		
	}
}
