package beginner;

import java.util.Scanner;

//일정한 값으로 증가 하는 수열에 대해서 n번째 항의 값을 구하기
public class Algorithm_B_06 {
	public static void main(String[] ar) {
		System.out.println("원하는 항을 입력 해주세요");
		Scanner n = new Scanner(System.in); //n을 입력받습니다
		int N = n.nextInt()-1; //n번째 항까지의 합을 구하기 위해서는 n-1번째 의 더할 값을 구하면 n번째 항의 값이 나옴
		//그래서 -1을 해줍니다
 
		int x, y, z;
		// x : 1씩 증가하는변수
		// y : x를통해서 증가하는 값
		// z : y의 누적 값을 저장 하는 변수

		x = 0;
		y = 1;
		z = 1;

		do {
			x++; 
			y += x;
			z += y;
		} while (x < N);
		System.out.println(z);
	}
}
