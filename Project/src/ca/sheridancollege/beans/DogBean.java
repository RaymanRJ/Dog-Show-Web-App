package ca.sheridancollege.beans;

import java.util.Random;

import ca.sheridancollege.enums.*;

public class DogBean {
	private int dogNumber;
	private String ownerName;
	private String dogName;
	private String dogBreed;
	private String dogGroup;
	private String ownerEmail;
	private DogGender dogGender;
	private DogSpecialty dogSpeciality;
	private int friday, saturday, sunday;
	
	private static Random rand = new Random(System.currentTimeMillis());
	
	public DogBean() {
		dogNumber = rand.nextInt(1000);
	}
	
	public int getDogNumber() {
		return dogNumber;
	}
	
	public void setDogNumber(int dogNumber) {
		this.dogNumber = dogNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}

	public String getDogGroup() {
		return dogGroup;
	}

	public void setDogGroup(String dogGroup) {
		this.dogGroup = dogGroup;
	}

	public DogGender getDogGender() {
		return dogGender;
	}

	public void setDogGender(DogGender dogGender) {
		this.dogGender = dogGender;
	}

	public DogSpecialty getDogSpeciality() {
		return dogSpeciality;
	}

	public void setDogSpeciality(DogSpecialty dogSpeciality) {
		this.dogSpeciality = dogSpeciality;
	}
	
	public String getOwnerEmail() {
		return this.ownerEmail;
	}
	
	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}
	
	public void setFriday(boolean friday) {this.friday = friday == true ? 1 : 0;}
	public void setSaturday(boolean saturday) {this.saturday = saturday == true ? 1 : 0;}
	public void setSunday(boolean sunday) {this.sunday = sunday == true ? 1 : 0;}
	
	public boolean getFriday() {return friday == 1 ? true : false;}
	public boolean getSaturday() {return saturday == 1 ? true : false;}
	public boolean getSunday() {return sunday == 1 ? true : false;}
	
	public String toSQLString() {
		return "null" + ",'"
				+ dogName + "','"
				+ ownerName + "','"
				+ dogBreed + "','"
				+ dogGroup + "','"
				+ dogGender + "','"
				+ dogSpeciality + "','"
				+ ownerEmail + "','"
				+ friday + "','"
				+ saturday + "','"
				+ sunday + "'";
	}
	
}