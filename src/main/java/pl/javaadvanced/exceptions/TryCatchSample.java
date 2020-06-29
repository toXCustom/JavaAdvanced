package pl.javaadvanced.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchSample {

    public void sleepThread (long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Wystąpił błąd!");
            e.printStackTrace();
        }
    }

    public void sleepOverFile (long millis, String fileName) {
        try {
            Thread.sleep(millis);
            new FileReader(fileName);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception caught!");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void sleepOverFileSingleCatch (long millis, String fileName) {
        try {
            Thread.sleep(millis);
            new FileReader(fileName);
        }
        //multicatch wprowadzony od Javy 1.7
        catch (InterruptedException | FileNotFoundException exception) {
            System.out.println("Interrupted Exception caught");
            exception.printStackTrace();
        }
    }

    public void CatchHerarchy (long millis, String fileName) {
        try {
            Thread.sleep(millis);
            new FileReader(fileName);
        }
        //wyłapanie Exceptionw tym miejscu powoduje że poniższe wyjątki nie mają sensu
        //bo wszystko zostanie wyłapane w jednym miesjcu
//        catch (Exception e) {
//        e.printStackTrace();
//        }
        //multicatch wprowadzony od Java 1.7
        catch (InterruptedException | FileNotFoundException exception) {
            System.out.println("Interrupted Exception caught");
            exception.printStackTrace();
        } catch (Exception e) {
            System.out.println("Some more generic exception caught!");
            System.out.println(e.getStackTrace());
        }
    }
}
