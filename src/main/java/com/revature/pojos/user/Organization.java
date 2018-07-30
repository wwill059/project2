package com.revature.pojos.user;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.revature.pojos.goals.Goal;

@Entity
@Table(name = "ORGANIZATIONS")
public class Organization {

	@Id
	@Column(name = "ORGID")
	// @SequenceGenerator(name="BEARID_SEQ", sequenceName="BEARID_SEQ")
	// @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BEARID_SEQ")
	private int orgId;

	@Column(name = "ORGNAME")
	private String orgName;

	@Column(name = "ADMINID")
	private int adminId;

	@ManyToMany(mappedBy = "organization")
	private Set<Account> users;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "ORGANIZATIONS_GOALS", joinColumns = { @JoinColumn(name = "ORGID") }, inverseJoinColumns = {
			@JoinColumn(name = "GOALID") })
	private Set<Goal> goals;

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public Set<Account> getUsers() {
		return users;
	}

	public void setUsers(Set<Account> users) {
		this.users = users;
	}

	public Set<Goal> getGoals() {
		return goals;
	}

	public void setGoals(Set<Goal> goals) {
		this.goals = goals;
	}

	public Organization(int orgId, String orgName, int adminId, Set<Account> users, Set<Goal> goals) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.adminId = adminId;
		this.users = users;
		this.goals = goals;
	}

	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}

}
