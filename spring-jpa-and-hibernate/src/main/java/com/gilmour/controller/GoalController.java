package com.gilmour.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.gilmour.model.Goal;
import com.gilmour.model.GoalReport;
import com.gilmour.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired private GoalService goalService;

	/**
	 * Passed by ref. instead of pass-by-ref Pointer back to actual object It will return data back to jsp
	 */
	@RequestMapping(value = "addGoal", method = RequestMethod.GET)
	public String addGoal(Model model, HttpSession session) {

		Goal goal = (Goal) session.getAttribute("goal");

		if (goal == null) {
			// Default value -> 10 min
			goal = new Goal();
			goal.setMinutes(10);
		}

		model.addAttribute("goal", goal);
		return "addGoal";
	}

	@RequestMapping(value = "addGoal", method = RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result) {

		System.out.println("result has errors: " + result.hasErrors());

		System.out.println("Minutes updated: " + goal.getMinutes());

		if (result.hasErrors()) {
			return "addGoal";
		} else {
			goalService.saveGoal(goal);
		}

		return "redirect:addMinutes.html";
	}

	@RequestMapping(value = "getGoals", method = RequestMethod.GET)
	public String getGoals(Model model) {

		List<Goal> goals = goalService.findAllGoals();

		model.addAttribute("goals", goals);

		return "getGoals";
	}

	@RequestMapping(value = "getGoalReports", method = RequestMethod.GET)
	public String getGoalReports(Model model) {

		List<GoalReport> goalReports = goalService.findAllGoalReports();

		model.addAttribute("goalReports", goalReports);

		return "getGoalReports";

	}

}
