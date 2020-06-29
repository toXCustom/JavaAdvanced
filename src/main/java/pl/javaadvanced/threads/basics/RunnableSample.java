package pl.javaadvanced.threads.basics;

import static pl.javaadvanced.threads.ThreadColor.ANSI_RED;

public class RunnableSample implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Runnable sample working");
    }
}
