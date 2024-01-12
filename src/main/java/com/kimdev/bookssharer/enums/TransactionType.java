package com.kimdev.bookssharer.enums;

public enum TransactionType {
    lend("lend"),
    borrow("borrow"),
    give("give"),
    receive("receive"),
    sell("sell"),
    buy("buy");

    String value;

    TransactionType(String value) {
        this.value = value;
    }
}
