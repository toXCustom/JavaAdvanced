package pl.javaadvanced.threads.notifier;

import java.util.Random;

public class Writer implements Runnable {
    private Message message;
    private String[] messagesToWrite = {"Line1", "Line2", "Line3", "Line4", "Line5"};

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i = 0; i < messagesToWrite.length; i++) {
            message.write(messagesToWrite[i]);
            try {
                //random.nextInt(4000) oznacza "wylosuj liczbę int nie większą niż 4000
                //Thread.sleep dostaje tą piczbę i to jest ilość milisekund na jaką usypia wątek
                Thread.sleep(random.nextInt(4000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        message.write("====KONIEC TRANSMISJI====");
    }
}
