package week3;

class Student {
	
	String name;
	int x;
	int y;
	int z;

	Student(String name, int x, int y, int z) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public float getAverage() {
		
		return (float)(this.x + this.y + this.z)/3;
		
	}
		
}

public class day13_test {
	
	public static void main(String[] args) {
		
		Student student_1 = new Student("�ڹ�", 100, 80, 75);
		Student student_2 = new Student("�躯��", 96, 58, 90);
		
		System.out.printf("%s�� ��� ������ : %f\n", student_1.name, student_1.getAverage());
		System.out.printf("%s�� ��� ������ : %f", student_2.name, student_2.getAverage());
	}
	
}