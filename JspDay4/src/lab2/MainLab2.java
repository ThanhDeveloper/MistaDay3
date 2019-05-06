package lab2;

public class MainLab2 {
	public static void main(String arg[]) {
		Retangle retangle=new Retangle("Red",3,4);
		Triangle triangle=new Triangle(5,7,"Yellow");
		System.out.println(retangle.toString());
		System.out.println(triangle.toString());
		System.out.println(retangle.getColor());
		System.out.println(triangle.getColor());
	}
}
