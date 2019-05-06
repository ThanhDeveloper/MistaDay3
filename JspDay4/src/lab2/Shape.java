package lab2;

public abstract class Shape {
	public String color;
	
	public Shape(String color) {
		this.color=color;
	}
	public abstract double getArea() ;
	
	public abstract String toString() ;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
