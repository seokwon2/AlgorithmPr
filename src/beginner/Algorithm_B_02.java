package beginner;

//1~100 ���̿��ִ� Ȧ���� �հ� ���ϱ�
public class Algorithm_B_02 {
	public static void main(String[] ar) {

		int i = -1;	//Ȧ�� ���� ��Ÿ���� ����
		int j = 0;	//���� ���� �����ϴ� ����
		
		do{
			i += 2; //Ȧ������ �������� ����
			j += i;
		}while(i<99); //i�� 99������ Ȧ������ ������ ������ do ���� ������ ����
		System.out.println(j); //������ ���

	}
}
