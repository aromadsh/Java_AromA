package week2;

import java.util.Scanner;

public class day7_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("ù��° ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.printf("�ι�° ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		System.out.println("===��Ģ���� ����ϱ�===");
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
		
		sc.close();

		// 2�� ����
		int a = 3;
		int b = 5;
		
		System.out.printf("%d %d %d", ++a + b--, a, ++b);
	}

}
