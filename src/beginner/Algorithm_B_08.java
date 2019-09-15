package beginner;

//피보나치 수열
//세번째 항 구하고 합에 값 누적 시키고 카운트 증가시키고 
//지정한 횟수에 만족되지 않았을경우 위 구간을 반복하면서 값을 찾아나가는 수열
public class Algorithm_B_08 {
	public static void main(String[] ar) {
		int A = 1;
		int B = 1;
		int HAP, CNT, C; // HAP은 수열 값의 누적 공간
		// CNT는 반복횟수를 확인하는 변수
		// C는 N-2번째와 N-1번째를 더한값을 저장해줄 공간
		HAP = 2;
		CNT = 2;
		// HAP을 2로 시작 하는 이유는 초기값이 1,1로 정해져 있음
		// CNT도 마찬가지로 이미 1,1이 채워져 있음

		do {
			C = A + B; //n >= 3 일때 n-2 번째항과 n-1번째 항의 합을 저장
			HAP = HAP + C;
			CNT++;
			A = B; // 자리 바꿔줌을 통해서 1,1을 갖고 있던 a와 b가
			B = C; // 1과2를 갖게 됩니다
		} while (CNT < 20); // 찾는 항이 있는곳까지 반복
		System.out.println(HAP);

	}
}
