package beginner;

// 1부터 100까지 홀수는 양수이고 짝수는 음수인 수열의 합계를 구하기
public class Algorithm_B_03 {
	public static void main(String[] ar) {
		int i, j, SW;
		i = 0; 	// 1씩 누적되는 변수	
		j = 0;	// 누적 값 계산 결과를 담을 변수
		SW = 0;	// 음수일때 와 양수일때를 구분해주는 변수로 사용
		
		do{
			i++;// 처음값이 1이므로 그리고 i 는 1씩 계속 증가하기 떄문에
			
			if(SW==0){
				j = j + i;
				SW = 1; //처음 수는 양수 이고 그다음수는 음수이기 떄문에 sw값을 바꿔줌으로써 다음번에 음수 계산으로 갈수있다
			}else{
				j= j -i;
				SW = 0; //위와 같은이유로 sw값을 변경해 줍니다
			}		
		}while(i<100);
		System.out.println(j);
	}
}
