package week3;

import java.util.Scanner;

public class day11_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nums[] = new int [5];
		
		System.out.printf("숫자 5개를 띄어쓰기로 구분하여 입력하세요 : ");
		
		for (int i = 0; i < 5; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("====== 입력 완료 ======");
		System.out.println("====== 출력 시작 ======");
		
		for (int i = 4; i >= 0; i--) {
			System.out.printf("%d\n", nums[i]);
		}

	}

}
