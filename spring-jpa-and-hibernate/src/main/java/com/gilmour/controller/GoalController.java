package com.gilmour.controller;

import javax.validation.Valid;

import com.gilmour.model.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("goal")
public class GoalController {

	/**
	 * Passed by ref. instead of pass-by-ref Pointer back to actual object It will return data back to jsp
	 */
	@RequestMapping(value = "addGoal", method = RequestMethod.GET)
	public String addGoal(Model model) {

		// Default value -> 10 min
		Goal goal = new Goal();
		goal.setMinutes(10);

		model.addAttribute("goal", goal);
		return "addGoal";
	}

	@RequestMapping(value = "addGoal", method = RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result) {

		System.out.println("result has errors: " + result.hasErrors());

		System.out.println("Minutes updated: " + goal.getMinutes());

		if(result.hasErrors()){
			return "addGoal";
		}

		return "redirect:addMinutes.html";
	}

}
