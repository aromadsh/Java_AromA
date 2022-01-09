package week2;

import java.util.Scanner;

public class day10_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int for_sum = 0;
				
		// 1. for문
		for(int i = 1; i <= num; i++) {
			for_sum += i;
		}
		System.out.println("1부터 " + num + "까지 합은" + for_sum + "입니다.");
		
		
		// 2. while문
		int j = 1;
		int while_sum = 0;
		
		while (j <= num) {
			while_sum += j;
			j++;
		}
		System.out.println("1부터 " + num + "까지 합은" + while_sum + "입니다.");
		
		sc.close();

	}

}
