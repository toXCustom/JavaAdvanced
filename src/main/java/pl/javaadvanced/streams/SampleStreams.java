package pl.javaadvanced.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleStreams {
    public static void main(String[] args) {
        //generowanie Strumienia z tablicy
        Stream<Integer> streamFromStream = Set.of(1, 2, 3, 4, 5).stream();
        //ze zbioru elementów
        Stream<Integer> streamFromSet = Set.of(1, 2, 3, 4, 5).stream();

        //z kolekcji
        List<Integer> integerList = Arrays.asList(3, 4, 5, 6, 6, 7, 7, 8, 9);
        Stream<Integer> streamFromList = integerList.stream();

        //filtrowanie i wypisywanie
        System.out.println("Filtrowanie i wypisywanie");
        streamFromList.filter(s -> s > 4)
                .forEach(s -> System.out.println(s));
        //powyższe zastąpi pętle po wszystkich elementach kolekcji i wypisanie tych większych od 4
        System.out.println("=================================");

        //sortowanie i wypisywanie
        System.out.println("Sortowanie i wypisywanie");
        integerList.stream()
                //do metory sorted przekazane żeby sortował odwrotnie od naturalnego porządku
                .sorted(Comparator.reverseOrder())
                //jak mamy metodę do której jako argument przekazujemy jeden cały element
                //to zapis może wyglądać tak: pakiet::metoda
                .forEach(System.out::println);
        System.out.println("=================================");

        //wartości unikalne i wypisywanie
        System.out.println("Wartości unikalne i wypisywanie");
        integerList.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("=================================");

        //przekształcenie i wypisywanie
        System.out.println("Przekształcenie i wypisywanie");
        integerList.stream()
                .map(el -> el - 2)
                .forEach(System.out::println);
        System.out.println("=================================");

        //filtrowanie, przekształcanie i wypisywanie
        //operacje na strumieniach wykonują się sekwencyjnie
        System.out.println("Filtrowanie, przekształcanie (operacja na elemencie) i wypisywanie");
        integerList.stream()
                .filter(x -> x > 4)
                .filter(x -> x < 8)
                .map(el -> el - 2)
                .forEach(System.out::println);
        System.out.println("=================================");

        //spłaszcznie (łączenie) i wyświetlanie
        System.out.println("Spłaszczenie - złącznie wielu kolekcji - i wypisywanie");
        List<Integer> anotherList = Arrays.asList(11, 13, 15);
        Stream.of(integerList, anotherList)
                .flatMap(s -> s.stream())
                .forEach(System.out::println);
        System.out.println("=================================");

        //Trzy elementy do nowej kolekcji
        System.out.println("Trzy elementy do nowej kolekcji");
        List<Integer> listOfThree =  integerList.stream()
                //wybór 3 elementów strumienia
                .limit(3)
                //przepisanie do nowej listy
                .collect(Collectors.toList());
                //.stream.forEach(); tu można robić operację dalej ale stream jest nowy, ten z listy 3 elementowej

        listOfThree.stream().forEach(System.out::println);
        //.forEach(s -> System.out.println(s));
        System.out.println("=================================");

        //złączenie elementów do 1 String-a
        System.out.println("Złączenie do String-a");
        String result = integerList.stream()
                .filter(el -> el * el < 37)
                .map(el -> el.toString())
                .collect(Collectors.joining(" "));
        System.out.println(result);
        System.out.println("=================================");

        System.out.println("Pierwszy większy od 7");
        Integer intResult = integerList.stream()
                .filter(el -> el > 7)
                .findFirst() //zwraca Optional<Integer>
                //jak filter eyfiltruje wszystkie element to zadziała orElse
                .orElse(Integer.parseInt("-1"));
                //.orElseGet(new Integer(-1));
        System.out.println(intResult);
        System.out.println("=================================");

        System.out.println("Dowolny większy od 7");
        Integer intAnyResult = integerList.stream()
                .filter(el -> el > 7)
                .findAny() //zwraca Optional<Integer>
                //jak filter eyfiltruje wszystkie element to zadziała orElse
                .orElse(Integer.parseInt("-1"));
                //.orElseGet(new Integer(-1));
        System.out.println(intAnyResult);
        System.out.println("=================================");

        System.out.println("Reduce do sumy elementów");
        Integer sumResult = integerList.stream()
                .filter(x -> x < 8)
                .reduce(0, (currentSum, nextElement) -> currentSum + nextElement);
                //.reduce(Integer::sum);
        System.out.println(sumResult);
        System.out.println("=================================");
    }
}
