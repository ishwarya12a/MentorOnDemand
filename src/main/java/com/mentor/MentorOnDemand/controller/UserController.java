package com.mentor.MentorOnDemand.controller;

import java.sql.SQLException;

import org.springframework.web.servlet.ModelAndView;

import com.mentor.MentorOnDemand.model.User;

public interface UserController {
	public User insertUser(User user)throws SQLException;
	public ModelAndView getUserList()throws Exception;

}
