package hello;

class Calculators {
	public int sum (int a, int b) {
		return a + b;
	}
}

public class objectoriented {
	// 5. �ǽ�
		public class HelloWord {
			public static void main(String[] args) {
				Calculators calculator = new Calculators();
				int result = calculator.sum(3, 5);
				System.out.println(result);
				
			}
		}
	
	// 1. �⺻ �޼ҵ�
	public int sum (int a, int b) {
		return a + b;
	}
	
	// 2. �Է� ���� ���� �޼ҵ�
	public char getcharater() {
		return 'c';
	}
	
	// 3. ��ȯ�� ���� �޼ҵ�
	public void printHeight (int height) {
		System.out.println(height);
	}
	
	// 4. Ŭ���� �ȿ� �޼ҵ� �ֱ�
	class Calculator {
		public int sum1 (int a, int b) {
			return a + b;
		}
	}
	Calculator calcuator = new Calculator();
	
}
