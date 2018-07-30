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
@Table(name="USERS")
public class Account {
	
	@Id
	@Column(name="USERID")
//	@SequenceGenerator(name="BEARID_SEQ", sequenceName="BEARID_SEQ")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BEARID_SEQ")
	private int userId;
	
	@Column(name="FIRSTNAME")
	private String firstName;
	
	@Column(name="LASTNAME")
	private String lastName;
	

	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "USERS_ORGANIZATIONS", 
        joinColumns = { @JoinColumn(name = "USERID") }, 
        inverseJoinColumns = { @JoinColumn(name = "ORGID") }
    )
	private Set<Organization> organizations;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "USERS_GOALS", joinColumns = { @JoinColumn(name = "USERID") }, inverseJoinColumns = {
			@JoinColumn(name = "GOALID") })
	private Set<Goal> goals;
	
	public String getFirstName() {
		return firstName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public Account(int userId, String firstName, String lastName, Set<Organization> organizations, Set<Goal> goals) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.organizations = organizations;
		this.goals = goals;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
