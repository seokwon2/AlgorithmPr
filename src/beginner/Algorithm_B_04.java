package beginner;

public class Algorithm_B_04 {
	public static void main(String [] ar){
		int i ,j;
		i=0; j=0;
		
		do{
			++i;
			if(i%2 == 1){
				j +=i ;
			}else
				j -=i;
		}while(i<100);
		System.out.println(j);
	}
}
