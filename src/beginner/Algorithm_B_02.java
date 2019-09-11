package beginner;

//1~100 사이에있는 홀수의 합계 구하기
public class Algorithm_B_02 {
	public static void main(String[] ar) {

		int i = -1;	//홀수 값을 나타내줄 변수
		int j = 0;	//누적 값을 저장하는 변수
		
		do{
			i += 2; //홀수값을 나열해줄 변수
			j += i;
		}while(i<99); //i가 99이하의 홀수값이 나오기 전까지 do 안의 내용을 수행
		System.out.println(j); //누적값 출력

	}
}
