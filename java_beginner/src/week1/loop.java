package hello;
import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		
		// 1. while
		int a = 0;
		
		System.out.println("�ݺ��� ����!");
		while (a < 5) {
			System.out.println(a);
			a++;
		}
		
		System.out.println("�ݺ��� ��!");
		System.out.println(a);
		
		System.out.println("==================");
		
		// 2. for
		for (int b = 0; b < 5; b++) {
			System.out.println(b);
		}
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j );
			}
		}
		
		System.out.println("==================");
		
		// 3. do-while
		
		int c = 0;
		
		do {
			System.out.println(c);
			c++;
		} while (c > 5);
		
		System.out.println("==================");
		
		int num = 0;
		int answer = 5;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("2 + 3�� ����?");
			num = sc.nextInt();
			
			if (num == answer) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("��! �ٽ� �Է����ּ���.");
			}
		} while (num != answer);
		
	}

}
