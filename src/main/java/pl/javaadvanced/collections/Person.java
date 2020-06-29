package pl.javaadvanced.collections;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String firstName;
    private String surName;
    private int age;
    private String pesel;

    public Person(String firstName, String surName, int age, String pesel) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getFullName() {
        return surName + " " + firstName;
    }

    public int getAge() {
        return age;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                firstName.equals(person.firstName) &&
                surName.equals(person.surName) &&
                pesel.equals(person.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surName, age, pesel);
    }

    @Override
    public int compareTo(Person person) {
        //wartość mniejsza od zero oznacza że "nasz" objekt jest "przed" tym porównanym
        //wartość równa 0 oznacza że wg zadanego kryterium obiekty są równe
        //wartość większa od 0 oznacza że obiekt person jest "przed" naszym "this"
        return this.age - person.getAge();
    }
}
