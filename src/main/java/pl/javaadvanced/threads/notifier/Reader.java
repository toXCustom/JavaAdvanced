package pl.javaadvanced.threads.notifier;

import java.util.Random;

public class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(String latestMessage = message.read();
        latestMessage != "====KONIEC TRANSMISJI====";
        latestMessage = message.read()) {
            System.out.println("Odczytano: " + latestMessage);
            try {
                Thread.sleep(random.nextInt(6000));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
