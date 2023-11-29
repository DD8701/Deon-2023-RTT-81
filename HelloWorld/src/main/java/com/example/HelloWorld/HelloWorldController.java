package com.example.HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
	@GetMapping({"/showview"})
	public String sendDatatwo (Model model)
	{
	   String message= "Perscholas ! We are Learning Thymeleaf";
	   //  log.warn(u.toString());
	   model.addAttribute("myvar", message);
	   return "myview";
	 }

}
