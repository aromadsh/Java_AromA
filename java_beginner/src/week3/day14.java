package week3;

public class day14 {

	public static void main(String[] args) {
		int[] value = new int[3];
		
		// 1. try catch
		try {
			value[3] = 10;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �߻�");
		}
		
		// 2. finally
		
		int num;
		try  {
			num = 4 / 0;
		} catch (ArithmeticException e) {
			System.out.println("���� �߻�");
			num = -1;
		} finally {
			System.out.println("������ ����");
		}
		System.out.println(num);
	}

}
