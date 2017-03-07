package com.gilmour.controller;

import java.util.List;

import com.gilmour.model.Activity;
import com.gilmour.model.Exercise;
import com.gilmour.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MinutesController {

	@Autowired
	private ExerciseService exerciseService;

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("exercise: " + exercise.getMinutes());
		System.out.println("exercise activity: " + exercise.getActivity());

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

	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {

		return exerciseService.findAllActivities();
	}

}
