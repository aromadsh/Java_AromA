package week2;

import java.util.Scanner;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		String name = sc.next();
		System.out.println("당신의 이름은 " + name + "이군요.");
		

		Scanner sc2 = new Scanner(System.in);
		
		System.out.printf("단어를 입력하세요.");
		String word = sc2.next();
		
		System.out.printf("정수를 입력하세요");
		int num = sc2.nextInt();
		
		System.out.printf("실수를 입력하세요");
		float f = sc2.nextFloat();
		
		System.out.printf("문장을 입력하세요");
		sc2.nextLine();
		String sentence = sc2.nextLine();
		
		System.out.println("입력한 문장들을 모두 모아볼까요?");
		System.out.printf("단어는 %s / 정수는 %d / 실수는 %f / 문장은 %s", word, num, f, sentence);
		
		sc.close();
	}

}
