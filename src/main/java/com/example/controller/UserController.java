package com.example.controller;

import com.example.model.UserDao;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ali on 12/22/2016.
 */

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/create/{username}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@PathVariable(name="username") String name, @RequestParam(name="email") String email){
        User user = null;
        try{
            user = new User(name, email);
            userDao.save(user);
        }catch (Exception e){
            e.printStackTrace();
            //return "Error creating user: "+e.toString();
        }
        return user;
    }

    @RequestMapping(value = "/get-by-email", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    public User getUserByEmail(@RequestParam("email") String email){
        User user = null;
        try{
            user = userDao.findByEmail(email);

        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

}
