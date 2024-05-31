package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) {
        // TODO: create an instance of Employee
        Employee employee = new Employee("Clayton");


        // TODO: call goToWork() on the Employee object


        try {
            employee.goToWork();
        } catch (WorkException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println();
            e.printStackTrace();
        }

    }
}