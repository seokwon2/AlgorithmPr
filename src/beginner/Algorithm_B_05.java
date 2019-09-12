package beginner;
//홀수 짝수 별로 부호 변경하면서 곱하기
public class Algorithm_B_05 {
	public static void main(String[] ar) {
		int i; double j;
		j = 1;

		for (i = 1; i < 100; i++) {
			if (i % 2 == 0) { // i 값이 짝수 값인지 확인
				j = j * i; //짝수일때는 그냥 곱해서 j에 누적
			} else {
				j *= i * -1; //홀수 일때는 음수값을 j에 연산후 누적
			}
		}
		System.out.println(j);
	}
}
