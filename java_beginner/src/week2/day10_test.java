package week2;

import java.util.Scanner;

public class day10_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int for_sum = 0;
				
		// 1. for��
		for(int i = 1; i <= num; i++) {
			for_sum += i;
		}
		System.out.println("1���� " + num + "���� ����" + for_sum + "�Դϴ�.");
		
		
		// 2. while��
		int j = 1;
		int while_sum = 0;
		
		while (j <= num) {
			while_sum += j;
			j++;
		}
		System.out.println("1���� " + num + "���� ����" + while_sum + "�Դϴ�.");
		
		sc.close();

	}

}
