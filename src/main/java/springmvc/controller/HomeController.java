package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller                   // Declaring this class is controller 
public class HomeController {
	
	@RequestMapping("/home")  // when we want to fire this method
	public String home( Model model)
	{
		System.out.println("----------hello this home url -------");
		
		model.addAttribute("name","Swapnil Rajendra Take");
		model.addAttribute("Id","101");
		
		List <String> friend = new ArrayList<String>();
		friend.add("Swapnil");
		friend.add("pooja ");
		friend.add("abhijit");
		friend.add("Onkar");
		friend.add("shradhha");
		friend.add("rohit");
		model.addAttribute("f",friend);
		
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
