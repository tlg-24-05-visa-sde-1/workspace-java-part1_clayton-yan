package org.math;

class CalculatorClient {
    public static void main(String[] args) {

        double sum = Calculator.add(1.6, 2.8);
        System.out.println(sum);

        System.out.println("difference is: " + Calculator.subtract(1, 2));

        boolean result = Calculator.isEven(9);
        System.out.println("result is: " + result);

        int randInt = Calculator.randomInt();
        System.out.println("randInt winner is: " + randInt);

        int randInt2 = Calculator.randomInt(1,9);
        System.out.println("randInt2 winner is: " + randInt2);


        double avg = Calculator.average(3, 5, 10, 13);
        System.out.println("The average is " + avg);


        double avg1 = Calculator.average(3,5,10,13);
        System.out.println("The average is " + avg1);


    }
}