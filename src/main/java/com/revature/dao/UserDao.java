package com.revature.dao;

import java.util.List;

import com.revature.pojos.user.Account;

public interface UserDao {

	Account getUser(int id);
	
	Account putUser(Account user);
	
	void deleteUser(Account user);
	
	void updateUser(Account user);
	
	List<Account> getAllUsers();
	
}
