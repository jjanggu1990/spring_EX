package spring2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mybatis.FileInfoDAO;
import spring.model.FileInfo;

@Controller
public class DownloadListController {
	
	@Autowired
	private FileInfoDAO dao;
	
	public void setDao(FileInfoDAO dao) {
		this.dao = dao;
	}
	
	
	@RequestMapping("/list")
	public ModelAndView list(){
		ModelAndView mv = new ModelAndView("download_list");
		
		ArrayList <FileInfo> list = (ArrayList<FileInfo>) dao.selectAllFileInfo();
		
		mv.addObject("list", list);
		return mv;
	}
}
