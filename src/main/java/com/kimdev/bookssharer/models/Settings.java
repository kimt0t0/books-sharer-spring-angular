package com.kimdev.bookssharer.models;

/**
 * @author: Kim Robert
 * @since: 05.01.2024
 */

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Settings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    private String id;

    @Column(nullable = false)
    private Boolean darkmode;

    @Column(nullable = false)
    private String language;

    @Column(nullable = false)
    private List<String> readingLanguages;

}
