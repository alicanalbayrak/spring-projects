package com.gilmour.service;

import java.util.List;

import com.gilmour.model.Activity;
import com.gilmour.model.Exercise;

/**
 * Created by alicana on 07/03/2017.
 */
public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}
