package com.aakash;

import static com.aakash.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("-- Another Thread --");
        anotherThread.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "Another thread terminated, or timed out, so i'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wake after all. I was interrupted");
                }
            }
        });

        myRunnableThread.start();
        anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from the main thread");


    }
}
