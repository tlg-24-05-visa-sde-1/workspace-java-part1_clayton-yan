package com.edy.client;

import com.edy.Genre;
import com.edy.Movie;
import com.edy.Rating;

class MovieClient {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Twilight");
        movie1.setReleaseYear(2008);
        movie1.setRevenue(5_280_000_000.0);
        movie1.setRating(Rating.PG_13);
        movie1.setGenre(Genre.ROMANCE);
        System.out.println(movie1);

        Movie movie2 = new Movie("Oppenheimer", 2023, 3000.0, Rating.R, Genre.DRAMA);
        System.out.println(movie2);

        Movie movie3 = new Movie("Stoopin");
        movie3.setGenre(Genre.DRAMA);
        System.out.println(movie3);

    }
}