package com.mentor.MentorOnDemand.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentor.MentorOnDemand.dao.UserDao;
import com.mentor.MentorOnDemand.model.User;
@Service
public class UserServiceImpl implements UserService{
	@Autowired 
	private UserDao userdao;
	@Override
	public User insertUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		return userdao.save(user);
	}

	@Override
	public List<User> findByemail(String email) {
		// TODO Auto-generated method stub
		return userdao.findByemail(email);
	}

	@Override
	public List<User> userList() throws Exception {
		// TODO Auto-generated method stub
		return userdao.findAll();
	}

}
