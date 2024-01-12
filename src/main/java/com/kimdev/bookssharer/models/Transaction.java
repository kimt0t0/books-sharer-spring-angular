package com.kimdev.bookssharer.models;

/**
 * @author: Kim Robert
 * @since: 05.01.2024
 */

import org.hibernate.type.descriptor.java.ZonedDateTimeJavaType;

import com.kimdev.bookssharer.enums.TransactionState;
import com.kimdev.bookssharer.enums.TransactionType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
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
@Table(name = "transactions")
public class Transaction extends AbstractEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionState state;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_book")
    private Book book;

    @Column
    private ZonedDateTimeJavaType dateStart;

    @Column
    private ZonedDateTimeJavaType dateLimit;

    @Column
    private ZonedDateTimeJavaType dateEnd;

}
