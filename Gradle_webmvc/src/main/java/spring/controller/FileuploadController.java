package spring.controller;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import mybatis.FileInfoDAO;
import spring.model.FileInfo;

@Controller
public class FileuploadController {
	
	@Autowired
	FileInfoDAO dao;
	
	public void setDao(FileInfoDAO dao) {
		this.dao = dao;
	}

	public FileInfoDAO getDao() {
		return dao;
	}

	@RequestMapping("/fileupload/fileupload_form.do")
	public String form() {
		return "fileupload/upload_form";
	}

	@RequestMapping(value = "/fileupload/fileupload.do", method = RequestMethod.POST)
	public String file_upload(@RequestParam("file1") MultipartFile info, HttpServletRequest request) {
		System.out.println("여긴 들어오나?");
		try {
			request.setAttribute("list", list());
			request.setAttribute("file1",upload(info,request));
			request.setAttribute("real_name", real_name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "fileupload/upload_list";
	}
	String real_name;
	private String upload(MultipartFile info,HttpServletRequest request) throws Exception{
		//학원 경로
		String path = "C://Users//user2//Documents//workspace-sts-3.7.3.RELEASE//Gradle_webmvc//src//main//webapp//img//";
		//String path = "C://Users//user2//Documents//workspace-sts-3.7.3.RELEASE//Gradle_webmvc//src//main//webapp//WEB-INF//views//fileupload//img//";
		//노트북 경로
		//String path = "C://Users//jin_notebook//Documents//workspace-sts-3.7.3.RELEASE//Gradle_webmvc//src//main//webapp//img//";
		String name = info.getOriginalFilename();
		real_name= System.currentTimeMillis()+name;
		String real_path= path+real_name;
		int size = info.getInputStream().available();
		
		FileInfo fileinfo = new FileInfo();
		fileinfo.setName(name);
		fileinfo.setPath(real_path);
		fileinfo.setFilesize(size);
		
		/*AbstractApplicationContext context = new GenericXmlApplicationContext("mybatis.xml");
		FileInfoDAO dao = (FileInfoDAO)context.getBean("dao");*/
		System.out.println("여기가 에런가??");
		int result = dao.insertFileInfo(fileinfo);
		System.out.println("real_path :: "+real_path);
		System.out.println("insert result :: "+result);
		
		File f = new File(real_path);
		String tmp_path = "C://Users//user2//Downloads//spring-tool-suite-3.7.3.RELEASE-e4.6-win32-x86_64//sts-bundle//pivotal-tc-server-developer-3.1.3.SR1//base-instance//wtpwebapps//Gradle_webmvc//img//";
		File f1 = new File(tmp_path+real_name);
		System.out.println("f1:: "+request.getSession().getServletContext().getRealPath("/")+"//"+real_name);
		info.transferTo(f);
		info.transferTo(f1);
//		context.close();
		return name;
	}
	
	ArrayList <FileInfo> array = null;
	private ArrayList<FileInfo> list() throws Exception{
		
		array = (ArrayList<FileInfo>)dao.selectAllFileInfo();
		
		
		return array;
	}
	
}
