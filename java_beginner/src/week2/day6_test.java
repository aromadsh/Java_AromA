package week2;

import java.util.Scanner;

public class day6_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======== �ڱ�Ұ� �Է��ϱ� ========");
		System.out.printf("�̸��� �Է��ϼ���: ");
		String name = sc.next();
		System.out.printf("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		System.out.printf("�������� �Է��ϼ���: ");
		String blood = sc.next();
		System.out.printf("MBTI�� �Է��ϼ���: ");
		String mbti = sc.next();
		System.out.printf("�¿�� �� ������ �Է��ϼ���: ");
		sc.nextLine();
		String sentence = sc.nextLine();
		System.out.println("======== �ڱ�Ұ� �Է� �Ϸ� ========\n\n");
		
		System.out.println("���̿� �׶��� �ڱ�Ұ� ����! => �����Ϸ��� ���͸� ��������");
		sc.nextLine();
		sc.close();
		System.out.printf("���� " + name + "�Դϴ�." + " ���̴� " + age + "�� �̿���.\n");
		System.out.printf("�������� " + blood + " �̱���, " + mbti + "�Դϴ�.\n\n");
		System.out.printf("�ڡڡ�" + sentence + "!!!!!!!!�ڡڡ�");
	}

}
