package com.javachallenges.javaone;

@SuppressWarnings(value = "all")
public class LambdaChallenge {
	public static void main(String ... doYourBest) {
		String vitoShoot = useRevolver(RevolverShoot::shoot);
		String michaelShoot = useShotgun(
		        () -> {return "shotgun";});
		
		System.out.println(vitoShoot + michaelShoot);
	}
	private static String useRevolver(Revolver revolver) {
		return revolver.shoot();
	}

    static class RevolverShoot{
        static String shoot(){ return "revolver"; }
    }

	static String useShotgun(Shotgun shotgun) {
		return shotgun.shoot();
	}

    @FunctionalInterface
    private interface Revolver {
        String shoot();
    }
	public interface Shotgun {
		String shoot();
		default String reload() {return "reloading..."; }
	}
}
