package beginner;

import java.util.Scanner;

//������ ������ ���� �ϴ� ������ ���ؼ� n��° ���� ���� ���ϱ�
public class Algorithm_B_06 {
	public static void main(String[] ar) {
		System.out.println("���ϴ� ���� �Է� ���ּ���");
		Scanner n = new Scanner(System.in); //n�� �Է¹޽��ϴ�
		int N = n.nextInt()-1; //n��° �ױ����� ���� ���ϱ� ���ؼ��� n-1��° �� ���� ���� ���ϸ� n��° ���� ���� ����
		//�׷��� -1�� ���ݴϴ�
 
		int x, y, z;
		// x : 1�� �����ϴº���
		// y : x�����ؼ� �����ϴ� ��
		// z : y�� ���� ���� ���� �ϴ� ����

		x = 0;
		y = 1;
		z = 1;

		do {
			x++; 
			y += x;
			z += y;
		} while (x < N);
		System.out.println(z);
	}
}
