package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need a controller method to sho the initial html from
	@RequestMapping("/showForm")
	public String showForm() {
		
		return "helloworld-form";
	}
	//need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	@RequestMapping("/processFormV2")
	public String LetsShoutDude(HttpServletRequest request,Model model)
	{
		//read the request parameter from the html form
		String theName=request.getParameter("studentName");
	
		// convert the data to all caps
	    theName=theName.toUpperCase();	
		//create the message
		String result="yo!" + theName;
		//add message to the model
		model.addAttribute("message",result);
	  return "helloworld";	
	}
	
	@RequestMapping("/processFormV3")
	public String processFormV3(@RequestParam("studentName") String theName,Model model)
	{
	
		// convert the data to all caps
	    theName=theName.toUpperCase();	
		//create the message
		String result="yo! bitch  "  + theName;
		//add message to the model
		model.addAttribute("message",result);
	  return "helloworld";	
	}
	
}
