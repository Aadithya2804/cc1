package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {
	@Id
	private int id;
	private String task;
	private int isCompleted;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public int getIsCompleted() {
		return isCompleted;
	}
	public void setIsCompleted(int isCompleted) {
		this.isCompleted = isCompleted;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(int id, String task, int isCompleted) {
		super();
		this.id = id;
		this.task = task;
		this.isCompleted = isCompleted;
	}

}
