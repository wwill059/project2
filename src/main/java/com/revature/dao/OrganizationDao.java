package com.revature.dao;

import java.util.List;


import com.revature.pojos.user.Organization;

public interface OrganizationDao {

	
Organization getOrganization(int id);
	
	Organization putOrganization(Organization org);
	
	void deleteOrganization(Organization org);
	
	void updateOrganization(Organization org);
	
	List<Organization> getAllOrganizations();
}
