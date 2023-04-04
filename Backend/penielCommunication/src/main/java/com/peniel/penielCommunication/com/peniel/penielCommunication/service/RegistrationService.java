package com.peniel.penielCommunication.com.peniel.penielCommunication.service;

import com.peniel.penielCommunication.com.peniel.penielCommunication.dao.RegistrationRepository;
import com.peniel.penielCommunication.com.peniel.penielCommunication.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    RegistrationRepository registrationRepository;


    public Users register(Users users){return registrationRepository.save(users);}
    public Users fetchByEmail(String eamil){
        Users usersObj = registrationRepository.findByEmail(eamil);
        return usersObj;//retouner l'utilisateur connecté à la bd
    }

    public Users fetchByEmailAndPassword(String theEmail,String thePassword){
        Users users = registrationRepository.findByEmailAndPassword(theEmail, thePassword);
        return users;
    }

}
