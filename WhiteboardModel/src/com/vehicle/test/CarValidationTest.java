package com.vehicle.test;

import com.vehicle.Car;

class CarValidationTest {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYear(2020);
        System.out.println(car);

        car.setYear(Car.MIN_YEAR);
        System.out.println(car);

        car.setYear(Car.MAX_YEAR);
        System.out.println(car);

        car.setYear(Car.MAX_YEAR + 1);
        System.out.println(car);

        car.setYear(Car.MIN_YEAR - 1);
        System.out.println(car);

    }
}