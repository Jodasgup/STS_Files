package com.mvc.controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.ui.ModelMap;

	@Controller
	@RequestMapping("/")
	public class HomeController {

	    @RequestMapping(method = RequestMethod.GET)
	    public String index(ModelMap model){
	        model.addAttribute("message", "Spring MVC XML Config Example");
	        System.out.println("This is home");
	        return "index";
	    }
	    
	 
	    
	    @RequestMapping("/helloWorld")
	    public String helloWorld() {
	    	System.out.println("This is HelloWorld controller");
	    	return "helloWorld";
	    }

	}


