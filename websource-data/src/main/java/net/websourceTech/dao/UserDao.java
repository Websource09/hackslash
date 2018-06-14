package net.websourceTech.dao;

import java.util.List;

import net.websourceTech.Entity.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
	void save(User user);
	
	void deleteBySSO(String sso);
	
	List<User> findAllUsers();

}

