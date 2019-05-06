package lab2;

public class Triangle extends Shape {
	private int base;
	private int height;
	@Override
	public double getArea() {
		
		return 0.5*this.base*this.height;
	}
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height +" GetArea(Triangle): "+ getArea()+ "]";
	}
	public Triangle(int base, int height,String color) {
		super(color);
		//this.color=color;
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
