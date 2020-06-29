package pl.javaadvanced.simpleIO;

import java.io.*;
import java.util.*;

public class ReadWriteFile {

    public static void main(String[] args) {
        ReadWriteFile readWriteFile = new ReadWriteFile();
        readWriteFile.simpleWriteToFile();

        String filename = "SecondFile.txt";
        readWriteFile.writeToFileWithResources(filename);

        readWriteFile.readSimpleFile(filename);

        List<DataStorage> storage = getPreparedData();
        String bufferedFileName = "BufferedFile.txt";
        try {
            readWriteFile.writeFileWithBuffer(bufferedFileName, storage);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<Integer, DataStorage> fileContent = readWriteFile.readBufferedFile(bufferedFileName);
        System.out.println("==============================");
        System.out.println("reading from csv-style file");
        for (DataStorage value : fileContent.values()) {
            System.out.println(value.getIndex() + " || " + value.getFirstLine() + " || " + value.getSecondLine());
        }
    }

    private static List<DataStorage> getPreparedData() {
        List<DataStorage> storage = new ArrayList<>();
        storage.add(new DataStorage(0, "first column", "second column"));
        storage.add(new DataStorage(1, "Marek", "Babiarz"));
        storage.add(new DataStorage(2, "Przemysław", "Grad"));

        return storage;
    }

    public boolean simpleWriteToFile() {
        try {
            //najprostsza klasa do pisania do pliku
            FileWriter fileWriter = new FileWriter("SimpleIO.txt"); //może rzucić IOException

            //metoda write wrzuca do pliku
            fileWriter.write("Sample line one \n");
            fileWriter.write("Sample line two");

            //close zamyka połączenie z plikiem
            fileWriter.close();
            return true;
        } catch (IOException e) {
            //wyrzucenie na (domyślnie) wkran srosu wywołania gdzie wystąpił błąd
            e.printStackTrace();
        }
        return false;
    }

    public boolean writeToFileWithResources(String filename) {
        final String delimiter = "\n";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Second file line 1" + delimiter);
            writer.write("Second file line 2");

            //try-with-resourses to zasoby zamknie za nas JVM, nie musimy robić writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean readSimpleFile(String filename) {
        try {
            Scanner scanner = new Scanner(new FileReader(filename));
            scanner.useDelimiter("\n");
            System.out.println("Reading file: " + filename);

                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }

                scanner.close();
            }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return false;
    }

    public void writeFileWithBuffer(String filename, List<DataStorage> storage) throws IOException {
        String fieldSeparator = ";";
        String lineSeparator = "\n";

        BufferedWriter file = new BufferedWriter(new FileWriter(filename));

        for (DataStorage el : storage) {
            file.write(el.getIndex() + fieldSeparator +
                    el.getFirstLine() + fieldSeparator +
                    el.getSecondLine() + lineSeparator);
        }

        file.close();
    }

    public Map readBufferedFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            //mapa (klucz - wartość) gdzie kluczem będzie index a wartością pojedynczy wpis do DataStorage
            Map<Integer, DataStorage> dataStorageMap = new HashMap<>();
            String input;
            String fieldSeparator = ";";

            //dopóki odczyt nowej linii nie zwróci null-a (w samym warunku od razy wpisujemy linię do pola "input"
            while ((input = reader.readLine()) != null) {
                //rozbijamy linię na tabelę korzystając z separatora
                String[] dataline = input.split(fieldSeparator);
                //pierwszy element tabeli przepisujemy do int-a
                int index = Integer.parseInt(dataline[0]);
                //dodajemy nowy obiekt DataStorage
                DataStorage storage = new DataStorage(index, dataline[1], dataline[2]);
                //dodajemy do mapy nowy wpis (index, dataStorage)
                dataStorageMap.put(index, storage);
            }

            return dataStorageMap;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
