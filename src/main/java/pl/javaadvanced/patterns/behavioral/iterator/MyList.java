package pl.javaadvanced.patterns.behavioral.iterator;

public interface MyList<E> {
    MyIterator<E> iterator();
}
