package studio7;

public class Die {
	
	private int sides;
	
	public Die(int initSides)
	{
		sides = initSides;
	}
	
	public int dieThrow() {
		return (int)(Math.random()*sides + 1);
	}

	public static void main(String[] args) {
		Die one = new Die(67);
		System.out.println(one.dieThrow());
	}
}
