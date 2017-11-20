package com.javachallenges.generics;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

/**
 * a - It will not compile | b - Maggie c - RuntimeException at line 30 | d -
 * Homer
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class GenericsChallenge {
	public static void main(String... doYourBest) {
		Factory factory = new Factory<Simpson>(new Simpson("Homer"));

		List<Simpson> list = factory.addToList(new ArrayList<Simpson>(), new Simpson("Bart"));

		list.forEach(System.out::println);
	}

	static class Factory<T> {
		T t;

        public Factory(T t) {
            this.t = t;
        }

		public<T> List<T> addToList(List<T> anyObject, T t) {
			anyObject.add((T) this.t);
            anyObject.add(t);
			return anyObject;
		}
	}

    static class Simpson {
        String name;
        public Simpson(String name) { this.name = name; }
        public String toString() { return this.name; }
    }
}
