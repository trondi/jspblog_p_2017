package iducs.spring.blog201712043;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import iducs.spring.blog201712043.service.ExeTimeAspectServiceImpl;
import java.text.DateFormat;
import java.util.Date;
import iducs.spring.blog201712043.domain.Blog;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private ExeTimeAspectServiceImpl aspectService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date= new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);

		Blog b = new Blog();
		b.setId(1); b.setTitle("title"); b.setContent("content");

		aspectService.executeMethodAtJoinpoint(10, b);
		return "home";
		}
	
	/*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "redirect:/main/home"; // �??��?�� URL 리다?��?��?�� ?���?
	}

	@RequestMapping(value = "/main/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "/main/index";
	}*/

}
