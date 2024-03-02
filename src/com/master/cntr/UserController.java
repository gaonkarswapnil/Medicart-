package com.master.cntr;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.master.dto.User;
import com.master.service.UserService;
import com.master.valid.UserValidator;


@Controller
public class UserController {


	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidator userValidator;
	
	@RequestMapping(value = "/prep_reg_form.htm",method = RequestMethod.GET)
	public String prepRegForm(ModelMap map) {
	
		
		map.put("user", new User());
		return "reg_form";

	}
	
	@RequestMapping(value = "/reg.htm",method = RequestMethod.POST)
	public String register(User user,BindingResult result,ModelMap map) {
		
		userValidator.validate(user, result);
		
		if(result.hasErrors()) {
			
			return "reg_form";
			
		}
		userService.addUser(user);
		return "login_form";
	}
	
	@RequestMapping(value = "/prep_log_form.htm",method = RequestMethod.GET)
	public String prepLogForm(ModelMap map) {
		map.put("user", new User());
		return "login_form";
	}
	
	@RequestMapping(value = "/login.htm",method = RequestMethod.POST)
	public String login(User user,BindingResult result,ModelMap map, HttpSession session, HttpServletResponse response) {
		

		
		
		boolean b = userService.findUser(user);

		if(b) {	
			
				
				session.setAttribute("user", user);
				return "UserHome";
				
				
		}	
		else {
			
			map.put("user", new User());
			return "login_form";
		}
	}
	
	
	
	@RequestMapping(value = "/prep_users_list.htm",method = RequestMethod.GET)
	public String UserList(ModelMap map) {
		List<User> li = userService.selectAll();
		map.put("usersList", li);
		return "user_list";
	}
	
	
	@RequestMapping(value = "/log_out.htm",method = RequestMethod.GET)
	public String UserLogOut(ModelMap map,HttpSession session , HttpServletRequest request) {

	
		 
		session.invalidate();

		map.put("user", new User());
		return "login_form";
		
	}

}
