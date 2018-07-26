package com.revature.pojos.goals;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="GOAL")
public class GoalImple implements Goal {

	@Id
	@Column(name="GOAL_ID")
	private int id;
	
	@Column(name="GOAL_NAME")
	private String name;
	
	@Column(name="IS_COMPLETED")
	private boolean isCompleted;
	
	@Column(name="USER_ID")
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.REMOVE, mappedBy="userId")
	private int userId;
	
	@Column(name="ORG_ID")
	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.REMOVE, mappedBy="orgId")
	private int orgId;
	public GoalImple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoalImple(int id, String name, boolean isCompleted, int userId) {
		super();
		this.id = id;
		this.name = name;
		this.isCompleted = isCompleted;
		this.userId = userId;
	}
	public GoalImple(int id, String name, int orgId, boolean isCompleted) {
		super();
		this.id = id;
		this.name = name;
		this.isCompleted = isCompleted;
		this.orgId = orgId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "GoalImple [id=" + id + ", name=" + name + ", isCompleted=" + isCompleted + ", userId=" + userId
				+ ", orgId=" + orgId + "]";
	}
	
	
	
	
}
