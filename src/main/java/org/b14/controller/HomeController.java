package org.b14.controller;

import org.b14.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by onazaruk on 11.02.2016.
 */

@Controller
public class HomeController {
    @Autowired
    private PostService postService;

    @RequestMapping(value = {"/home", "/index"})
    public ModelAndView index(@RequestParam(value = "status", required = false) String status) {
        return new ModelAndView("home")
                .addObject("postList",postService.getLastPosts())
                .addObject("status",status)
                .addObject("favoritePostList",postService.getFavoritePost());
    }

    @RequestMapping(value = {"/contacts"})
    public ModelAndView contacts() {
        return new ModelAndView("contacts");
    }


    @RequestMapping(value = {"/about"})
    public ModelAndView about() {
        return new ModelAndView("about");
    }

    @RequestMapping(value = {"/forum"})
    public ModelAndView forum() {
        return new ModelAndView("forum");
    }

    @RequestMapping(value = {"/issues"})
    public ModelAndView issues() {
        return new ModelAndView("issues");
    }

}
