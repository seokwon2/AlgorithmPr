package beginner;

import java.util.*;

//�Ҽ��� �� ���ϱ�
public class Algorithm_B_11 {
	public static void main(String[] ar) {
		System.out.println("���ڸ� �Է����ּ���");
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();

		int hap = 0;
		int k = 2;
		int j;

		while (true) {
			j = 2;
			while (k % j != 0)
				j++;
			if (k == j)
				hap += k;
			if (k < A)
				k++;
			else {
				System.out.println(hap);
				break;
			}
		}
	}
}
