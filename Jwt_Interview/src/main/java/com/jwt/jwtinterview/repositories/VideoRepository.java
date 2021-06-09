package com.jwt.jwtinterview.repositories;

import com.jwt.jwtinterview.models.Entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video,Integer> {
    List<Video> findVideosByUserId(int userId);
}
