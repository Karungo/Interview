package com.jwt.jwtinterview.repositories;

import com.jwt.jwtinterview.models.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findBooksByUserId(int userId);
}
