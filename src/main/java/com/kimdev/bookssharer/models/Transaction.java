package com.kimdev.bookssharer.models;

/**
 * @author: Kim Robert
 * @since: 05.01.2024
 */

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.type.descriptor.java.ZonedDateTimeJavaType;

import com.kimdev.bookssharer.enums.TransactionState;
import com.kimdev.bookssharer.enums.TransactionType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false)
    private TransactionType type;

    @Column(nullable = false)
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
