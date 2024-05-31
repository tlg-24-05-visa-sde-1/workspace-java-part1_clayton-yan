package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    // option 4: wrap into a new WorkException
    public void goToWork() throws WorkException {
        Car c = new Car("ABC223", "MB", "GLA250");

        try {
            c.start();
            c.moveTo("Texas");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);
        } finally {
            c.stop();
        }
    }

    // option 3: try catch, react in some way and rethrow back to client
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("ABC223", "MB", "GLA250");

        try {
            c.start();
            c.moveTo("Texas");
        } catch (DestinationUnreachableException e) {
            System.out.println("Emailing Lisa to complain");
            throw e;
        } finally {
            c.stop();
        }
    }

     */

    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("ABC223", "MB", "GLA250");

        try {
            c.start();
            c.moveTo("Texas");
        } finally {
            c.stop();
        }
    }
     */

    /*
     * option 1: try catch handle so exception stops here, c.stop in finally
     * option 2: "punt" don't catch just ignore
     */

    /*
    public void goToWork() {
        Car c = new Car("ABC223", "MB", "GLA250");


        try {
            c.start();
            c.moveTo("Texas");
        } catch (DestinationUnreachableException e) {
            System.out.println(e.getMessage());
        }
        finally {
            c.stop();
        }
    }

     */

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}