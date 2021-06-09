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
@Table(name = "Videos")
public class Video {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String description;
    private String url;
    private String rating;
    private int userId;

    public Video(String title, String description, String url, String rating, int userId) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.rating = rating;
        this.userId = userId;
    }
}
