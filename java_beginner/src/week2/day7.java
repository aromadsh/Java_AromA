package week2;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ��ȣ ������
		int x = 10;
		System.out.println(+x);
		System.out.println(-x);
				
		int y = -10;
		System.out.println(+y);
		System.out.println(-y);
		
		// 2. ���� ������
		int num = 10;
		
		num++;
		System.out.println(num);
		
		++num;
		System.out.println(num);
				
		num--;
		System.out.println(num);
				
		--num;
		System.out.println(num);
				
		int num1 = 10;
		System.out.println(++num1); // num1(10)�� 1�� ���ϰ��� num1(11)�� ����Ѵ�.
		System.out.println(num1); // num1(11)�� ����Ѵ�.
		System.out.println(num1++); // num1(11)�� ����ϰ�, num1(11)�� 1�� ���Ѵ�.
		System.out.println(num1); // num1(12)�� ����Ѵ�.
				
		// 3. ��� ������
				
		int x1 = 10;
		int y1 = 5;
		System.out.printf("%d + %d = %d\n", x1, y1, x1 + y1);
		System.out.printf("%d - %d = %d\n", x1, y1, x1 - y1);
		System.out.printf("%d * %d = %d\n", x1, y1, x1 * y1);
		System.out.printf("%d / %d = %d\n", x1, y1, x1 / y1);
		System.out.printf("%d %% %d = %d\n", x1, y1, x1 % y1);		
	}

}
