package com.vehicle.client;

import com.vehicle.Car;
import com.vehicle.CarColor;

/*
 * should allow user to supply cmd line args for various fields
 */
class CarClientArgs {
    // check presence of args
    public static void main(String[] args) {
        if (args.length < 4) {
            String usage = "Usage: java CarClientArgs <color> <model> <year> <brand>";
            String example = "Example java CarClientArgs SILVER GLA 2021 MB";
            String note = "Note: Supported colors are BLACK RED GREY WHITE SILVER\n" +
                    "Years must be between " + Car.MIN_YEAR + " and " + Car.MAX_YEAR + ".\n";

            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return; // exit early
        }

        // we can proceed and show the user how many they input
        System.out.println("You provided " + args.length + " arguments");

        // now we convert string to proper
        CarColor carColor = CarColor.valueOf(args[0].toUpperCase());
        String model = args[1];
        int year = Integer.parseInt(args[2]);
        String brand = args[3];

        // create object
        Car newCar = new Car(carColor, model, year, brand);

        // print
        System.out.println("Congrats! You created: " + newCar);
    }


}