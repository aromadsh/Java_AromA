package week3;

class Calcul {
	Calcul() {
		System.out.println("������ ����");
	}
}

class Calculat {
	int x;
	int y;
	Calculat(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class day13 {

	public static void main(String[] args) {
		Calcul calculator = new Calcul();
		System.out.println("calculator ���� �Ϸ�");
		
		Calculat c = new Calculat(3, 5);
		System.out.println(c.x);
		System.out.println(c.y);
	}

}
