package hello;

public class operator2 {

	public static void main(String[] args) {
		// 1. ��(����) ������
		
		int a = 5;
		int b = 7;
		
		System.out.printf("%d < %d �� %b\n", a, b, a<b);
		System.out.printf("%d <= %d �� %b\n", a, b, a<=b);
		System.out.printf("%d > %d �� %b\n", a, b, a>b);
		System.out.printf("%d >= %d �� %b\n", a, b, a>=b);
		System.out.printf("%d == %d �� %b\n", a, b, a==b);
		System.out.printf("%d != %d �� %b\n", a, b, a!=b);
		
		// 2. �� ������
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		
		System.out.printf("%d > %d && %d < %d �� %b\n", num1, num2, num2, num3, num1 > num2 && num2 < num3);
		System.out.printf("%d > %d || %d < %d �� %b\n", num1, num2, num2, num3, num1 > num2 || num2 < num3);
		
		System.out.printf("!(%d == %d) �� %b\n", num1, num2, !(num1 == num2));
		System.out.printf("!(%d != %d) �� %b\n", num1, num2, !(num1 != num2));
		
		// 3. ���� ������
		
		int b1 = 5;
		int b2 = 7;
		int b3 = 10;
		
		b1 += 1;
		b2 *= 10;
		b3 /= 3;
		
		System.out.printf("%d %d %d\n", b1, b2, b3);
		
		// 4. ���� ������
		
		int t = 10;
		int q = 30;
		
		System.out.println(t > q ? "���Դϴ�." : "�����Դϴ�.");
		System.out.println(t < q ? "���Դϴ�." : "�����Դϴ�.");
		
		
		
	}

}
