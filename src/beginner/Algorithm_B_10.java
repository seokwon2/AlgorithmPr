package beginner;

import java.util.*;

public class Algorithm_B_10 {
	public static void main(String[] ar) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int Input = scan.nextInt();

		int i = Input - 1; // 자기 자신 -1 까지 나누면서 나머지확인
		int j = 2; // 나눌값중에 최소값인 2를 저장

		for (int k = j; k <= i; k++) {
			if (Input % k == 0) {
				System.out.println("소수 아님");
				break; //나머지 연산을 할때 2로 나누었을때 나누어 떨어지는 수라면 소수가 아니라고 판단
						//break 사용
			}else{
				System.out.println("소수");
			}

		}

	}
}
