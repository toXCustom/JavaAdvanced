package pl.javaadvanced.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowExceptionSample {

    //rzucamy wyjątek w przypadku gdy ktoś wykona interrupt()
    public void sleepThread() throws InterruptedException {
        Thread.sleep(10);
    }

    //rzucamy wyjątek przy interrupt() albo gdy nie znajdziemy pliku
    public void sleepThreadFile() throws InterruptedException, FileNotFoundException {
        Thread.sleep(20);
        new FileReader("/usr/grcy/aaaa.txt");
    }
}
