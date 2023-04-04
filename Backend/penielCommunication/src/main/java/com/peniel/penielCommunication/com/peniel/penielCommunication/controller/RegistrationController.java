package com.peniel.penielCommunication.com.peniel.penielCommunication.controller;

import com.peniel.penielCommunication.com.peniel.penielCommunication.entity.Users;
import com.peniel.penielCommunication.com.peniel.penielCommunication.service.RegistrationService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @PostMapping(path = "/register")
    public Users registerUser(@RequestBody Users user) throws Exception{
        String tempEmail = user.getEmail();
        if(tempEmail !=null && !"".equals(tempEmail)){
            Users userObj = registrationService.fetchByEmail(tempEmail);
            if(userObj !=null){
                throw new Exception("this user with email "+tempEmail+"already exist");
            }
        }
        //log.info("Test :"+user.getEmail());
        Users userObj = null;
        userObj = registrationService.register(user);
        return userObj;
    }
    @PostMapping(path = "/login")
    public Users login(@RequestBody Users user) throws Exception{
        String tempEmail = user.getEmail();
        String tempPass = user.getPassword();
        Users userObj = null;
        if (tempEmail !=null && tempPass !=null){
            userObj = registrationService.fetchByEmailAndPassword(tempEmail, tempPass);
        }
        if (userObj == null){
            throw new Exception("Bad credentials");
        }
        return userObj;
    }
}
