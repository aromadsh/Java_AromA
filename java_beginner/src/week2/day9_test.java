package week2;

import java.util.Scanner;

public class day9_test {

	public static void main(String[] args) {
		System.out.println("==== 개발자 MBTI 결과 보기 ====");
		System.out.print("당신의 MBTI를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		String mbti = sc.next();
		
		if (mbti.equals("INTP") || mbti.equals("intp")) {
			System.out.println("당신은 백엔드형 입니다.");
		} else if (mbti.equals("ENFJ") || mbti.equals("enfj")) {
			System.out.println("당신은 프론트엔드형 입니다.");
		} else if (mbti.equals("INFJ") || mbti.equals("infj")) {
			System.out.println("당신은 풀스택형 입니다.");
		} else if (mbti.equals("ISTJ") || mbti.equals("istj")) {
			System.out.println("당신은 퍼블리셔형 입니다.");
		} else if (mbti.equals("ENTJ") || mbti.equals("entj")) {
			System.out.println("당신은 아키텍쳐형 입니다.");
		} else if (mbti.equals("ISFJ") || mbti.equals("isfj")) {
			System.out.println("당신은 보안전문가형 입니다.");
		} else if (mbti.equals("INTJ") || mbti.equals("intj")) {
			System.out.println("당신은 데이터분석가형 입니다.");
		} else if (mbti.equals("ENFP") || mbti.equals("enfp")) {
			System.out.println("당신은 AI형 입니다.");
		} else if (mbti.equals("ENTP") || mbti.equals("entp")) {
			System.out.println("당신은 iOS형 입니다.");
		} else if (mbti.equals("ESFJ") || mbti.equals("esfj")) {
			System.out.println("당신은 안드로이드형 입니다.");
		} else if (mbti.equals("ESFP") || mbti.equals("esfp")) {
			System.out.println("당신은 게임 개발자형 입니다.");
		} else if (mbti.equals("ESTP") || mbti.equals("estp")) {
			System.out.println("당신은 IoT개발형 입니다.");
		} else if (mbti.equals("ESTJ") || mbti.equals("estj")) {
			System.out.println("당신은 QA형 입니다.");
		} else if (mbti.equals("INFP") || mbti.equals("infp")) {
			System.out.println("당신은 블록체인형 입니다.");
		} else if (mbti.equals("ISTP") || mbti.equals("istp")) {
			System.out.println("당신은 임베디드 개발자형 입니다.");
		} else if (mbti.equals("ISFP") || mbti.equals("isfp")) {
			System.out.println("당신은 네트워크 개발자형 입니다.");
		} else {
			System.out.println("정확한 MBTI 유형이 아니네요. ㅠㅠ");
		}
		
		sc.close();
	}

}
