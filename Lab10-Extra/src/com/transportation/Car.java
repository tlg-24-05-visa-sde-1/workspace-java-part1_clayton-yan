package com.transportation;

public class Car extends Vehicle {
    // INSTANCE VARIABLES
    private String make;
    private String model;

    // CONSTRUCTORS
    public Car(String vin) {
        super(vin);
    }

    public Car(String vin, String make, String model) {
        this(vin);
        setMake(make);
        setModel(model);
    }

    // BUSINESS METHODS
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    // if location is "texas" then throw a DestinationUnreachableException

    public void moveTo(String location) throws DestinationUnreachableException{
        if (location.equals("Texas")) {
            throw new DestinationUnreachableException("Location is unreachable " + location);
        }
        System.out.println(getMake() + " " + getModel() + " moving to " + location);
    }

    // ACCESSOR METHODS
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString() + ", make=" + getMake() + ", model=" + getModel();
    }
}