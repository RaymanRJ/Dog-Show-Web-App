package ca.sheridancollege.enums;

import java.util.Random;

public enum DogGender {
	MALE, FEMALE;
	private static Random rand = new Random(System.currentTimeMillis());
	
	public static DogGender getRandomGender() {
		int size = DogGender.values().length;
		
		return DogGender.values()[rand.nextInt(size)];
	}
	
	public static DogGender getGender(String gender) {
		gender = gender.toLowerCase();
		switch(gender) {
			case "male": return MALE;
			default: return FEMALE;
		}
	}
	
	public String toString() {
		switch(this) {
			case MALE: return "Male";
			default: return "Female";
		}
	}
	
	public static void main (String[] args) {
		for(int i = 0; i < 50; i++) {
			System.out.println(getRandomGender());
		}
	}
}