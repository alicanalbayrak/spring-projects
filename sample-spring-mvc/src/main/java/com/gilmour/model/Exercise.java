package com.gilmour.model;

import javax.validation.constraints.NotNull;

public class Exercise {

	private int minutes;

	@NotNull
	private String activity;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}
}
