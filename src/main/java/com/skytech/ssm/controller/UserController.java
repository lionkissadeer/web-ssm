package com.skytech.ssm.controller;

import com.skytech.ssm.entity.User;
import com.skytech.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping(value="/showUsers")
	public ModelAndView showUsers(HttpServletRequest request, ModelMap model) {
		List<User> users = userService.getAllUser();
		model.addAttribute("users", users);
//		return "showUsers";
		return new ModelAndView("showUsers",model);
	}
}
