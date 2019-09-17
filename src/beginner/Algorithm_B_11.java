package beginner;

import java.util.*;

//소수의 합 구하기
public class Algorithm_B_11 {
	public static void main(String[] ar) {
		System.out.println("숫자를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();

		int hap = 0;
		int k = 2;
		int j;

		while (true) {
			j = 2;
			while (k % j != 0)
				j++;
			if (k == j)
				hap += k;
			if (k < A)
				k++;
			else {
				System.out.println(hap);
				break;
			}
		}
	}
}
