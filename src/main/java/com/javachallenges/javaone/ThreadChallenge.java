package com.javachallenges.javaone;

public class ThreadChallenge {
    private static int wolverineAdrenaline = 10;

    public static void main(String... doYourBest) throws InterruptedException {
        new Motorcycle("first").start();
        new Motorcycle("second").start();
        new Motorcycle("third").start();

        Motorcycle fastBike = new Motorcycle("last");
        fastBike.setPriority(Thread.MAX_PRIORITY);
        fastBike.setDaemon(true);
        fastBike.start();
    }

    static class Motorcycle extends Thread {
        public Motorcycle(String bikeName) { super(bikeName); }

        @Override public void run() {
            wolverineAdrenaline++;
            if (wolverineAdrenaline == 14) {
                System.out.println(this.getName());
            }
        }
    }
}
