package com.kimdev.bookssharer.enums;

public enum TransactionState {
    planned("planned"),
    ongoing("ongoing"),
    late("late"),
    done("done");

    String value;

    TransactionState(String value) {
        this.value = value;
    }
}
