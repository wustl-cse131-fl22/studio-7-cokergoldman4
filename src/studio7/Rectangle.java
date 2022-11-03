package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return (length * 2) + (width * 2);
	}
	
	public boolean size(Rectangle other) {
		if(other.getArea() < this.getArea())
		{
			return true;
		}
		return false;
	}

	public boolean isSquare() {
		if(length == width)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Rectangle one = new Rectangle(4, 6);
		System.out.println(one.getArea());
		System.out.println(one.getPerimeter());
		System.out.println(one.size(new Rectangle(7, 8)));
		System.out.println(one.isSquare());
	}
}
