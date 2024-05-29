package net.people;

import java.time.LocalDate;
import java.time.Period;

record PersonRecord(String name, LocalDate birthDate) {
    // for free, you get the following in the PersonRecord.class file Java 17:

    // two private fields

    // 2-arg ctor

   // getters for each

   // toString()

    public int age() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }


}