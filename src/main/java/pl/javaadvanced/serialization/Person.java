package pl.javaadvanced.serialization;

import java.io.Serializable;

//interfejs Serializable oznacza klasę jako możliwa do serializacji
//czyli do zapisania obiektów klasy np do pliku
public class Person implements Serializable {
    private String firstName;
    private String surName;
    private int age;
    //transent oznacza że to pole nie podlega serializacji
    private transient int id;

    public Person(String firstName, String surName, int age, int id) {
        this.firstName = firstName;
        this.surName = surName;
        this.age = age;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + firstName + '\'' +
                ", SurName='" + surName + '\'' +
                ", Age='" + age + '\'' +
                ", Id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }
}
