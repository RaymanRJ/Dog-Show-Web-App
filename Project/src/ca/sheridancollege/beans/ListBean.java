package ca.sheridancollege.beans;

import ca.sheridancollege.enums.DogGender;
import ca.sheridancollege.enums.DogSpecialty;

public class ListBean {
	
	private String breed;
	private DogGender gender;
	private DogSpecialty specialty;

	/*
	 * Group
	 * 		- num of dogs - breed - ml clss - fml clss - ml spcl - fml spcl
	 * 
	 * HashMap
	 * 		- Group - ArrayList<ListBean>
	 */
	

	public ListBean() {}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public DogGender getGender() {
		return gender;
	}

	public void setGender(DogGender gender) {
		this.gender = gender;
	}

	public DogSpecialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(DogSpecialty specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return "ListBean [breed=" + breed + ", gender=" + gender + ", specialty=" + specialty + "]";
	}
	
}
