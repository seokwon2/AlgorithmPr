package beginner;

import java.util.*;

public class Algorithm_B_10 {
	public static void main(String[] ar) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�");
		int Input = scan.nextInt();

		int i = Input - 1; // �ڱ� �ڽ� -1 ���� �����鼭 ������Ȯ��
		int j = 2; // �������߿� �ּҰ��� 2�� ����

		for (int k = j; k <= i; k++) {
			if (Input % k == 0) {
				System.out.println("�Ҽ� �ƴ�");
				break; //������ ������ �Ҷ� 2�� ���������� ������ �������� ����� �Ҽ��� �ƴ϶�� �Ǵ�
						//break ���
			}else{
				System.out.println("�Ҽ�");
			}

		}

	}
}
