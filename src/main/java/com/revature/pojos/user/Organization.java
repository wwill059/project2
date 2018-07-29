package com.revature.pojos.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORGANIZATIONS")
public class Organization {
	
	
	@Id
	@Column(name="ID")
//	@SequenceGenerator(name="BEARID_SEQ", sequenceName="BEARID_SEQ")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BEARID_SEQ")	
private int id;
	
	
	@Column(name="ORGNAME")	
private String orgName;
	
	@Column(name="ADMINID")
private int adminId;
	
	
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public Organization(int id, String orgName, int adminId) {
	super();
	this.id = id;
	this.orgName = orgName;
	this.adminId = adminId;
}
public Organization() {
	super();
	// TODO Auto-generated constructor stub
}


}
