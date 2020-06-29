package pl.javaadvanced.threads.counter;

import static pl.javaadvanced.threads.ThreadColor.*;

public class Countdown {
    private int i;

    public void doCountdown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread1":
                color = ANSI_CYAN;
                break;
            case "Thread2":
                color = ANSI_PURPLE;
                break;
            default:
                color = ANSI_BLUE;
        }

        //zabezpieczenie przed konkurowaniem o zasoby
        synchronized (this) {
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + " i = " + i);
            }
        }
    }
}
