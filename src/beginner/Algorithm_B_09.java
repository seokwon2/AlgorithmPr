package beginner;
//(77*1)+(76*2) ```` (2*76)+(1*77) �� ����� ����ϱ�
public class Algorithm_B_09 {
	public static void main(String [] ar){
		int q ,m;
		int p =0 ; //1�� �����Ǵ� ������ ����
		int h= 0;
		
		do{
			p=p+1; //
			q = 78 - p; // 1�� ���ҵǴ� ����
			m = q * p ;
			h = h + m;
		}while(p<77);
		System.out.println(h);
	}
}
