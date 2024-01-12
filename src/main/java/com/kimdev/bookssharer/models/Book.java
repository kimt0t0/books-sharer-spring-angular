package com.kimdev.bookssharer.models;

/**
 * @author: Kim Robert
 * @since: 05.01.2024
 */

import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

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
    private String state;

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
