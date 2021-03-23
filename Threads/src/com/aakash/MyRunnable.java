package com.aakash;

import static com.aakash.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnables implementation of run()");
    }
}
