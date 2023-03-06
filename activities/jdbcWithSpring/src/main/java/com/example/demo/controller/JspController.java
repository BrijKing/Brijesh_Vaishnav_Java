package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.jdbcClass;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class JspController {
	
	
	@RequestMapping("/index")
	public String firstPage() {
		return "index.jsp";
	}

	@RequestMapping("/register")
	public String registerPage() {
		return "register.jsp";
	}

	@RequestMapping("/adddata")
	public ModelAndView addRegister(HttpServletRequest req) {
		
		
		ModelAndView mv = new ModelAndView("Success.jsp");
		String name = req.getParameter("uname");
		if(name.length() >= 1) {
			jdbcClass jc = new jdbcClass();
			jc.insertData(name);
			return mv.addObject("value1", name);
			
		}
		
		return  mv.addObject("value1", "Please enter name");
		
	}
	
	@RequestMapping("/login")
	public ModelAndView addLogin() {
		return new ModelAndView("login.jsp");
	}
	
	
}
