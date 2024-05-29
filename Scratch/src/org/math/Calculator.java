package org.math;

/*
 * This is an "all-static class" class, one w nothing but static methods
 * these methods are called from clients as Calculator.add()
 */
class Calculator {

    /*
     * Returns the average of the supplied integers
     * varargs
     */
    public static double average(int first, int... rest) { //first: 3,rest: 5,10,13
        double result = 0.0;

        int sum = first;
        for (int value : rest) {
            sum += value;
        }

        result = ((double) sum) / (rest.length + 1);
        return result;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    /*
     * Indicates if int is even or not
     */
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    /*
     * Returns a random int between 1 and 16 inclusive
     */
    public static int randomInt() {

//
        return randomInt(1, 16); // delegate
    }

    /*
     * Returns a random integer between min and max inclusive
     */
    public static int randomInt(int min, int max) {
//        return (int)(Math.random() * (max - min) + min);
        int result;
        double randomNumber = Math.random(); // 0 to 0.9999
        double scaled = randomNumber * (max - min + 1) + min;
        result = (int) scaled;


        return result;
    }

    /*
     * returns a random int between 1 and max
     */
    public static int randomInt(int max) {
        return randomInt(1, max);
    }
}