package com.peniel.penielCommunication.com.peniel.penielCommunication.dao;

import com.peniel.penielCommunication.com.peniel.penielCommunication.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Users, Long> {
    public Users findByEmail(String email);

    public Users findByEmailAndPassword(String theEmail, String ThePassword);
}
