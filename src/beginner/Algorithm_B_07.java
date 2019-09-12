package beginner;

//1!+2! ``` 10! 까지의 합을 구하기
public class Algorithm_B_07 {
	public static void main(String[] ar) {
		int i, j, k;
		
		j = 1;
		k = 1;
		
		/*do{
			i++;
			j=j *i;
			k=k+j;
		}while(i<10);*/
		
		for(i=1; i<11; i++){
			j *= i;
			k += j;
		}
		System.out.println(k);
	}
}
