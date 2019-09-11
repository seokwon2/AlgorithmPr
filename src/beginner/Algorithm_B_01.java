package beginner;

//기본1. 1~100까지 합계 구하기
public class Algorithm_B_01 {
	public static void main(String[] ar) {

		int i=0; // 1씩 증가하는 숫자
		int j=0; // 누적 값을 담을 변수

		do {
			++i;
			j+=i;
		} while (i < 100);
		System.out.println(j); //누적값을 담고 있는 j를 출력
	}
}
