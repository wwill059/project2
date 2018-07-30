package com.revature.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.pojos.user.Account;


@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Account getUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean putUser(Account user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(Account user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(Account user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Account> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
