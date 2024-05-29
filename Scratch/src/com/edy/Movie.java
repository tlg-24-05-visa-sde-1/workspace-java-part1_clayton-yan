package com.edy;

public class Movie {
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;


    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Integer releaseYear, Double revenue) {
        this(title); // delegate to ctor above
        setReleaseYear(releaseYear);
        setRevenue(revenue);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title, releaseYear, revenue);
        setRating(rating);
        setGenre(genre);
    }

    // methods

    // accessors


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        // return "Title: " + getTitle() + ", Year: " + getReleaseYear() + ", Revenue: " + getRevenue() + ", Rating: " + getRating() + ", Genre: " + getGenre();
        return String.format("Movie: title=%s, releaseYear=%s, revenue=%,.2f, rating=%s, genre=%s", getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
    }
}