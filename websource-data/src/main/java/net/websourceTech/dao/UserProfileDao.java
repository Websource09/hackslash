package net.websourceTech.dao;

import java.util.List;

import net.websourceTech.Entity.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
