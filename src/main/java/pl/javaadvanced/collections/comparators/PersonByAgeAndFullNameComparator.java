package pl.javaadvanced.collections.comparators;

import pl.javaadvanced.collections.Person;

import java.util.Comparator;

public class PersonByAgeAndFullNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person person, Person person2) {
        if (person.getAge() != person2.getAge()) {
            return person.getAge() - person2.getAge();
        }
        return person.getFullName().compareTo(person2.getFirstName());
    }
}
