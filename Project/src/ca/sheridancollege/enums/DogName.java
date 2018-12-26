package ca.sheridancollege.enums;

import java.util.Random;

public enum DogName {
	Max, Charlie, Cooper, Buddy, Jack, Rocky, Oliver, Bear, Duke, Tucker,
	Bella, Lucy, Daisy, Luna, Lola,	Sadie, Molly, Maggie, Bailey, Sophie;
	
	private static Random rand = new Random(System.currentTimeMillis());
	
	public static DogName getRandomDogName() {
		int size = DogName.values().length;
		
		return DogName.values()[rand.nextInt(size)];
	}
}