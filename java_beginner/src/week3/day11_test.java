package week3;

import java.util.Scanner;

public class day11_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nums[] = new int [5];
		
		System.out.printf("���� 5���� ����� �����Ͽ� �Է��ϼ��� : ");
		
		for (int i = 0; i < 5; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("====== �Է� �Ϸ� ======");
		System.out.println("====== ��� ���� ======");
		
		for (int i = 4; i >= 0; i--) {
			System.out.printf("%d\n", nums[i]);
		}

	}

}
