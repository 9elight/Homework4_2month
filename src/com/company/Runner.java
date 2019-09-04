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
                break;
            case "Runner 2":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к " + r3.getName());
                try {
                    sleep(5000);
                } catch (InterruptedException e) {

                }
                r3.start();
                break;
            case "Runner 3":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к " + r4.getName());
                try {
                    sleep(5000);
                } catch (InterruptedException e) {

                }
                r4.start();
                break;
            case "Runner 4":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к " + r5.getName());
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                }
                r5.start();
                break;
            case "Runner 5":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к финишу");
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                }

                super.run();

        }

    }
}