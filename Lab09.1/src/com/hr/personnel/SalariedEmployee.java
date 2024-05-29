package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // fields
    double salary;

    // constructors
    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate); // delegate to neighboring ctor
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString

    @Override
    public String toString() {
        return super.toString() +
                ", hireDate= " + getHireDate() +
                ", salary= " + getSalary() +
                '}';
    }

    @Override
    public void pay() {
        System.out.println(getName() + " is paid " + getSalary());
    }
    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid taxes of " + (getSalary() * TaxPayer.SALARIED_TAX_RATE));
    }
}
