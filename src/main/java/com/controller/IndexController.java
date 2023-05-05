package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping({"/","/index"})
	public String indexPath(Model model) {
		System.out.println("IndexController.indexPath()");
		return "index";
	}

	@GetMapping("/show_page")
	public String showPath(Model model) {
		System.out.println("IndexController.showPath()");
		model.addAttribute("info", "my info");
		return "show_page";
	}

}
