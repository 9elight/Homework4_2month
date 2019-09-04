package com.company;

import javax.swing.table.TableRowSorter;

public class Runner extends Thread {
    public Runner(String name) {
        super(name);
    }


    @Override
    public void run() {
        Runner r2 = new Runner("Runner 2");
        Runner r3 = new Runner("Runner 3");
        Runner r4 = new Runner("Runner 4");
        Runner r5 = new Runner("Runner 5");

        switch (Thread.currentThread().getName()) {
            case "Runner 1":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к " + r2.getName());
                try {
                    sleep(5000);
                } catch (InterruptedException e) {

                }
                r2.start();
                try {
                    r2.join();
                    System.out.println(Thread.currentThread().getName() + " берет палочку ");
                } catch (InterruptedException e) {

                }
                break;
            case "Runner 2":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к " + r3.getName());
                try {
                    sleep(5000);
                } catch (InterruptedException e) {

                }
                r3.start();
                try {
                    r3.join();
                    System.out.println(Thread.currentThread().getName() + " берет палочку");
                    System.out.println(Thread.currentThread().getName() + " бежит к " + new Runner("Runner 1").getName());
                    sleep(5000);
                } catch (InterruptedException e) {}

                break;
            case "Runner 3":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к " + r4.getName());
                try {
                    sleep(5000);
                } catch (InterruptedException e) {

                }
                r4.start();
                try {
                    r4.join();
                    System.out.println(Thread.currentThread().getName() + " берет палочку");
                    System.out.println(Thread.currentThread().getName() + " бежит к " + r2.getName());
                    sleep(5000);
                } catch (InterruptedException e) {}
                break;
            case "Runner 4":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к " + r5.getName());

                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                }
                r5.start();
                try {
                    r5.join();
                    System.out.println(Thread.currentThread().getName() + " берет палочку");
                    System.out.println(Thread.currentThread().getName() + " бежит к " + r3.getName());
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case "Runner 5":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к финишу");
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                }
                System.out.println(Thread.currentThread().getName() + " бежит к " + r4.getName());

                super.run();

        }


    }
}