package com.entertainment.client;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.Television;

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note = "Note: supported displays are " + Arrays.toString(Television.VALID_BRANDS) + "\n" +
                    "Volume must be " + Television.MIN_VOLUME + "and " + Television.MAX_VOLUME + "\n" +
                    "Display must be " + Arrays.toString(DisplayType.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

        // step 1: convert from string into proper types
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2]);

        // step 2: create a Television obj from these three values
        Television newTV = new Television(brand, volume, display);

        // step 3: congratulate them on their order, print the resulting TV
        System.out.println("Congratulations! You created a new TV");
        System.out.println(newTV);
    }
}