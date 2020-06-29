package pl.javaadvanced.exceptions;

import java.io.*;
import java.io.BufferedReader;

public class TryatchFinallySimple {

    public void readFile(String fileName) throws IOException {
        BufferedReader bufferedReader = null;
        try {
            //uchwyt do pliku
            bufferedReader = new BufferedReader(new FileReader(fileName));
            //łapanie wyjątku
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //finally wykona się NIEZALEŻNIE od tego czy będzie catch czy nie
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }

    public void readFileWithResorces(String fileName) {
        //try() działa tak że każdy zasób powołany w nawiasach
        //jest automatycznie zamykany na końcu dziłania bloku try-catch
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            return;
            //łapanie wyjątku
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
}
