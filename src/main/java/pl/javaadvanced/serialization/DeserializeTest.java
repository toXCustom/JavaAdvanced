package pl.javaadvanced.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeTest {
    public static void main(String[] args) {
        Person person = null;

        try {
            //fileInputStream określa plik z którego będziemy czytać
            FileInputStream fileInputStream = new FileInputStream("PersonSerialized.dat");
            //objectInputStream określa strumień wejściowy (w naszym wypadku to będzie w/w plik)
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            person = (Person)objectInputStream.readObject();

            fileInputStream.close();
            objectInputStream.close();

            System.out.println(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
