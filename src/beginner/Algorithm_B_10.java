package beginner;

import java.util.*;

public class Algorithm_B_10 {
	public static void main(String[] ar) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�");
		int Input = scan.nextInt();

		int i = Input; // 

		for (int k = 2; k <= i; k++) { //math.sqrt() ������ �Լ� �̿��ؼ� ���Ҽ� ����
			if (Input % k == 0) { // �������� 0���� Ȯ��
				if (Input == k) { // �Է¹��� ����  �������� 0�� ������ �� k���� Ȯ���ؼ� �׼��� ���ٸ� �Ҽ�
					System.out.println("�Ҽ�");
					break;
				} else {
					System.out.println("�Ҽ� �ƴ�");
					break; // ������ ������ �Ҷ� 2�� ���������� ������ �������� ����� �Ҽ��� �ƴ϶�� �Ǵ�
							// break ���
				}

			}

		}

	}
}
