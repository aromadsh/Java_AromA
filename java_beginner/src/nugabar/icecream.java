package nugabar;
/**
 * 알고리즘
1. 사람은 로봇의 왼손에 1000원을 쥐어 준다.
2. 사람은 로봇에게 아이스크림을 사와라 라고 명령한다.
...
3. 로봇은 편의점 주인에게 누가바 주세요 라고 명령한다.
3-1. 로봇이 편의점에 들어가서 누가바 주세요라고 명령한다.
3-2. 로봇은 편의점 주인에게 아이스크림을 받기위해 사람에게 받은 돈(왼손)을 넘겨준다.
4. 편의점 주인은 돈을 확인하고, 아이스크림냉동고에서 "누가바"를 한개 꺼내어 로봇에게 준다.
5. 로봇은 편의점 주인이 준 아이스크림을 오른손에 쥔다.
6. 사람에게 온 로봇은 오른손의 아이스크림을 사람에게 내민다.
 *
 */
import java.io.*;
import java.util.Scanner;

public class icecream {

	public static void main(String[] args) {
		// 1. 사람은 로봇의 왼손에 1000원을 쥐어 준다.
		int left = 1000;
		// 2. 사람은 로봇에게 아이스크림을 사와라 라고 명령한다.
		Object right = buyicecream(left);

		// 6. 사람에게 온 로봇은 오른손의 아이스크림을 사람에게 내민다.
		System.out.println(right);
			}
	private static Object buyicecream(int left) {
		// TODO Auto-generated method stub
		CU cu = new CU();
		// 3. 로봇은 편의점 주인에게 누가바 주세요 라고 명령한다.
		// 5. 로봇은 편의점 주인이 준 아이스크림을 오른손에 쥔다.
		Object right = cu.getIceream(left);
		return right;
		/*
3-1. 로봇이 편의점에 들어가서 누가바 주세요라고 명령한다.
3-2. 로봇은 편의점 주인에게 아이스크림을 받기위해 사람에게 받은 돈(왼손)을 넘겨준다.
		 */
		
	}
	}
	

 
