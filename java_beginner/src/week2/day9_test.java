package week2;

import java.util.Scanner;

public class day9_test {

	public static void main(String[] args) {
		System.out.println("==== ������ MBTI ��� ���� ====");
		System.out.print("����� MBTI�� �Է��ϼ���. : ");
		Scanner sc = new Scanner(System.in);
		String mbti = sc.next();
		
		if (mbti.equals("INTP") || mbti.equals("intp")) {
			System.out.println("����� �鿣���� �Դϴ�.");
		} else if (mbti.equals("ENFJ") || mbti.equals("enfj")) {
			System.out.println("����� ����Ʈ������ �Դϴ�.");
		} else if (mbti.equals("INFJ") || mbti.equals("infj")) {
			System.out.println("����� Ǯ������ �Դϴ�.");
		} else if (mbti.equals("ISTJ") || mbti.equals("istj")) {
			System.out.println("����� �ۺ����� �Դϴ�.");
		} else if (mbti.equals("ENTJ") || mbti.equals("entj")) {
			System.out.println("����� ��Ű������ �Դϴ�.");
		} else if (mbti.equals("ISFJ") || mbti.equals("isfj")) {
			System.out.println("����� ������������ �Դϴ�.");
		} else if (mbti.equals("INTJ") || mbti.equals("intj")) {
			System.out.println("����� �����ͺм����� �Դϴ�.");
		} else if (mbti.equals("ENFP") || mbti.equals("enfp")) {
			System.out.println("����� AI�� �Դϴ�.");
		} else if (mbti.equals("ENTP") || mbti.equals("entp")) {
			System.out.println("����� iOS�� �Դϴ�.");
		} else if (mbti.equals("ESFJ") || mbti.equals("esfj")) {
			System.out.println("����� �ȵ���̵��� �Դϴ�.");
		} else if (mbti.equals("ESFP") || mbti.equals("esfp")) {
			System.out.println("����� ���� �������� �Դϴ�.");
		} else if (mbti.equals("ESTP") || mbti.equals("estp")) {
			System.out.println("����� IoT������ �Դϴ�.");
		} else if (mbti.equals("ESTJ") || mbti.equals("estj")) {
			System.out.println("����� QA�� �Դϴ�.");
		} else if (mbti.equals("INFP") || mbti.equals("infp")) {
			System.out.println("����� ���ü���� �Դϴ�.");
		} else if (mbti.equals("ISTP") || mbti.equals("istp")) {
			System.out.println("����� �Ӻ���� �������� �Դϴ�.");
		} else if (mbti.equals("ISFP") || mbti.equals("isfp")) {
			System.out.println("����� ��Ʈ��ũ �������� �Դϴ�.");
		} else {
			System.out.println("��Ȯ�� MBTI ������ �ƴϳ׿�. �Ф�");
		}
		
		sc.close();
	}

}
