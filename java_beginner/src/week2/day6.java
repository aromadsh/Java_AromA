package week2;

import java.util.Scanner;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է����ּ���.");
		String name = sc.next();
		System.out.println("����� �̸��� " + name + "�̱���.");
		

		Scanner sc2 = new Scanner(System.in);
		
		System.out.printf("�ܾ �Է��ϼ���.");
		String word = sc2.next();
		
		System.out.printf("������ �Է��ϼ���");
		int num = sc2.nextInt();
		
		System.out.printf("�Ǽ��� �Է��ϼ���");
		float f = sc2.nextFloat();
		
		System.out.printf("������ �Է��ϼ���");
		sc2.nextLine();
		String sentence = sc2.nextLine();
		
		System.out.println("�Է��� ������� ��� ��ƺ����?");
		System.out.printf("�ܾ�� %s / ������ %d / �Ǽ��� %f / ������ %s", word, num, f, sentence);
		
		sc.close();
	}

}
