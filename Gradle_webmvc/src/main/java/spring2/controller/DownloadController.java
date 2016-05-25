package spring2.controller;

import java.io.File;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DownloadController implements ApplicationContextAware {

	private WebApplicationContext context = null;

	@RequestMapping("/file")
	public ModelAndView download(@RequestParam("filename") String name) throws Exception {
		File downloadFile = getFile(name);
		System.out.println("name 잘 넘어오나? : "+name);
		return new ModelAndView("download", "downloadFile", downloadFile);
	}
	
	private File getFile(String name) {
		String path = context.getServletContext().getRealPath(
				//"/WEB-INF/설명.txt");
				"/img/"+name);
		System.out.println("path는 : "+path);
		return new File(path);
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.context = (WebApplicationContext) applicationContext;
	}
	
}