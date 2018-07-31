package com.revature.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.pojos.user.Account;
import com.revature.pojos.user.Organization;


@Component
public class OrganizationDaoImpl implements OrganizationDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Organization getOrganization(int id) {
Session sess = sessionFactory.getCurrentSession();
		
		
		return (Organization)sess.get(Organization.class, id);
	}

	@Override
	public Organization putOrganization(Organization org) {
Session sess = sessionFactory.getCurrentSession();
		
		Transaction tx = sess.beginTransaction();
		
		sess.save(org);
		
		tx.commit();
		
		return org;
	}

	@Override
	public void deleteOrganization(Organization org) {
Session sess = sessionFactory.getCurrentSession();
		
		Transaction tx = sess.beginTransaction();
				
				sess.delete(org);
				
				tx.commit();
	}

	@Override
	public void updateOrganization(Organization org) {
		Session sess = sessionFactory.getCurrentSession();

		Transaction tx = sess.beginTransaction();
				
				sess.update(org);
				
				tx.commit();
	}

	@Override
	public List<Organization> getAllOrganizations() {
Session sess = sessionFactory.getCurrentSession();
		
		Criteria criteria = sess.createCriteria(Organization.class);
		
		return (List<Organization>)criteria.list();
	}

}
