package com.peniel.penielCommunication.com.peniel.penielCommunication.entity;

import com.peniel.penielCommunication.com.peniel.penielCommunication.dto.AbstractCommonModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="utilisateur")
@Getter
@Setter
public class Users extends AbstractCommonModel {

    @Column(name="nom")
    private String firstName;

    @Column(name="prenom")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="adresse")
    private String adresse;

    @Column(name="telephone")
    private String telephone;
}
