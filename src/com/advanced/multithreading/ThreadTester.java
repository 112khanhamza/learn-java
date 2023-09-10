package com.advanced.multithreading;

import java.util.Hashtable;

public class ThreadTester {

    public static void main(String[] args) {

        System.out.println("main is starting");

//        Thread1 thread1 = new Thread1("thread1"); // thread1 is child of main thread
//        thread1.start();

//        Thread thread2 = new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println(Thread.currentThread() + " " + i);
//            }
//        }, "thread2");
//        thread2.start();
//
//
//        new Thread().run();

//        Stack stack = new Stack(5);
//
//        new Thread(() -> {
//            int counter = 0;
//            while (++counter < 10) {
//                System.out.println("Pushed: " + stack.push(100));
//            }
//        }, "Pusher").start();
//
//        new Thread(() -> {
//            int counter = 0;
//            while (++counter < 10) {
//                System.out.println("Popped: " + stack.pop());
//            }
//        }, "Popper").start();

//        Thread thread3 = new Thread(() -> {
//            try {
//                Thread.sleep(1);
//                for (int i = 10000; i > 0; i--);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }, "States");
//
//        thread3.start();
//
//        while (true) {
//            Thread.State state = thread3.getState();
//            System.out.println(state);
//            if (state == Thread.State.TERMINATED) break;
//        }

        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread());
        }, "Our Thread");

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getPriority());

        System.out.println("main is exiting");
    }
}
