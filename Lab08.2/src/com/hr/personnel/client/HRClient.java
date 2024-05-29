/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 12000));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 23, 50));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // Exec
        dept.addEmployee(new Executive("Clayton", LocalDate.of(2020,2,2), 1_500_000));

        // lab begin
        dept.addEmployee(new SalariedEmployee("Clayton Future", LocalDate.of(2025,9, 23), 100_000));
        dept.addEmployee(new HourlyEmployee("Clayton Present", LocalDate.of(2024, 5, 7), 34, 2000));
        dept.listEmployees();

        // pay
        System.out.println("pay here");
        dept.payEmployees();

        // holiday break
        System.out.println("Holiday employees");
        dept.holidayBreak();

    }
}