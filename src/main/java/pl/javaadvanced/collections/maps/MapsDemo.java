package pl.javaadvanced.collections.maps;

import pl.javaadvanced.collections.Person;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 34, "77212233322");
        Person person2 = new Person("Maria", "Jedrej", 32, "85233331122");
        Person person3 = new Person("Wojciech", "Majkut", 55, "66212123322");
        Person person4 = new Person("Anna", "Nowak", 75, "45221100112");
        Person person5 = new Person("Robert", "Malec", 44, "77212233322");

        //określamy klucz 1 wartość
        //klucz jest niepowtarzalny
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, person1);
        personMap.put(2, person2);
        personMap.put(3, person3);
        personMap.put(4, person4);
        personMap.put(5, person5);
        personMap.put(6, person1);

        personMap.values().forEach(p -> printPersonData(p));

        System.out.println();
        System.out.println("=============================");
        System.out.println("=======Person by PESEL=======");
        System.out.println("=============================");

        Map<String, Person> personMapByPesel = new HashMap<>();
        personMapByPesel.put(person1.getPesel(), person1);
        personMapByPesel.put(person2.getPesel(), person2);
        personMapByPesel.put(person3.getPesel(), person3);
        personMapByPesel.put(person4.getPesel(), person4);
        personMapByPesel.put(person5.getPesel(), person5);

        if (personMapByPesel.containsKey(person2.getPesel())) {
            System.out.println("Person 2 istnieje");
        }

        if (personMap.containsValue(person5)) {
            System.out.println("Person 5 znaleziony w pierwszej mapie");
        }

        personMapByPesel.values().forEach(p -> printPersonData(p));
        System.out.println("Wielko pierwsze mapy : " + personMap.size());

        //keySet() wyciąga zestaw kluczy
        //forEach to iterowanie po kluczach
        //get(k) to wyciąganie obiektu o podanym kluczu
        personMap.keySet().forEach(k -> personMap.get(k));
    }

    private static void printPersonData(Person person) {
        System.out.println(person.getFirstName() + " " + person.getSurName() + " " + person.getPesel() + " " + person.getAge());
    }
}
