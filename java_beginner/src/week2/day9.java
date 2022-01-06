package week2;

import java.util.Scanner;

public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 적어 주세요.");
		int n = sc.nextInt();
		
		// 1. 제어문 else if
		
		if (n < 5) {
			System.out.println("n은 5보다 작다.");
		} else if (n < 10) {
			System.out.println("n은 10보다 작다.");
		} else if (n < 15) {
			System.out.println("n은 15보다 작다.");
		} else {
			System.out.println("n은 15보다 크다.");
		}
		
		System.out.println("==============================");
		// 2. 제어문 if 반복
		
		if (n < 5) {
			System.out.println("n은 5보다 작다.");
		} 
		if (n < 10) {
			System.out.println("n은 10보다 작다.");
		}
		if (n < 15) {
			System.out.println("n은 15보다 작다.");
		}
		
		System.out.println("==============================");
		// 3. 제어문 if 중첩
		
		if (n < 5) {
			if (n < 0) {
				System.out.println("n은 0보다 작다.");
			} else {
				System.out.println("a는 0보다 크고 5보다 작다.");
			}
		}
		
		System.out.println("==============================");
		// 4. 제어문 if 반복
		
		Scanner sw = new Scanner(System.in);
		int s = sw.nextInt();
		/*
		if (s == 1) {
			System.out.println("a는 1입니다.");
		} else if (s == 2) {
			System.out.println("a는 2입니다.");
		} else if (s == 3) {
			System.out.println("a는 3입니다.");
		} else if (s == 4) {
			System.out.println("a는 4입니다.");
		} else {
			System.out.println("a는 1~4가 아닙니다.");
		} */
		
		switch (s) {
		
		case 1 :
			System.out.println("a는 1입니다.");
			break;
		case 2 : 
			System.out.println("a는 2입니다.");
			break;
		case 3 :
			System.out.println("a는 3입니다.");
			break;
		case 4 :
			System.out.println("a는 4입니다.");
			break;
		default :
			System.out.println("a는 1~4가 아닙니다.");
		}
	}

}
