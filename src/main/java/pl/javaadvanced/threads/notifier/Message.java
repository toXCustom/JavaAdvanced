package pl.javaadvanced.threads.notifier;

import static pl.javaadvanced.threads.ThreadColor.ANSI_BLUE;
import static pl.javaadvanced.threads.ThreadColor.ANSI_GREEN;

public class Message {
    private String message;
    private boolean empty;

    public synchronized String read() {
        while(empty) {
            //poczekaj aż ktoś / coś wywoła write() dzięki czemu będzie
            //jakaś wartość do odczytanie
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ANSI_GREEN + "Błąd odczytu");
            }
        }
        System.out.println("Ktoś zapisał wiadomość więc mogę odczytać kolejną!");
        empty = true;
        notifyAll(); //powiadom wszystkie wątki że kończysz działanie
        return message;
    }

    public synchronized void write(String message) {
        while(!empty) {
            //poczekaj aż ktoś / coś wywoła read() co spowoduje odczytanie wiadomości
            //i spowoduje ostawienie wmpty na true
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ANSI_BLUE + "Błąd zapisu");
            }
        }
        System.out.println("Ktoś odczytał wiadomość więc mogę zapisać nową!");
        empty = false;
        this.message = message;
        notifyAll(); // powiadom wszystkich że kończę działanie (w domyśle na wspóldzieloncy zasobach)
    }
}
