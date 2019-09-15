package beginner;

import java.util.*;

public class Algorithm_B_10 {
	public static void main(String[] ar) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int Input = scan.nextInt();

		int i = Input; // 

		for (int k = 2; k <= i; k++) { //math.sqrt() 제곱근 함수 이용해서 구할수 있음
			if (Input % k == 0) { // 나머지가 0인지 확인
				if (Input == k) { // 입력받은 값과  나머지가 0이 나오게 한 k값을 확인해서 그수가 같다면 소수
					System.out.println("소수");
					break;
				} else {
					System.out.println("소수 아님");
					break; // 나머지 연산을 할때 2로 나누었을때 나누어 떨어지는 수라면 소수가 아니라고 판단
							// break 사용
				}

			}

		}

	}
}
