package com.jwt.jwtinterview.controllers;

import com.jwt.jwtinterview.models.Entities.Video;
import com.jwt.jwtinterview.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VideoController {
    @Autowired
    private VideoRepository videoRepository;

    @GetMapping("/videos")
    public List<Video> videos() {
        return videoRepository.findAll();
    }

    @GetMapping("/video")
    public Optional<Video> video(@RequestParam int id) {
        return videoRepository.findById(id);
    }

    @GetMapping("/user-videos")
    public ResponseEntity<?> userVideos(@RequestParam int id) {
        try{
            var video = videoRepository.findVideosByUserId(id);
            return new ResponseEntity(video, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity("An error occurred", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add-video")
    public ResponseEntity<String> addVideo(@RequestBody Video video)  {
        try {
            videoRepository.save(video);
            return new ResponseEntity<>("Added successfully", HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity("An error occurred while trying to add", HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete-video")
    public ResponseEntity<?> delete(@RequestParam int id) {
        try{
            videoRepository.deleteById(id);
            return new ResponseEntity("Deleted successfully", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity("An error occurred", HttpStatus.NOT_FOUND);
        }
    }
}
