package com.mentor.MentorOnDemand.service;

import java.sql.SQLException;
import java.util.List;

import com.mentor.MentorOnDemand.model.Mentor;


public interface MentorService {
	public Mentor insertMentor(Mentor mentor)throws SQLException;
	public List<Mentor> findByemail(String email);
	public List<Mentor> mentorList()throws SQLException;

}
