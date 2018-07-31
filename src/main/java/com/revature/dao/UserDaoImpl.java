package com.revature.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.pojos.goals.Goal;
import com.revature.pojos.user.Account;


@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Account getUser(int id) {
		Session sess = sessionFactory.getCurrentSession();
		
		
		return (Account)sess.get(Account.class, id);
	}

	@Override
	public Account putUser(Account user) {
	
		
Session sess = sessionFactory.getCurrentSession();
		
		Transaction tx = sess.beginTransaction();
		
		sess.save(user);
		
		tx.commit();
		
		return user;
	}

	@Override
	public void deleteUser(Account user) {
		// TODO Auto-generated method stub

		Session sess = sessionFactory.getCurrentSession();
		
		Transaction tx = sess.beginTransaction();
				
				sess.delete(user);
				
				tx.commit();
	}

	@Override
	public void updateUser(Account user) {
		
		Session sess = sessionFactory.getCurrentSession();

		Transaction tx = sess.beginTransaction();
				
				sess.update(user);
				
				tx.commit();
	}

	@Override
	public List<Account> getAllUsers() {
		// TODO Auto-generated method stub
Session sess = sessionFactory.getCurrentSession();
		
		Criteria criteria = sess.createCriteria(Account.class);
		
		return (List<Account>)criteria.list();
	}

}
