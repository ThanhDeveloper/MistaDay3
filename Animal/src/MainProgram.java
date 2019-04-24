
public class MainProgram {

	public static void main(String[] args) {
		Dog dog1=new Dog("kiki", 3, "Dog");
		Tiger t1=new Tiger("Salam", 3, "Tiger");
		System.out.println(dog1.getNameAnimal()+" "+ dog1.getAgeAnimal()+ " tuoi va la "+dog1.getTypeAnimal());
		System.out.println(t1.getNameAnimal()+" "+ t1.getAgeAnimal()+ " tuoi va la "+t1.getTypeAnimal());
	}
	

}
