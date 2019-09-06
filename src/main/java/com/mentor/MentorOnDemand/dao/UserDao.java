package com.mentor.MentorOnDemand.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mentor.MentorOnDemand.model.User;


public interface UserDao extends JpaRepository<User,Integer>{
	public List<User> findByemail(String email);
	public List<User> findAll();
	
	@Transactional
	@Modifying
	@Query("update User u set u.active=true where u.regCode=:regCode")
	public void blockById(@Param(value="regCode")int regCode);
	
	@Transactional
	@Modifying
	@Query("update User u set u.active=false where u.regCode=:regCode")
	public void unblockById(@Param(value="regCode")int regCode);
	public User findByregCode(int regCode);
}
