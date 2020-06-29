package pl.javaadvanced.collections;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person personEach;

    /*@BeforeAll
    void SampleCommonSetup() {
        //wykona się raz dla klasy
    }*/

    @BeforeEach
    void setupEach() {
        //wykona się przed każdym testem
        personEach = new Person("Maria", "Nowak", 22, "33334444");
    }

    @Test
    void testNameForCommonPerson() {
        //given

        //when
        String name = personEach.getFirstName();

        //then
        assertEquals("Maria", name);
    }

    @Test
    void checkPersonFullNameAvailable() {
        //given
        //dane wejścione (początkowe)
        Person person = new Person("Jan", "Kowalski", 34, "111223345");

        //when
        //testowana operacja (metoda, proces)
        String check = person.getFullName();

        //then
        //sprawdzanie wyników (porównanie z oczekiwanym)
        assertEquals("Kowalski Jan", check);
    }

    //@Disabled nie robi danego testu
    @Test
    void checkReturnPersonAge() {
        //given
        //dane wejścione (początkowe)
        Person person = new Person("Jan", "Kowalski", 34, "111223345");

        int age = person.getAge();

        assertEquals(34, age);
    }

    /*@AfterAll

    @AfterEach*/
}