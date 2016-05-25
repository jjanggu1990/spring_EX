package spring.mybatis.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import spring.dto.FileDto;

@Controller
public class FileController {
	
	@Autowired
	Mybatis_Dao dao;
	@Autowired
	FileDto dto;
	
	public void setDto(FileDto dto) {
		this.dto = dto;
	}

	public void setDao(Mybatis_Dao dao) {
		System.out.println("FileController.setDao");
		this.dao = dao;
	}
	
	@RequestMapping(value = "/report/form.do", method = RequestMethod.GET)
	public String form() {
		return "file/submissionForm";
	}

	@RequestMapping(value = "/report/submit.do", method = RequestMethod.POST)
	public String submitReport1(@RequestParam("report") MultipartFile report, Model model 
			) {
		dto = upload(report);
		dao.insertFile(dto);
		model.addAttribute("dto", dto);
		return "file/submissionComplete";
	}

	

	public FileDto upload(MultipartFile report){
		
		String o_name =report.getOriginalFilename();
		dto.setName(o_name);
		long now = System.currentTimeMillis();
		o_name = now + o_name;
		File new_file = new File("c://upload//"+o_name); 
		try {
			report.transferTo(new_file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dto.setPath(new_file.getPath());
		dto.setFilesize(new_file.length());
		
		return dto;
	}
	
}
