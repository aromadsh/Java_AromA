package hello;

public class arrangement {

	public static void main(String[] args) {
		
		int[] value = {10, 8, 8, 9, 9};
		
		System.out.println(value[0]);
		System.out.println(value[1]);
		System.out.println(value[2]);
		System.out.println(value[3]);
		System.out.println(value[4]);
		
		int length = 100;
		int [] values = new int[length];
		
		for (int i = 0; i < length; i++) {
			values[i] = i*10;
		}
		for (int i = 0; i < length; i++) {
			System.out.printf("%d 번째 인덱스에 저장된 값은 %d 입니다.\n", i, values[i]);
		}
		
		
	}
	
}
