package class_3;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		System.out.print("�÷�: ");
		
		//�÷��� 0.0~2.0���� �ֽ��ϴ�.
		//sight������ �÷��� �����ϰ� �÷��� 0.0~2.0�������� Ȯ���ϼ���.
		
		double sight=scanf.nextDouble();
		 
		// &&���
		boolean right=sight>=0.0 && sight<=2.0;
		System.out.println(right);
		
		// ||���
		boolean right2= !(sight<0.0 || sight>2.0);
		System.out.println(right2);
//		boolean result1=sight<0.0;
//		boolean result2=sight>2.0;
//		boolean result =result1 || result2;
//		System.out.println(!result);
	}

}
