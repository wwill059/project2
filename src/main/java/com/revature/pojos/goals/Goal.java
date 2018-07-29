package com.revature.pojos.goals;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="GOALS")
public class Goal {

	@Id
	@Column(name="ID")
//	@SequenceGenerator(name="BEARID_SEQ", sequenceName="BEARID_SEQ")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BEARID_SEQ")	
	private int id;
	
	@Column(name="GOALNAME")
	private String goalName;
	
	@Column(name="ISCOMPLETED")
	private boolean isCompleted;
	
	@Column(name="USERID")
	private int userId;
	
	@Column(name="ORGID")
	private int orgId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Goal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goal(int id, String goalName, boolean isCompleted, int userId, int orgId) {
		super();
		this.id = id;
		this.goalName = goalName;
		this.isCompleted = isCompleted;
		this.userId = userId;
		this.orgId = orgId;
	}
	
	
}
