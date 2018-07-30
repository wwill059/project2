package com.revature.dao;

import java.util.List;


import com.revature.pojos.user.Organization;

public interface OrganizationDao {

	
Organization getOrganization(String name);
	
	boolean putOrganization(Organization org);
	
	boolean deleteOrganization(Organization org);
	
	boolean updateOrganization(Organization org);
	
	List<Organization> getAllOrganizations();
}
