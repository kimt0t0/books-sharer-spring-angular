package com.kimdev.bookssharer.models;

/**
 * @author: Kim Robert
 * @since: 05.01.2024
 */

import java.util.List;

import com.kimdev.bookssharer.enums.BookState;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "books")
public class Book extends AbstractEntity {

    @Column(unique = true, nullable = false)
    private String title;

    @Column(nullable = false)
    private String authorLastName;

    @Column()
    private String authorFirstName;

    @Column()
    private String editor;

    @Column()
    private Integer year;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private BookState state;

    @ManyToOne
    @JoinColumn(name = "id_owner")
    private User owner;

    @ManyToMany(mappedBy = "books")
    private List<Collection> collections;

    @OneToMany(mappedBy = "book")
    private List<Transaction> transactions;

    public Book() {

    }

    public Book(String title) {
        this.title = title;
    }

}
