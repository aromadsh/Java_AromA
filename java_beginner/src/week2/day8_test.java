package week2;

import java.util.Scanner;

public class day8_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 하 
		System.out.print("숫자 2개를 입력하세요:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(num1 > num2 ? "둘 중에 큰 수는: " + num1 : "둘 중에 큰 수는: " + num2);
		
		// 2. 상
		System.out.print("숫자 2개를 입력하세요:");
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		System.out.println(num3 == num4 ? "같음" : num3 > num4 ? "둘 중에 큰 수는 : " + num3 : "둘 중에 큰 수는 : " + num4);
		
		
		sc.close();
	}

}
