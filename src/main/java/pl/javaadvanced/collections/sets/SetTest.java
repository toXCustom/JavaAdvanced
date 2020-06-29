package pl.javaadvanced.collections.sets;

import pl.javaadvanced.collections.Person;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 34, "77212233322");
        Person person2 = new Person("Maria", "Jedrej", 32, "85233331122");
        Person person3 = new Person("Wojciech", "Majkut", 55, "66212123322");
        Person person4 = new Person("Anna", "Nowak", 75, "45221100112");
        Person person5 = new Person("Robert", "Malec", 44, "77212233322");

        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person4);

        personSet.forEach(s -> printPersonData(s));

        System.out.println();

        personSet.remove(person4);
        System.out.println("====================");
        System.out.println("======TREE SET======");
        System.out.println("====================");
        Set<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(1);
        integerTreeSet.add(3);
        integerTreeSet.add(2);
        integerTreeSet.add(4);
        integerTreeSet.add(1);
        integerTreeSet.forEach(p -> System.out.println(p));

        System.out.println();

        System.out.println("====================");
        System.out.println("=====LINKED SET=====");
        System.out.println("====================");
        Set<Integer> integerLinkedHashSetSet = new LinkedHashSet<>();
        integerLinkedHashSetSet.add(1);
        integerLinkedHashSetSet.add(3);
        integerLinkedHashSetSet.add(2);
        integerLinkedHashSetSet.add(4);
        integerLinkedHashSetSet.add(1);
        integerLinkedHashSetSet.forEach(p -> System.out.println(p));
    }

    private static void printPersonData(Person person) {
        System.out.println(person.getFirstName() + " " + person.getSurName() + " " + person.getPesel() + " " + person.getAge());
    }
}
