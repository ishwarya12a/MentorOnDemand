package com.mentor.MentorOnDemand.service;

import java.sql.SQLException;
import java.util.List;

import com.mentor.MentorOnDemand.model.User;


public interface UserService {
	public User insertUser(User user)throws SQLException;
	public List<User> findByemail(String email);
	public List<User> userList()throws Exception;

}
