package pl.javaadvanced.threads.basics;

import static pl.javaadvanced.threads.ThreadColor.*;

public class MainThread {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Main thread in action!");

        Thread otherThread = new OtherThread();
        otherThread.setName("====OTHER THREAD====");
        otherThread.start(); //do wywołania wątku korzystany ze start() a nie run()
        //otherThread.run(); wywoływanie run() nie tworzy nowego wątku

        Thread runnableSample = new Thread(new RunnableSample());
        runnableSample.start();

        runnableSample = new Thread (new RunnableSample() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "overwritten RunnableSample");
                try {
                    otherThread.join();
                    System.out.println(ANSI_RED + "OtherThread terminated so I work again");
                } catch (InterruptedException e) {
                    System.out.println("Overridden Runnable terminated");
                }
            }
            });
        runnableSample.start();

        //otherThread.interrupt(); //przerwij drzemkę OtherThread-a

        //wątek na klasie anonimowej
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Anonymous class based thread running!!!");
            }
        }.start();

        System.out.println(ANSI_PURPLE + "End of main!");
    }
}
