package beginner;
//Ȧ�� ¦�� ���� ��ȣ �����ϸ鼭 ���ϱ�
public class Algorithm_B_05 {
	public static void main(String[] ar) {
		int i; double j;
		j = 1;

		for (i = 1; i < 100; i++) {
			if (i % 2 == 0) { // i ���� ¦�� ������ Ȯ��
				j = j * i; //¦���϶��� �׳� ���ؼ� j�� ����
			} else {
				j *= i * -1; //Ȧ�� �϶��� �������� j�� ������ ����
			}
		}
		System.out.println(j);
	}
}
