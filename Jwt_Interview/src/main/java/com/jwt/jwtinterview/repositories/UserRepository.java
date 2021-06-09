package com.jwt.jwtinterview.repositories;

import com.jwt.jwtinterview.models.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
