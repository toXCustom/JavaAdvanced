package pl.javaadvanced.collections.comparators;

import pl.javaadvanced.collections.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 34, "77212233322");
        Person person2 = new Person("Maria", "Jedrej", 22, "85233331122");
        Person person3 = new Person("Wojciech", "Majkut", 55, "66212123322");
        Person person4 = new Person("Anna", "Nowak", 75, "45221100112");
        Person person5 = new Person("Robert", "Malec", 44, "77212233322");
        Person person6 = new Person("Paweł", "Rutek", 22, "85233331122");
        Person person7 = new Person("Robert", "Bilka", 22, "85233331122");

        //ArrayList<Person> persons = new ArrayList<>();
        //Najczęściej (99,999%) będzie tak że zmienną (pole) będziemy określać typem ogólnym
        List<Person> persons = new ArrayList<>();

        //Nowa lista zainicjowana zawartościa listy persons
        List<Person> linkedPersons = new LinkedList<>(persons);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);

        System.out.println("================");
        for (Person person : persons) {
            printPersonData(person);
        }

        System.out.println("================");
        //sortowanie komparatorem domyślnym (z klasy Person)
        Collections.sort(persons);
        for (Person person : persons) {
            printPersonData(person);
        }

        System.out.println("================");
        //sortowanie komparatorem domyślnym (z klasy Person)
        Collections.sort(persons, new PersonByFullnameComparator());
        for (Person person : persons) {
            printPersonData(person);
        }

        System.out.println("================");
        //sortowanie komparatorem domyślnym (z klasy Person)
        Collections.sort(persons, new PersonByAgeAndFullNameComparator());
        for (Person person : persons) {
            printPersonData(person);
        }
    }

    private static void printPersonData(Person person) {
        System.out.println(person.getFirstName() + " " + person.getSurName() + " " + person.getPesel() + " " + person.getAge());
    }
}
