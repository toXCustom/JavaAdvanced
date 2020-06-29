package pl.javaadvanced.patterns.behavioral.observer;

public interface Observer {

    void update();

    void setSubject(Subject s);
}
