package ca.sheridancollege.enums;

import java.util.Random;

public enum DogGroup {
	SPORTING, HOUNDS, WORKING, TERRIERS, TOYS, NON_SPORTING, HERDING;
	private static Random rand = new Random(System.currentTimeMillis());
	
	public static DogGroup getRandomGroup() {
		int size = DogGroup.values().length;
		
		return DogGroup.values()[rand.nextInt(size)];
	}
	
	public static DogGroup getGroup(String group) {
		group = group.toLowerCase();
		switch(group) {
			case "sporting": return SPORTING;
			case "hounds": return HOUNDS;
			case "working": return WORKING;
			case "terriers": return TERRIERS;
			case "toys": return TOYS;
			case "non_sporting": return NON_SPORTING;
			case "non-sporting": return NON_SPORTING;
			default: return HERDING;
		}
	}
	
	public String toString() {
		switch(this) {
			case SPORTING: return "Sporting";
			case HOUNDS: return "Hounds";
			case WORKING: return "Working";
			case TERRIERS: return "Terriers";
			case TOYS: return "Toys";
			case NON_SPORTING: return "Non-Sporting";
			default: return "Herding";
		}
	}
	
	public static void main (String[] args) {
		for(int i = 0; i < 50; i++) {
			System.out.println(getRandomGroup());
		}
	}
}