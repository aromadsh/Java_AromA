package hello;

class Calculators {
	public int sum (int a, int b) {
		return a + b;
	}
}

public class objectoriented {
	// 5. 실습
		public class HelloWord {
			public static void main(String[] args) {
				Calculators calculator = new Calculators();
				int result = calculator.sum(3, 5);
				System.out.println(result);
				
			}
		}
	
	// 1. 기본 메소드
	public int sum (int a, int b) {
		return a + b;
	}
	
	// 2. 입력 값이 없는 메소드
	public char getcharater() {
		return 'c';
	}
	
	// 3. 반환이 없는 메소드
	public void printHeight (int height) {
		System.out.println(height);
	}
	
	// 4. 클래스 안에 메소드 넣기
	class Calculator {
		public int sum1 (int a, int b) {
			return a + b;
		}
	}
	Calculator calcuator = new Calculator();
	
}
