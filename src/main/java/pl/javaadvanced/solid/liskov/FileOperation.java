package pl.javaadvanced.solid.liskov;

public interface FileOperation {
    byte[] read();

    void write(byte[] data);
}
