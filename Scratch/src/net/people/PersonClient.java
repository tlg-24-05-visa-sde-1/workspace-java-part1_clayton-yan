package net.people;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        LocalDate bDay = LocalDate.of(2000,1,3);
        Person person1 = new Person("Clayton", bDay);

        System.out.printf("%s is %s years old\n", person1.getName(), person1.age(person1.getBirthDate()));

        System.out.println(person1);

        PersonRecord p2 = new PersonRecord("Martina", LocalDate.of(1973, 6, 19));
        System.out.printf("%s is %s years old\n", p2.name(), p2.age());
        System.out.println(p2);
    }
}
