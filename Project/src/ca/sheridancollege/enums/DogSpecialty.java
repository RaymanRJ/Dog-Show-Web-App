package ca.sheridancollege.enums;

import java.util.Random;

public enum DogSpecialty {
	CLASS, SPECIALITY;
	private static Random rand = new Random(System.currentTimeMillis());
	
	public static DogSpecialty getRandomSpeciality() {
		int size = DogSpecialty.values().length;
		
		return DogSpecialty.values()[rand.nextInt(size)];
	}
	
	public static DogSpecialty getSpeciality(String speciality) {
		speciality = speciality.toLowerCase();
		switch(speciality) {
			case "class": return CLASS;
			default: return SPECIALITY;
		}
	}
	
	public String toString() {
		switch(this) {
			case CLASS: return "Class";
			default: return "Speciality";
		}
	}
}