package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // fields
    private double rate;
    private double hours;

    // constructors
    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate); // delegate to neighboring ctor
        setRate(rate);
        setHours(hours);
    }

    // getter/setter

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    // toString

    @Override
    public String toString() {
        return super.toString() +
                ", rate= " + getRate() +
                ", hours= " + getHours() +
                '}';
    }

    @Override
    public void pay() {
        System.out.println(getName() + "is paid at " + getRate() + " * " + getHours());
    }

    @Override
    public void payTaxes() { // interface TaxPayer
        System.out.println(getName() + " paid taxes of " + (getRate() * getHours() * TaxPayer.HOURLY_TAX_RATE));
    }
}
