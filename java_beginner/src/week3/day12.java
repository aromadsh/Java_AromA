package week3;

class Calculators {
	int a;
	int b;
	public int sum (int a, int b) {
		return a + b;
	}
}

class Cal {
	int x;
	int y;
	public int s () {
		return x + y;
	}
}

public class day12 {

	public static void main(String[] args) {
		// 1. class method instance
		Calculators calculator = new Calculators();
		int result = calculator.sum(3, 5);
		System.out.println(result);
		
		// 2. field
		Cal cals = new Cal();
		cals.x = 30;
		cals.y = 50;
				
		System.out.println(cals.s());
		}
	
}
