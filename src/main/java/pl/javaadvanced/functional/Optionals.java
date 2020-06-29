package pl.javaadvanced.functional;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        //Optional
        //zamiast if (costam != null)
        //albo    if (costam.isEmpty())

        //@Null
        //@Nullable

        //Optional akceptuje że obiekt został zwrócony lub zwrócono wartość pustą

        String casualString = new String("Casual");
        Optional<String> optionalString = Optional.of("OptionalValue");
        Optional<String> optionalEmpty = Optional.empty();

        String nullString = null;
        //poniżej przy tworzeniu zakładamy że nullString może (ale nie musi) być null-em
        Optional<String> optionalNull = Optional.ofNullable(nullString);

        //nie jest możliwe bezpośrednie przepisanie zawartości optionala do innego obiektu
        //String result = optionalString;

        if (optionalString.isPresent()) {
            System.out.println(optionalString.get());
        }

        if (!optionalEmpty.isEmpty()) {
            System.out.println("Empty optional:");
            System.out.println(optionalEmpty.get());
            System.out.println("====End of optional empty====");
        } else {
            System.out.println("Pomijam optionalEmpty bo jest puste");
        }

        /*List<String> sampleList = new LinkedList<>();
        if (sampleList.contains()) {

        }*/
    }

    public Optional<String> getOptional(String in) {
        //metoda robi coś i może zwrócić null-a albo String
        return Optional.ofNullable(in);
    }
}
