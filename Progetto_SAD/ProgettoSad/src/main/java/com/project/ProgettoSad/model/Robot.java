package com.project.ProgettoSad.model;

public class Robot {
	private String robotId;
	private String difficulty;
	
	//CONSTRUCTORS
	
	public Robot() {
		super();
	}
	
	public Robot(String robotId, String difficulty) {
		super();
		this.robotId = robotId;
		this.difficulty = difficulty;
	}
	
	public Robot(String robotId) {
		super();
		this.robotId = robotId;
		this.difficulty = "Normal";
	}

	//GETTERSETTER
	public String getRobotId() {
		return robotId;
	}


	public void setRobotId(String robotId) {
		this.robotId = robotId;
	}


	public String getDifficulty() {
		return difficulty;
	}


	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	//TOSTRING
	@Override
	public String toString() {
		return "Robot [robotId=" + robotId + ", difficulty=" + difficulty + "]";
	}
	
	
}
