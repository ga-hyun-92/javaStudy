package class_3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/* �� ������:����( true,false)�� �����ϱ� ���� ������
		 * true->��,1
		 * false->����,0
		 * 1*1�� 1�� ��ó��,,,�׷��� �����̶�� �θ�
		 * 
		 * &&:�� �� ��� true�϶� ����� true
		 * ||:�� �� �� �ϳ���  true�̸� ����� true
		 * ! :true�� false��, false�� true�� ���� �ݴ�� ������ִ� ������
		 */

		//���� 1*1�϶��� 1�̶�� ���� ���� / �׸���
		System.out.println(true&&true);//�� �� ��� true�϶� ����� true
		System.out.println(true&&false);
		System.out.println(false&&false);
		System.out.println(false&&true);
		
		
		//���� 0+0�϶���, 0�̶�� ���� ���� / �Ǵ�
 		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||false);
		System.out.println(false||true);
		
		System.out.println();
		System.out.println(!true);
		System.out.println(!false);
		
		
		/* ����
		 * ���� ��� ���α׷��� �����ϼ���
		 * ���� ������ 0-100�� �����Դϴ�.
		 * ���� ������ �Է� �޾� ������ �������� ��ȯ���ּ���.
		 */
		
		//Scanner ��� �ٷ���: �Է��� ���� �������� ����� ���� ����
		//��� �ٷ��̸� ����Ϸ��� ��üȭ�� ���Ѿ���.
		Scanner scanf=new Scanner(System.in);
		System.out.print("�������� �Է�:");
		//��ü�� �����ϴ� ����� �޼����� �θ�. scanf ��ü�� �����ϴ� �޼��� �� �ϳ�
		//nextInt �޼���: �Է��� ���� ������ �������� ���
		int score=scanf.nextInt();
		
		boolean right=score>=0 && score<=100;
		System.out.println(right);
//		if (score<0 || score>100) {
//			System.out.println("0-100�� ���̸� �����մϴ�.");
//		} else {
//			System.out.println("����="+score);
//		}
		
		scanf.close();
		
		
		
	}

}
