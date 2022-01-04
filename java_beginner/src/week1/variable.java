package hello;

public class variable {

	public static void main(String[] args) {
		// 1. 문자열 
		char a = 'A'; // char a = "A"; 여기서 큰따음표로 표시하면 오류가 난다!
		String name1 = "코뮤니티";
		String name2; 
		name2 = "모각코";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(a);
		
		// 2. 숫자형
		float num1 = 0.123123123123123123123123123123f;
		double num2 = 0.12312312312312312312312312123;
		
		System.out.println(num1);
		System.out.println(num2);
		
		// 3. 논리형 
		boolean t = true; // boolean t = True; 대문자는 오류남
		boolean f = false; 
		
		System.out.println(t);
		System.out.println(f);
	}

}
