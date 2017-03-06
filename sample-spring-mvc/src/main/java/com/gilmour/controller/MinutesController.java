package com.gilmour.controller;

import com.gilmour.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("exercise: " + exercise.getMinutes());

		return "addMinutes";

		// ByPasses view resolver
		//		return "forward:addMoreMinutes.html";

		// Creates a new request
		// return "redirect:addMoreMinutes.html";
	}

	@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("exercising: " + exercise.getMinutes());

		return "addMinutes";
	}

}
