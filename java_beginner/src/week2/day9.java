package week2;

import java.util.Scanner;

public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� ���� �ּ���.");
		int n = sc.nextInt();
		
		// 1. ��� else if
		
		if (n < 5) {
			System.out.println("n�� 5���� �۴�.");
		} else if (n < 10) {
			System.out.println("n�� 10���� �۴�.");
		} else if (n < 15) {
			System.out.println("n�� 15���� �۴�.");
		} else {
			System.out.println("n�� 15���� ũ��.");
		}
		
		System.out.println("==============================");
		// 2. ��� if �ݺ�
		
		if (n < 5) {
			System.out.println("n�� 5���� �۴�.");
		} 
		if (n < 10) {
			System.out.println("n�� 10���� �۴�.");
		}
		if (n < 15) {
			System.out.println("n�� 15���� �۴�.");
		}
		
		System.out.println("==============================");
		// 3. ��� if ��ø
		
		if (n < 5) {
			if (n < 0) {
				System.out.println("n�� 0���� �۴�.");
			} else {
				System.out.println("a�� 0���� ũ�� 5���� �۴�.");
			}
		}
		
		System.out.println("==============================");
		// 4. ��� if �ݺ�
		
		Scanner sw = new Scanner(System.in);
		int s = sw.nextInt();
		/*
		if (s == 1) {
			System.out.println("a�� 1�Դϴ�.");
		} else if (s == 2) {
			System.out.println("a�� 2�Դϴ�.");
		} else if (s == 3) {
			System.out.println("a�� 3�Դϴ�.");
		} else if (s == 4) {
			System.out.println("a�� 4�Դϴ�.");
		} else {
			System.out.println("a�� 1~4�� �ƴմϴ�.");
		} */
		
		switch (s) {
		
		case 1 :
			System.out.println("a�� 1�Դϴ�.");
			break;
		case 2 : 
			System.out.println("a�� 2�Դϴ�.");
			break;
		case 3 :
			System.out.println("a�� 3�Դϴ�.");
			break;
		case 4 :
			System.out.println("a�� 4�Դϴ�.");
			break;
		default :
			System.out.println("a�� 1~4�� �ƴմϴ�.");
		}
	}

}
