package week2;

import java.util.Scanner;

public class day8_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. �� 
		System.out.print("���� 2���� �Է��ϼ���:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1 > num2 ? "�� �߿� ū ����: " + num1 : "�� �߿� ū ����: " + num2);
		
		// 2. ��
		System.out.print("���� 2���� �Է��ϼ���:");
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		System.out.println(num3 == num4 ? "����" : num3 > num4 ? "�� �߿� ū ���� : " + num3 : "�� �߿� ū ���� : " + num4);
		
		
		sc.close();
	}

}
