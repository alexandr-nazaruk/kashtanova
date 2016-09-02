package org.b14.controller;

import org.b14.dao.UserDAO;
import org.b14.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by onazaruk on 15.02.2016.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    @Deprecated
    private UserDAO userDAO;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute(new User());
        return "/register.jsp";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String register(User user, BindingResult bindingResult){

        userDAO.save(user);
        return "/home";
    }

//    @RequestMapping(value = "/login")
//    public ModelAndView login(ModelAndView mv){
//        mv.setViewName("login");
//        return mv;
//    }
}
