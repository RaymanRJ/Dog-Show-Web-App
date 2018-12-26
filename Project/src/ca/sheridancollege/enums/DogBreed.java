package ca.sheridancollege.enums;

import java.util.Random;
/*
 * DO NOT USE THIS ENUM.
 * 
 * IT WAS ONLY MEANT FOR CREATING SAMPLE DATA.
 */
public enum DogBreed {
	Bulldog, German_Shepherd, Labrador_Retriever, Beagle, Poodle, Golden_Retreiver, Chihuahua, Pug,
	Boxer, Dachshund, Maltese, Yorshire_Terrier, French_Bulldog, Siberian_Husky;
	
	private static Random rand = new Random(System.currentTimeMillis());
	
	public static DogBreed getRandomDogBreed() {
		int size = DogBreed.values().length;
		
		return DogBreed.values()[rand.nextInt(size)];
	}
	
	public static DogBreed getDogBreed(String dogBreed) {
		int index = dogBreed.indexOf(' ');
		if (index > 0) {
			dogBreed = dogBreed.replace(' ', '_');
		}
		
		for(DogBreed db : DogBreed.values()) {
			if (dogBreed.equals(db.toString())){
				return db;
			}
		}
		
		return null;
	}
	
	public String toSaveString() {
		String toSaveString = this.toString();
		
		int index = toSaveString.indexOf('_');
		if(index > 0) {
			toSaveString = toSaveString.replace('_', ' ');
		}
		
		return toSaveString;
	}
}