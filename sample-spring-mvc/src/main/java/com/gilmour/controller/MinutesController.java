package com.gilmour.controller;

import java.util.ArrayList;
import java.util.List;

import com.gilmour.model.Activity;
import com.gilmour.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {

		List<Activity> activities = new ArrayList<>();

		Activity run = new Activity();
		run.setDesc("run");
		activities.add(run);

		Activity bike = new Activity();
		bike.setDesc("bike");
		activities.add(bike);

		Activity swim = new Activity();
		swim.setDesc("swim");
		activities.add(swim);

		return activities;
	}

}
