package com.revature.pojos.goals;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TASKS")
public class Task {

	@Id
	@Column(name="ID")
//	@SequenceGenerator(name="BEARID_SEQ", sequenceName="BEARID_SEQ")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BEARID_SEQ")
	private int id;
	
	@Column(name="TASKNAME")
	private String taskName;
	
	@Column(name="DEADLINE")
	private Date deadline;
	
	@Column(name="ISCOMPLETED")
	private boolean isCompleted;
	
	@Column(name="GOALID")
	private int goalId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public int getGoalId() {
		return goalId;
	}
	public void setGoalId(int goalId) {
		this.goalId = goalId;
	}
	public Task(int id, String taskName, Date deadline, boolean isCompleted, int goalId) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.deadline = deadline;
		this.isCompleted = isCompleted;
		this.goalId = goalId;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
