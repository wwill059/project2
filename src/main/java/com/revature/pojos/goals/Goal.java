package com.revature.pojos.goals;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.revature.pojos.user.Account;
import com.revature.pojos.user.Organization;




@Entity
@Table(name="GOALS")
public class Goal {
	
	@Id
	@Column(name="GOALID")
//	@SequenceGenerator(name="BEARID_SEQ", sequenceName="BEARID_SEQ")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BEARID_SEQ")	
	private int goalId;
	
	@Column(name="GOALNAME")
	private String goalName;
	
	@Column(name="ISCOMPLETED")
	private boolean isCompleted;
	
	@Column(name="USERID")
	private int userId;
	
	@Column(name="ORGID")
	private int orgId;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "GOALS_TASKS", joinColumns = { @JoinColumn(name = "GOALID") }, inverseJoinColumns = {
			@JoinColumn(name = "TASKID") })
	private Set<Task> tasks;
	
	
	@ManyToOne
    @JoinColumn(name = "USERID")
    private Account user;
	
	@ManyToOne
    @JoinColumn(name = "ORGID")
    private Organization organization;

	public int getGoalId() {
		return goalId;
	}
	public void setGoalId(int goalId) {
		this.goalId = goalId;
	}
	public String getGoalName() {
		return goalName;
	}
	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	
	
	public Account getUser() {
		return user;
	}
	public void setUser(Account user) {
		this.user = user;
	}
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	public Set<Task> getTasks() {
		return tasks;
	}
	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
	
	
	
	public Goal(int goalId, String goalName, boolean isCompleted, int userId, int orgId, Set<Task> tasks, Account user,
			Organization organization) {
		super();
		this.goalId = goalId;
		this.goalName = goalName;
		this.isCompleted = isCompleted;
		this.userId = userId;
		this.orgId = orgId;
		this.tasks = tasks;
		this.user = user;
		this.organization = organization;
	}
	public Goal() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
}
