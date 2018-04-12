package com.htzhny.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fresh.service.UserService;
import com.htzhny.dao.UserDao;
import com.htzhny.entity.User;

/**
 * 用户控制器
 */
@Controller
@RequestMapping(value="/user")
public class UserController {
	Logger log = Logger.getLogger(UserController.class);
	@Autowired
    private UserService userService;
	
    @RequestMapping("/view")
    public String view() {
        return "main/login";
    }

    @RequestMapping("/indexview")
    public String index() {
        return "main/index";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public ModelAndView  login(User request,HttpSession session) {
    	log.info("开始登录验证");
    	User user1 = new User(1, "wang", "3");
    	User user = userService.login(user1);

        if (user == null || !user.getUserPassword().equals(request.getUserPassword())) {
            return new ModelAndView("redirect:/login.jsp");
        } else {
            session.setAttribute("user", user);
            ModelAndView mav = new ModelAndView();
            mav.setViewName("index");
            return mav;
        }
    }
    
}