package chapter3;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		/* �Ʒ��� ���� �� ���� �Է� �޾� ��(*)�� ����ϼ���.
		 * 
		 * �� ��:(�Է�) 3
		 * 
		 * *
		 * **
		 * ***
		 * ������ ���� ��µǵ���,,
		 * 
		 */
		
		Scanner scanf=new Scanner(System.in);
		System.out.print("1.�� ���� �Է��ϼ���: ");
		int line=scanf.nextInt();
		
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}//end for i
				System.out.println();
		}//end for j

		
		
		
		//�ݴ�� �غ���
		/* ****
		 *  ***
		 *   **
		 *    *
		 */
		
		System.out.print("2.�� ���� �Է��ϼ���: ");
		int row=scanf.nextInt();
		
		for (int i = row; i <= 1; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.println(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}//end for i
				System.out.println();
		}//end for j
		
		
		
		
		
	}
}
