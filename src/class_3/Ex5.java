package class_3;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// ��Ʈ ������
		int num1=15;//  1111
		int num2=17;// 10001
		
		System.out.println(num1 & num2);//�Ѵ� 1�϶��� 1�� ���
		System.out.println(num1 | num2);//11111 �����
		System.out.println(num1 ^ num2);
		System.out.println(num1 << 2);
		System.out.println(num1 >> 2);
		
		
		// ���׿����� - (���ǽ�)?��1:��2
		int num3=true?1:2;
		int num4=false?1:2;
		System.out.println(num3);
		System.out.println(num4);
		
		boolean  button=true;
		String status=button? "���� �������ϴ�" : "���� �������ϴ�";
		System.out.println(status);
		
		/*
		 * ������� 0-100�� �����Դϴ�.
		 * 0-100�� ���̸� �Է��������� "�ùٸ� �����Դϴ�"�� ��µǰ�
		 * �׷��� ��������, "������ �߸��Ǿ����ϴ�"�� ��µǵ��� �ϼ���.
		 */
		
		Scanner scanf=new Scanner(System.in);
		System.out.print("��������: ");
		int kor=scanf.nextInt();
		String result=(kor>=0 && kor<=100)?"�ùٸ� �����Դϴ�" :"������ �߸��Ǿ����ϴ�";
		System.out.println(result);
		
		
		/*
		 * ���� ������ 50�� �̻��̸� "Pass" �� ����ϰ�
		 * ���� ������ 50�� �̸��̸� "Fail"�� ����ϼ���.
		 */
		Scanner scanf2=new Scanner(System.in);
		System.out.print("��������2: ");
		int kor2=scanf2.nextInt();
		String result2=(kor2>=50)?"Pass":"Fail";
		System.out.println(result2);

	}

}
