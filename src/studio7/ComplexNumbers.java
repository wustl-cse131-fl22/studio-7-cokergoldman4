package studio7;

public class ComplexNumbers {
	
	private double real;
	private double imaginary;
	
	public ComplexNumbers(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public ComplexNumbers add(ComplexNumbers one) {
		double real1 = this.real + one.real;
		double imaginary1 = this.imaginary + one.imaginary;
		return new ComplexNumbers(real1, imaginary1);
	}
	
	public ComplexNumbers multiply(ComplexNumbers one) {
		double real1 = this.real * one.real - this.imaginary * one.imaginary;
		double imaginary1 = this.real * one.imaginary + this.imaginary * one.real;
		return new ComplexNumbers(real1, imaginary1);
	}
	

	public String toString() {
		return real + " + " + imaginary + "i" ;
	}

	public static void main(String[] args) {
		ComplexNumbers deji = new ComplexNumbers(5, 8);
		System.out.println(deji.multiply(new ComplexNumbers(3, 9)));
	}
	
	
	

}
