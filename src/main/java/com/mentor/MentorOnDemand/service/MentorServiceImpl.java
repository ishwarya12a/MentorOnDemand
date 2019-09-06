package com.mentor.MentorOnDemand.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentor.MentorOnDemand.dao.MentorDao;
import com.mentor.MentorOnDemand.model.Mentor;

@Service
public class MentorServiceImpl implements MentorService{
	@Autowired
	private MentorDao mentorDao;

	@Override
	public Mentor insertMentor(Mentor mentor) throws SQLException {
		// TODO Auto-generated method stub
		return mentorDao.save(mentor);
	}

	@Override
	public List<Mentor> findByemail(String email) {
		// TODO Auto-generated method stub
		return mentorDao.findByemail(email);
	}

	@Override
	public List<Mentor> mentorList() throws SQLException {
		// TODO Auto-generated method stub
		return mentorDao.findAll();
	}

}
