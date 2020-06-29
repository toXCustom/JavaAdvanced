package pl.javaadvanced.threads.basics;

import static pl.javaadvanced.threads.ThreadColor.ANSI_BLUE;

//jedna z metod na nowy wątek to klasa rozszerzająca klasę Thread
public class OtherThread extends Thread {
    //żeby nowy wątek miał co robić to musimy nadpisać metodę run i w niej wywołać to co chcemy żeby wątek wykonał
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "thread name: " + currentThread().getName());

        try {
            sleep(4000); //usypianie / czekanie przez x milisekund
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "somebody broke my sleep so I'm awake to fast!");
            return;
        }

        System.out.println(ANSI_BLUE + "Enought sleeping, back to work!");
    }
}
