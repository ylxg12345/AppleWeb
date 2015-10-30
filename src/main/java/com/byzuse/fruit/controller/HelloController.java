package com.byzuse.fruit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Calendar;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}


	@RequestMapping(value = "/date", method = RequestMethod.GET)
	public String printCalendar(ModelMap model) {

		Calendar cal = Calendar.getInstance();

		model.addAttribute("date", cal.getTime());

		return "calendar";
	}
}