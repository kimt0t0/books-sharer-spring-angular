package com.kimdev.bookssharer.repositories;

/**
 * @author: Kim Robert
 * @since: 05.01.2024
 */

// Imports
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kimdev.bookssharer.models.User;

public interface UserRepository extends JpaRepository<User, String> {

    List<User> findAllByUsername(String username);

}
