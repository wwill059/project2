package com.revature.dao;

import java.util.List;

import com.revature.pojos.user.Account;

public interface UserDao {

	Account getUser(String name);
	
	boolean putUser(Account user);
	
	boolean deleteUser(Account user);
	
	boolean updateUser(Account user);
	
	List<Account> getAllUsers();
	
}
