package week2;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 부호 연산자
		int x = 10;
		System.out.println(+x);
		System.out.println(-x);
				
		int y = -10;
		System.out.println(+y);
		System.out.println(-y);
		
		// 2. 증감 연산자
		int num = 10;
		
		num++;
		System.out.println(num);
		
		++num;
		System.out.println(num);
				
		num--;
		System.out.println(num);
				
		--num;
		System.out.println(num);
				
		int num1 = 10;
		System.out.println(++num1); // num1(10)에 1을 더하고나서 num1(11)를 출력한다.
		System.out.println(num1); // num1(11)를 출력한다.
		System.out.println(num1++); // num1(11)를 출력하고, num1(11)에 1을 더한다.
		System.out.println(num1); // num1(12)를 출력한다.
				
		// 3. 산술 연산자
				
		int x1 = 10;
		int y1 = 5;
		System.out.printf("%d + %d = %d\n", x1, y1, x1 + y1);
		System.out.printf("%d - %d = %d\n", x1, y1, x1 - y1);
		System.out.printf("%d * %d = %d\n", x1, y1, x1 * y1);
		System.out.printf("%d / %d = %d\n", x1, y1, x1 / y1);
		System.out.printf("%d %% %d = %d\n", x1, y1, x1 % y1);		
	}

}
