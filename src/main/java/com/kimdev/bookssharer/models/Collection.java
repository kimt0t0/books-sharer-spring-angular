package com.kimdev.bookssharer.models;

/**
 * @author: Kim Robert
 * @since: 05.01.2024
 */

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "collections")
public class Collection extends AbstractEntity {

    @Column(nullable = false)
    private String title;

    @ManyToOne()
    @JoinColumn(name = "id_owner")
    private User owner;

    @ManyToMany
    @JoinTable(name = "collections_books", joinColumns = @JoinColumn(name = "books_id"), inverseJoinColumns = @JoinColumn(name = "collections_id"))
    private List<Book> books;

    public Collection() {

    }

    public Collection(String title) {
        this.title = title;
    }

}
