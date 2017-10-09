package com.javachallenges.javaone;

public class ThreadChallenge {
    private int wolverineAdrenaline = 10;

    public static void main(String... doYourBest) throws InterruptedException {
        ThreadChallenge thread = new ThreadChallenge();

        thread.new Motorcycle("first").start();
        thread.new Motorcycle("second").start();
        thread.new Motorcycle("third").start();

        Motorcycle fastBike = thread.new Motorcycle("last");
        fastBike.setPriority(Thread.MAX_PRIORITY);
        fastBike.setDaemon(true);
        fastBike.start();
    }

    class Motorcycle extends Thread {
        public Motorcycle(String bikeName) { this.setName(bikeName); }

        @Override
        public void run() {
            wolverineAdrenaline++;
            if (wolverineAdrenaline == 14) {
                System.out.println(this.getName());
            }
        }
    }
}
