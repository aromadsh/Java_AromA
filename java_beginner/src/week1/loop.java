package hello;
import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		
		// 1. while
		int a = 0;
		
		System.out.println("반복문 시작!");
		while (a < 5) {
			System.out.println(a);
			a++;
		}
		
		System.out.println("반복문 끝!");
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
			System.out.println("2 + 3의 답은?");
			num = sc.nextInt();
			
			if (num == answer) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("땡! 다시 입력해주세요.");
			}
		} while (num != answer);
		
	}

}
