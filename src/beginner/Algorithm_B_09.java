package beginner;
//(77*1)+(76*2) ```` (2*76)+(1*77) 의 결과를 출력하기
public class Algorithm_B_09 {
	public static void main(String [] ar){
		int q ,m;
		int p =0 ; //1씩 증가되는 변수가 저장
		int h= 0;
		
		do{
			p=p+1; //
			q = 78 - p; // 1씩 감소되는 변수
			m = q * p ;
			h = h + m;
		}while(p<77);
		System.out.println(h);
	}
}
