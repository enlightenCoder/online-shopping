package net.chrisnet.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller   
public class PageController {
	
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web MVC");
		return mv;
	}
	
	@RequestMapping(value = {"/test"})
	public ModelAndView index2(@RequestParam(value = "msg", required = false) String msg) {
		if(msg == null) msg = "Hello World";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", msg);
		return mv;
	}

	@RequestMapping(value = {"/{name}"})
	public ModelAndView index3(@PathVariable(value = "name", required = false) String name) {
		if(name == null) name = "Hello World";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", name);
		return mv;
	}
}