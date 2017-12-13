package com.javachallenges.javaone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;


@SuppressWarnings({"all", "everything", "javaChallenges"})
public strictfp class IsItGoingToCompileChallenge <A extends Object,B,
        $OP, __ThatIsIt extends HashMap<A, B>> {

    $OP a = ($OP) new Serializable() {};
    B b; $OP _, $ThatIsIt;
    __ThatIsIt _s = (__ThatIsIt) new HashMap<>();

    String String;
    Long Long;

	transient final int transientAtribute = 5;;;;;;;
	static class A { class B<ItWontCompile> {}}
	volatile int volatileAttribute = 5;

	strictfp synchronized<NoBugsProject> void strictfpMethod(NoBugsProject noBugsProject) {
		new IsItGoingToCompileChallenge.A().new B();

		Arrays.asList(noBugsProject.getClass().getMethods())
				.forEach(System.out::println);

		for(;;System.out.println("ItWon'tCompile"));
	}
	static native <WhatIfItCompile extends Object> double nativeMethod();
}

