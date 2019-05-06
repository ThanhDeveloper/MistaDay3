package lab2;

public class Retangle extends Shape {
	private int length;
	private int width;
	@Override
	public String toString() {
		return "Retangle [length=" + length + ", width=" + width+" GetArea(Retangle): " +getArea()+ "]";
	}
		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return this.length*this.width;
		}
	
		public Retangle(String color,int length, int width) {
			//this.color=color;
			super(color);
			this.length = length;
			this.width = width;
		}
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
}
