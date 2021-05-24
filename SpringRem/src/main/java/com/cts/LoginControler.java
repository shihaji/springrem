package com.cts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginControler {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("login")
	public String showIndex() {
		
		return "index";
	}
	
	@PostMapping("loginControl")
	public String loginUser(@RequestParam String name,@RequestParam String password,Model model) {
		
		if(loginService.validateUser(name, password)) {
		
		return "home";
		}else {
			model.addAttribute("error","bad credential");
			return "index";
		}
		
	}

	
	
}
