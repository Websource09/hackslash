package net.websourceTech.service;

import java.util.List;

import net.websourceTech.Entity.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
