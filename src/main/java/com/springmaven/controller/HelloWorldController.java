/**
 * 
 */
package com.springmaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloWorldController {

	
	@RequestMapping("/hello")
	public String SayHello(@RequestParam(value="name",defaultValue="satish",required=false) String name,Model model){
		
		model.addAttribute("name", name);
		return "hello";
	}
}
