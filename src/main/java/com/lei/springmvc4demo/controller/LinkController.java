package com.lei.springmvc4demo.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinkController {
	
	private static final Logger logger = LoggerFactory.getLogger(LinkController.class);
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView mainPage() {
		logger.info("Welcome home! The client locale is {}.");
		
		
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("home");
	}
	
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
	
//	@RequestMapping(value="/team/add", method = RequestMethod.GET)
//	public ModelAndView indexPage() {
//		ModelAndView modelAndView = new ModelAndView("add-team-form");
//		modelAndView.addObject("team", new Team());
//		return modelAndView;
//	}
}
