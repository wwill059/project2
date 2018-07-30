package com.revature.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.pojos.user.Organization;


@Component
public class OrganizationDaoImpl implements OrganizationDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Organization getOrganization(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean putOrganization(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrganization(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOrganization(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Organization> getAllOrganizations() {
		// TODO Auto-generated method stub
		return null;
	}

}
