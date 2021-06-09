package com.jwt.jwtinterview.controllers;

import com.jwt.jwtinterview.models.Entities.Book;
import com.jwt.jwtinterview.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> books() {
        return bookRepository.findAll();
    }

    @GetMapping("/book")
    public ResponseEntity<?> book(@RequestParam int id) {
        try{
            var book = bookRepository.findById(id);
            return new ResponseEntity(book, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity("An error occurred", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/user-book")
    public ResponseEntity<?> userBook(@RequestParam int id) {
        try{
            var books = bookRepository.findBooksByUserId(id);
            return new ResponseEntity(books, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity("An error occurred", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add-book")
    public ResponseEntity<String> addBook(@RequestBody Book book)  {
        try {
            bookRepository.save(book);
            return new ResponseEntity<>("Added successfully", HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity("An error occurred while trying to add", HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete-book")
    public ResponseEntity<?> delete(@RequestParam int id) {
        try{
            bookRepository.deleteById(id);
            return new ResponseEntity("Deleted successfully", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity("An error occurred", HttpStatus.NOT_FOUND);
        }
    }

}
