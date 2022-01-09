package week3;

class Calculator {
	int x;
	int y;
	public void printResult () {
		System.out.printf("x + y = %d\n", x + y);
		System.out.printf("x - y = %d\n", x - y);
		System.out.printf("x / y = %d\n",x / y);
		System.out.printf("x * y = %d\n", x * y);
	}
}

public class day12_test {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		calculator.x = 30;
		calculator.y = 50;
		
		calculator.printResult();
	}

}
