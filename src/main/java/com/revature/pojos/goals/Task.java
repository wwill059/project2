package com.revature.pojos.goals;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.revature.pojos.user.Organization;


@Entity
@Table(name="TASKS")
public class Task {

	@Id
	@Column(name="TASKID")
//	@SequenceGenerator(name="BEARID_SEQ", sequenceName="BEARID_SEQ")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BEARID_SEQ")
	private int taskId;
	
	@Column(name="TASKNAME")
	private String taskName;
	
	@Column(name="DEADLINE")
	private Date deadline;
	
	@Column(name="ISCOMPLETED")
	private boolean isCompleted;
	
	@Column(name="GOALID")
	private int goalId;
	
	@ManyToOne
    @JoinColumn(name = "GOALID")
    private Goal goal;
	
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
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
	
	public Goal getGoal() {
		return goal;
	}
	public void setGoal(Goal goal) {
		this.goal = goal;
	}
	
	
	public Task(int taskId, String taskName, Date deadline, boolean isCompleted, int goalId, Goal goal) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.deadline = deadline;
		this.isCompleted = isCompleted;
		this.goalId = goalId;
		this.goal = goal;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
