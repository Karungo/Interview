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
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String author;
    public String iSBN;
    private int userId;

    public Book(String title, String author, String iSBN, int userId) {
        this.title = title;
        this.author = author;
        this.iSBN = iSBN;
        this.userId = userId;
    }
}
