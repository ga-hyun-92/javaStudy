package chapter2;

public class Ex20 {

	public static void main(String[] args) {
//		System.out.println(12/0);// ArithmeticException: /by zero
//		System.out.println(12.0/0.0);
//		System.out.println(0.0/12.0);

		short a=32_767;//32,767
		short b=1;
		
//		short c=a+b;//short�� ������ �ȵ�. short�� ������ �Ѿ��
		int c=a+b;
		System.out.println(c);
	}

}
