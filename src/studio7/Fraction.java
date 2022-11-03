package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}

	public Fraction add(Fraction one) {
		int addDenom = one.denominator * this.denominator;
		return new Fraction(one.numerator * this.denominator + this.numerator * one.denominator, addDenom);
	}
	
	public Fraction multiply(Fraction one) {
		return new Fraction(one.numerator * this.numerator, one.denominator * this.denominator);
	}
	
	public Fraction reciprocal() {
		return new Fraction(this.denominator, this.numerator);
	}
	
	public Fraction simplify() {
		int s = this.numerator;
		int w = this.denominator;
		for(int i = Math.abs(this.numerator); i > 1; i--)
		{
			if(this.numerator % i == 0 && this.denominator % i == 0)
			{
				s = this.numerator / i;
				w = this.denominator / i;
			}
		}
		return new Fraction(s, w);
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public static void main(String[] args) {
		Fraction two = new Fraction(100, 45);
		System.out.println(two.simplify());
	}
}
