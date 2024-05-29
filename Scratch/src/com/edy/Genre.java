package com.edy;

public enum Genre {
    ROMANCE("Romance"),
    COMEDY("Comedy haha"),
    HORROR("HORROR!"),
    ACTION("Acion-packed"),
    SCI_FI("Sci-fi"),
    DRAMA("Dramamama"),
    SPORTS("Sports!"),
    WESTERN("Western - Howdy");

    private final String display;
    Genre(String display) {
        this.display = display;
    }

    // getter
    public String getDisplay() {
        return display;
    }

    // toString
    public String toString() {
        return getDisplay();
    }
}