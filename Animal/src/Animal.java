
public class Animal {
	private String nameAnimal;
	private int ageAnimal;
	private String typeAnimal;
	public String getNameAnimal() {
		return nameAnimal;
	}
	public void setNameAnimal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}
	public int getAgeAnimal() {
		return ageAnimal;
	}
	public void setAgeAnimal(int ageAnimal) {
		this.ageAnimal = ageAnimal;
	}
	public Animal(String nameAnimal, int ageAnimal) {
		this.nameAnimal = nameAnimal;
		this.ageAnimal = ageAnimal;
	}
	public String getTypeAnimal() {
		return typeAnimal;
	}
	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	public Animal(String nameAnimal, int ageAnimal, String typeAnimal) {
		super();
		this.nameAnimal = nameAnimal;
		this.ageAnimal = ageAnimal;
		this.typeAnimal = typeAnimal;
	}
	

}
