package chapter2;

public class Ex16 {

	public static void main(String[] args) {
		// ����
		int num1=10;
		num1=20;
		
		int num2=10;
		num2=30;
		
		// ��� : ���ϸ� �ȵǴ� �����Ͱ� ���� ��� ��� 
		// ������ �Ǵ� ��
		// ���� : ������, Ư�� ������ �츮���� ���� ũ��(������)
		final int num3=10;// ���� �ٲܼ� ���� ��=���

		final double PI=3.14;
		
		num1=num1*num2;
		System.out.println(num2);
		System.out.println(num1);

	}

}
