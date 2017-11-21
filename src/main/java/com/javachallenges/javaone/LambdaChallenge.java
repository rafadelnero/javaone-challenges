package com.javachallenges.javaone;

/** Soon you will see the answers on 
 * 		nobugsproject.com*/
public class LambdaChallenge {
	public static void main(String ... doYourBest) {
		String vitoCorleoneShoot = useRevolver(() -> "revolver");
		String michaelCorleoneShoot = useShotgun(() -> 
			{return "shotgun";});
		
		System.out.println(vitoCorleoneShoot + 
				michaelCorleoneShoot);
	}
	private static String useRevolver(Revolver revolver) {
		return revolver.shoot();
	}
	static String useShotgun(Shotgun shotgun) {
		return shotgun.shoot();
	}
	private interface Revolver { String shoot(); }
	
	public interface Shotgun {
		String shoot();
		default  String reload() {return "Reloading..."; }
	}
}
