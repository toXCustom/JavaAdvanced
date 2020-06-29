package pl.javaadvanced.collections.comparators;

import pl.javaadvanced.collections.Person;

import java.util.Comparator;

public class PersonByFullnameComparator implements Comparator<Person> {

    @Override
    public int compare(Person person, Person person2) {
        if (!person.getFullName().equals(person2)) {
            return person.getFullName().compareTo(person2.getFullName());
        }

        return 0;
    }
}
