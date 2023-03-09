package com.example.datajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.datajpa.model.Movie;
import com.example.datajpa.repository.MovieRepository;

import java.util.*;

@RestController
public class MovieController {

	@Autowired
	MovieRepository mr;

	@RequestMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("Home");
	}

	@RequestMapping("/add")
	public ModelAndView movie() {
		return new ModelAndView("addMovie");
	}

	@RequestMapping("/insert")
	public ModelAndView insert(@RequestParam String name) {
		ModelAndView mv = new ModelAndView("home");

		Movie m = new Movie(0, name);

		mr.save(m);

		return mv;
	}

	@RequestMapping("/show")
	public ModelAndView show() {

		ModelAndView mv = new ModelAndView("show");

		List<Movie> li = mr.findAll();

		mv.addObject("li", li);

		return mv;

	}
}
