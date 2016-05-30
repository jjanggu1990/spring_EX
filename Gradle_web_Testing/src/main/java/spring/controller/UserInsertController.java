package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mybatis.UserInfoDAO;
import spring.model.UserInfoCommand;

@Controller
public class UserInsertController {
	@Autowired
	UserInfoDAO dao;

	public void setDao(UserInfoDAO dao) {
		this.dao = dao;
	}
	@RequestMapping("/UserInsertForm.do")
	private String input(){
		return "view/UserInsertForm";
	}
	@RequestMapping("/UserInsertPro.do")
	private ModelAndView input(@ModelAttribute("userinfo") UserInfoCommand info){
		ModelAndView mv = new ModelAndView("view/TEST");
		System.out.println(info.getEmail());
		//result�� 1�̾�� ���� �� ����
		int result = dao.insertUserInfo(info);
		if(result==1){
			System.out.println("�μ�Ʈ ���� ����(ȸ������)");
		}else{
			System.out.println("�μ�Ʈ ���� ���� ����(ȸ������)");
		}
		return mv;
	}
}
