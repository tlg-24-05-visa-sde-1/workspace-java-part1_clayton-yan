package net.people;

import java.time.LocalDate;
import java.time.Period;

/*
 * Immutable class, prop can't be changed
 */
class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * Returns Person's age in whole years
     */
    public int age(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
