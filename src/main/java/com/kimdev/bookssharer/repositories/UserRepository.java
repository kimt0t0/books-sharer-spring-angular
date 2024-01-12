package com.kimdev.bookssharer.repositories;

/**
 * @author: Kim Robert
 * @since: 05.01.2024
 */

// Imports
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kimdev.bookssharer.models.User;

public interface UserRepository extends JpaRepository<User, String> {

    List<User> findDistinctByUsername(String username);

    List<User> findDistinctByUsernameContainingIgnoreCase(String username);

    @Query("from User u inner join Book b on u.id = b.owner.id where b.title = :title")
    List<User> searchByBookTitle(String title);

    @Query("from User u inner join Collection c on u.id = c.owner.id where c.title = :title")
    List<User> searchByCollectionTitle(String title);

}
