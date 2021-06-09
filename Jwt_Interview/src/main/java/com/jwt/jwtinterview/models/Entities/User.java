package com.jwt.jwtinterview.models.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(String user_name, String password, String email) {
        this.userName = user_name;
        this.password = password;
        this.email = email;
    }
}
