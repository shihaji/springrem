package com.cts;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	LoginDao loginDao;
	
	@GetMapping("register")
	public String regForm(@ModelAttribute Employee employee) {
		
		
		return "register";
	}

	@PostMapping("registerEmp")
	public ModelAndView empReg(@ModelAttribute @Valid Employee employee,BindingResult result) {
	
		ModelAndView mv=new ModelAndView();
		
		if(result.hasErrors()) {
			mv.setViewName("register");
		}else if(loginDao.registerEmp(employee)) {
			mv.addObject("key","Employee registered successfully");
			mv.setViewName("home");
		}else {
			mv.addObject("key","Id already exist");
			mv.setViewName("register");
		}
		    
		
		return mv;
	}
	
}
