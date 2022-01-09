package week2;

import java.util.Scanner;

public class day6_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======== 자기소개 입력하기 ========");
		System.out.printf("이름을 입력하세요: ");
		String name = sc.next();
		System.out.printf("나이를 입력하세요: ");
		int age = sc.nextInt();
		System.out.printf("혈액형을 입력하세요: ");
		String blood = sc.next();
		System.out.printf("MBTI를 입력하세요: ");
		String mbti = sc.next();
		System.out.printf("좌우명 한 문장을 입력하세요: ");
		sc.nextLine();
		String sentence = sc.nextLine();
		System.out.println("======== 자기소개 입력 완료 ========\n\n");
		
		System.out.println("아이엠 그라운드 자기소개 시작! => 시작하려면 엔터를 누르세요");
		sc.nextLine();
		sc.close();
		System.out.printf("저는 " + name + "입니다." + " 나이는 " + age + "살 이에요.\n");
		System.out.printf("혈액형은 " + blood + " 이구요, " + mbti + "입니다.\n\n");
		System.out.printf("★★★" + sentence + "!!!!!!!!★★★");
	}

}
