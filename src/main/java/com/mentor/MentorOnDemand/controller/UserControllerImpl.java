package com.mentor.MentorOnDemand.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mentor.MentorOnDemand.dao.MentorDao;
import com.mentor.MentorOnDemand.dao.UserDao;
import com.mentor.MentorOnDemand.model.Mentor;
import com.mentor.MentorOnDemand.model.User;
import com.mentor.MentorOnDemand.service.UserService;
@Controller
public class UserControllerImpl {
	@Autowired
	private UserService userService;
	@Autowired 
	private MentorDao mentorDao;
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/usersignup", method= RequestMethod.GET)
	public String getUserForm(ModelMap model) {
		User user=new User();
		model.addAttribute("login",user);
		return "usersignup";
		
	}
	
	@RequestMapping(value="/usersignup", method= RequestMethod.POST)
	public String formHandler(@Valid @ModelAttribute("login")User user,ModelMap model)throws SQLException{
		userService.insertUser(user);
		return "redirect:/login";
		
	}
	
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String Login(ModelMap model) {
		User login=new User();
		model.addAttribute("login",login);
		return "login";
		
	}

	@RequestMapping(value= "/login", method = RequestMethod.POST)
    public ModelAndView login(@Valid @ModelAttribute("login") User user,HttpSession session,ModelMap map) throws Exception {
		ModelAndView model = null;
		String email = user.getEmail();
		List<User> user1 = userService.findByemail(email);
		if(user1.isEmpty()){
			model = new ModelAndView("login", "message", "Invalid Username or Password");

		}else{
			User user2 = user1.get(0);
			boolean value1=user2.isActive();
			boolean value2=true;
			if(value1==value2){
				model = new ModelAndView("login", "message", "User Blocked");
			}
			else if((user.getEmail().equals(user2.getEmail())) && (user.getPassword().equals(user2.getPassword()))) {
			if (user2.getUserType().equals("User")) {
				session.setAttribute("user",user2);
				model = new ModelAndView("userLanding");
				} else {
					model = new ModelAndView("adminLanding");
                }
			} else {
				model = new ModelAndView("login", "message", "Invalid Username or Password");
			}
		}
		return model;

    }
	
	@RequestMapping(path="/userList")
	public ModelAndView mentorList()throws Exception{
		ModelAndView model=new ModelAndView();
		model.setViewName("UserList");
		model.addObject("userList",userService.userList());
		return model;
		
	}
	
	@RequestMapping(value = "/blockuser")
    public String blockMentor(ModelMap model, @RequestParam("id") int regCode,
                  @ModelAttribute("userList") User user) {
           System.out.println(regCode);
           boolean value=user.isActive();
           System.out.println(value);
           if(value==false)
           {             
                  userDao.blockById(regCode);
           }
           System.out.println(value);
           return "redirect:/userList";
    }
	
	
    @RequestMapping(value = "/unblockuser")
    public String unblockMentor(ModelMap model, @RequestParam("id") int regCode,
                  @ModelAttribute("userList") User user) {
           System.out.println(regCode);
           boolean value=user.isActive();     
           System.out.println(value);
           value=true;
           if(value==true)
           {                          

                  userDao.unblockById(regCode);
           }
           System.out.println(value);
           return "redirect:/userList";
    }
	
	
	@RequestMapping(path="/confirmStatus")
    public ModelAndView updateStatus(@RequestParam("id") int mentorId,@RequestParam("userId") int regCode, Mentor mentor){
           ModelAndView model=new ModelAndView();
           Mentor mentor1=mentorDao.findByregCode(mentorId);
           //mentorDao.save(mentor);
           User user=userDao.findByregCode(regCode);
           System.out.println(regCode);
            user.setStatus("Approved");
           mentor1.setStatus("Approved");
           mentorDao.save(mentor1);
           userDao.save(user);
           model=new ModelAndView("redirect:/userList");
           return model;
    }

}
