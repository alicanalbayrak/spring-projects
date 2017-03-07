package com.gilmour.service;

import java.util.ArrayList;
import java.util.List;

import com.gilmour.model.Activity;
import com.gilmour.model.Exercise;
import com.gilmour.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	@Autowired private ExerciseRepository exerciseRepository;

	@Override
	public List<Activity> findAllActivities() {

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

	@Override
	@Transactional
	public Exercise save(Exercise exercise) {
		return exerciseRepository.save(exercise);
	}

}
