package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller                   // Declaring this class is controller 
public class HomeController {
	
	@RequestMapping("/home")  // when we want to fire this method
	public String home()
	{
		System.out.println("----------hello this home url -------");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about page ");
		return "about";
	}
	
	@RequestMapping("Carier")
	public String carrier() {
		return "Carier";
	}

}
