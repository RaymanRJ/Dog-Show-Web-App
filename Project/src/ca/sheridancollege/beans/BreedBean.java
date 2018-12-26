package ca.sheridancollege.beans;

public class BreedBean {
	private int mlClss, fmlClss, mlSpcl, fmlSpcl, total;
	private String breed;
	
	public BreedBean() {}

	public int getMlClss() {
		return mlClss;
	}

	public void setMlClss(int mlClss) {
		this.mlClss = mlClss;
	}

	public int getFmlClss() {
		return fmlClss;
	}

	public void setFmlClss(int fmlClss) {
		this.fmlClss = fmlClss;
	}

	public int getMlSpcl() {
		return mlSpcl;
	}

	public void setMlSpcl(int mlSpcl) {
		this.mlSpcl = mlSpcl;
	}

	public int getFmlSpcl() {
		return fmlSpcl;
	}

	public void setFmlSpcl(int fmlSpcl) {
		this.fmlSpcl = fmlSpcl;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getTotal() {
		return mlClss + fmlClss + mlSpcl + fmlSpcl;
	}
	
	public void incrementMlClss() {
		this.mlClss++;
	}
	
	public void incrementFmlClss() {
		this.fmlClss++;
	}
	
	public void incrementMlSpcl() {
		this.mlSpcl++;
	}
	
	public void incrementFmlSpcl() {
		this.fmlSpcl++;
	}
	
}
