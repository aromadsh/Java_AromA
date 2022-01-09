package week2;

import java.util.Scanner;

public class day7_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.printf("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("===사칙연산 출력하기===");
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
		
		sc.close();

		// 2번 문제
		int a = 3;
		int b = 5;
		
		System.out.printf("%d %d %d", ++a + b--, a, ++b);
	}

}
