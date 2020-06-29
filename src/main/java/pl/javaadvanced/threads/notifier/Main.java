package pl.javaadvanced.threads.notifier;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();

        (new Thread(new Writer(message))).start(); //anonimowe wywołanie wątku
        (new Thread(new Reader(message))).start(); //anonimowe wywołanie wątku

        //Thread readerThread = new Thread(new Reader(message)); nieanonimowe wywołanie wątku
        //readerThread.start();
    }
}
