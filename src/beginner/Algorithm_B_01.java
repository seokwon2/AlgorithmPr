package beginner;

//�⺻1. 1~100���� �հ� ���ϱ�
public class Algorithm_B_01 {
	public static void main(String[] ar) {

		int i=0; // 1�� �����ϴ� ����
		int j=0; // ���� ���� ���� ����

		do {
			++i;
			j+=i;
		} while (i < 100);
		System.out.println(j); //�������� ��� �ִ� j�� ���
	}
}
