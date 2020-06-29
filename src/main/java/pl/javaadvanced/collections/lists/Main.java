package pl.javaadvanced.collections.lists;

import pl.javaadvanced.collections.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 34, "77212233322");
        Person person2 = new Person("Maria", "Jedrej", 32, "85233331122");
        Person person3 = new Person("Wojciech", "Majkut", 55, "66212123322");
        Person person4 = new Person("Anna", "Nowak", 75, "45221100112");
        Person person5 = new Person("Robert", "Malec", 44, "77212233322");

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

        System.out.println("================");
        for (Person person : persons) {
            printPersonData(person);
        }
        System.out.println("================");
        persons.forEach(Main::printPersonData);

        persons.remove(person3);
        System.out.println("================");
        persons.forEach(Main::printPersonData);

        persons.remove(1);
        persons.add(3, person4);
        System.out.println("================");
        persons.forEach(Main::printPersonData);

        //sprawdza czy na liście persons znajduje się obiekt person1
        if (persons.contains(person1)) {
            System.out.println("ZNALAZLEM!!!");
            printPersonData(person1);
        }

        List<Person> listToRemove = new ArrayList<>();
        listToRemove.add(person5);
        System.out.println("================");
        linkedPersons.forEach(p -> printPersonData(p));
        linkedPersons.removeAll(listToRemove);
    }

    private static void printPersonData(Person person) {
        System.out.println(person.getFirstName() + " " + person.getSurName() + " " + person.getPesel() + " " + person.getAge());
    }
}
