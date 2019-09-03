package com.company;

public class Runner extends Thread {
    public Runner(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1 ; i < 6 ; i++) {
            if (i<5) {
                System.out.println(new Runner("Runner " + i).getName() + " берет палочку ");
                System.out.println(new Runner("Runner " + i).getName() + " бежит к " + new Runner("Runner " + ++i).getName());
                i--;
                try {
                    sleep(5000);
                } catch (InterruptedException e) {

                }
            }else {
                System.out.println(new Runner("Runner " + i).getName() + " берет палочку ");
                System.out.println(new Runner("Runner " + i).getName() + " бежит к финишу ");
            }
        }


        super.run();
    }
}
