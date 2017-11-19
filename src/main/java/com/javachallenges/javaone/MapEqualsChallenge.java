package com.javachallenges.javaone;

import java.util.*;

public class MapEqualsChallenge {
    public static void main(String... doYourBest) {
        Map<Griffin, String> map = new LinkedHashMap<>();
        map.put(new Griffin("Chris"),  "1");
        map.put(new Griffin("Lois"),   "2");
        map.put(new Griffin("Peter"),  "3");
        map.put(new Griffin("Brian"),  "4");
        map.put(new Griffin("Stewie"), "5");

        map.forEach((k, v) -> System.out.print(v + "> "));
    }
    static class Griffin {
        String name;
        Griffin(String name) {this.name = name;}

        public boolean equals(Object obj) {
            return ((Griffin)obj).name.length() == this.name.length(); }

        public int hashCode() { return (name.length() % 1) * 37; }
    }
}