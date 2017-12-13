package com.javachallenges.javaone;

import java.util.ArrayList;
import java.util.List;

/**
 * a - It will not compile | b - Maggie c - RuntimeException at line 30 | d -
 * Homer
 */
@SuppressWarnings({ "all" })
public class GenericsChallenge {
	public static void main(String... doYourBest) {
		Factory factory = new Factory<Simpson>(new Simpson("Homer"));

		List<Simpson> list = factory.addToList(new ArrayList<Simpson>(), 
				new Simpson("Bart"));

		list.forEach(System.out::println);
	}

	static class Factory<T> {
		T t;
        public Factory(T t) {
            this.t = t;
        }

		public<T> List<T> addToList(List<T> anyObject, T t) {
            anyObject.add(t);
            anyObject.add((T) this.t);
			return anyObject;
		}
	}

    static class Simpson {
        String name;
        public Simpson(String name) { this.name = name; }
        public String toString() { return this.name; }
    }
}
