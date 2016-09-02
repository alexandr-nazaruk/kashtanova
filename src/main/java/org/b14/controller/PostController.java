package org.b14.controller;

import javafx.geometry.Pos;
import org.b14.model.Post;
import org.b14.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.security.Principal;
import java.util.Calendar;

/**
 * Created by onazaruk on 17.02.2016.
 */

@RequestMapping(value = "/post")
@Controller
public class PostController {
    @Autowired
    private PostService postService;

    private ModelAndView editPost(Post post){
        return new ModelAndView("editPost","post", post);
    }

    @RequestMapping(value = "/edit")
    public ModelAndView editPost(){
        Post post = new Post();
        return editPost(post);
    }

    @RequestMapping(value = "/{postId}", params="edit", method = RequestMethod.GET)
    public ModelAndView editPost(@PathVariable long postId){
        Post post = postService.getPost(postId);
        return editPost(post);
    }

    @RequestMapping(value = {"/edit","/{postId}"}, method = RequestMethod.POST)
    public ModelAndView savePost(@Valid Post post, @PathVariable long postId, BindingResult bindingResult, Principal principal) {
        if (bindingResult.hasErrors()){
            return new ModelAndView("editPost");
        }
        try {
            post.setAuthor(principal.getName());
            post.setPublicationDate(Calendar.getInstance().getTime());
        }catch (IllegalAccessException e){
           return new ModelAndView("redirect:/error","error",e.getMessage());
        }
        postService.save(post);
        return new ModelAndView("redirect:/home","status",post.getAuthor()+" "+post.getTitle());
    }

    @RequestMapping(value = "/{postId}", method = RequestMethod.GET)
    public ModelAndView viewPost(@PathVariable long postId){
        Post post = postService.getPost(postId);
        return new ModelAndView("viewPost","post",post);
    }



}
