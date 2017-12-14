package com.javachallenges.javaone;

public class PolymorphismChallenge {
    static abstract class Simpson { void talk() {
        System.out.println("Simpson!"); }
    }

    static class Homer extends Simpson { public void talk() {
        System.out.println("Spider Pig!"); }
    }

    static class Bart extends Simpson {  protected void talk() {
        System.out.println("Eat my shorts!"); }
    }

    static class Lisa extends Simpson {  void talk(String toMe) {
        System.out.println("I love Sax!"); }
    }

    private static void tweet(Simpson simpson) {
        simpson.talk();
    }

    public static void main(String... doYourBest) {
        Homer homer = new Homer();
        tweet(homer);
        Simpson bart = new Bart();
        tweet(bart);
        Lisa lisa = new Lisa();
        lisa.talk();
    }
}