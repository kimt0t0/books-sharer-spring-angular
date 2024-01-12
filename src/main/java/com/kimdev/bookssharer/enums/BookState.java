package com.kimdev.bookssharer.enums;

public enum BookState {
    want("want"),
    possess("possess"),
    borrow("borrow"),
    lend("lend");

    String value;

    BookState(String value) {
        this.value = value;
    }
}
