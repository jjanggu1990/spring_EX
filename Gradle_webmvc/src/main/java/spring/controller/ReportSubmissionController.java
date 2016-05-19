package spring.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import spring.service.ReportCommand;

@Controller
public class ReportSubmissionController {

	@RequestMapping(value = "/report/submission.do", method = RequestMethod.GET)
	public String form() {
		return "report/submissionForm";
	}

	@RequestMapping(value = "/report/submitReport1.do", method = RequestMethod.POST)
	public String submitReport1(@RequestParam("studentNumber") String studentNumber,
			@RequestParam("report") MultipartFile report) {
		
		FileOutputStream fos =null;
		
		try {
			byte[] b= report.getBytes();
			fos = new FileOutputStream("F://image_tmp//"+report.getOriginalFilename());
				fos.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
				try {
					fos.close();
				} catch (IOException e) {
				}
		}
		printInfo(studentNumber, report);
		return "report/submissionComplete";
	}

	private void printInfo(String studentNumber, MultipartFile report) {
		System.out.println(studentNumber + "가 업로드 한 파일: " + report.getOriginalFilename());
	}

	@RequestMapping(value = "/report/submitReport2.do", method = RequestMethod.POST)
	public String submitReport2(MultipartHttpServletRequest request) {
		String studentNumber = request.getParameter("studentNumber");
		MultipartFile report = request.getFile("report");
		printInfo(studentNumber, report);
		
		FileOutputStream fos =null;
		InputStream is = null;
		try {
			is = report.getInputStream();
			System.out.println("가용 크기 : "+is.available());
			fos = new FileOutputStream("F://image_tmp//"+report.getOriginalFilename());
			byte []b = new byte[is.available()];
			
			int read=0;
			while((read=is.read(b))!= -1){
				fos.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
				try {
					fos.close();
				} catch (IOException e) {
				}
		}
		
		return "report/submissionComplete";
	}

	@RequestMapping(value = "/report/submitReport3.do", method = RequestMethod.POST)
	public String submitReport3(ReportCommand reportCommand,HttpServletRequest request) {
		printInfo(reportCommand.getStudentNumber(), reportCommand.getReport());
		
		String contextpath = request.getSession().getServletContext().getRealPath("/img");
		
		System.out.println(contextpath +"//"+ reportCommand.getReport().getOriginalFilename());
		File f = new File("F://image_tmp//"+reportCommand.getReport().getOriginalFilename());
		//File f1 = new File(contextpath +"//"+reportCommand.getReport().getOriginalFilename());
		
		try{
			reportCommand.getReport().transferTo(f);
			//reportCommand.getReport().transferTo(f1);
		}catch(Exception e){
			
		}
		
		return "report/submissionComplete";
	}

}