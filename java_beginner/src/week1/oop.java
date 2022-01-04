package hello;

class Calculators {
	public int sum (int a, int b) {
		return a + b;
	}
}


public class oop {

	public static void main(String[] args) {
		// 5. ½Ç½À
		Calculators calculator = new Calculators();
		int result = calculator.sum(3, 5);
		System.out.println(result);
						

	}

}
