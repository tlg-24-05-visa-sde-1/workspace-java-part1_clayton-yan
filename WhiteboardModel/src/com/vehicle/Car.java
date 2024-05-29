package com.vehicle;

public class Car {
    // static
    public static final int MIN_YEAR = 1900;
    public static final int MAX_YEAR = 2025;

    // fields
    private CarColor color;
    private String model;
    private int year;
    private String brand;



    // no arg constructor
    public Car() {
    }

    // one arg constructor
    public Car(String model) {
        setModel(model);
    }

    // four arg constructor
    public Car(CarColor color, String model, int year, String brand) {
        this(model);
        setColor(color);
        setYear(year);
        setBrand(brand);
    }



    // getters and setters
    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    // validation
    public void setYear(int year) {
        if (year >= MIN_YEAR && year <= MAX_YEAR) {
            this.year = year;
        } else {
            System.out.println("Year: " + year + " is invalid, must be between " + MIN_YEAR + " and " + MAX_YEAR + ".");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    // methods
    public void startEngine() {
        System.out.println("Car engine started");
    }
    public void turnOff() {
        System.out.println("Car is off");
    }
    public void showYear() {
        System.out.println("Year: " + getYear());
    }
    public void showColorBrand() {
        System.out.println("Color: " + getColor() + ", Brand: " + getBrand());
    }

    /*
     * override toString()
     */
    public String toString() {
        return "This Car is a " + getColor() + ", " + getBrand() + ", " + getModel() + ", " + getYear();
    }
}
