package chapter3;
//while���� �ַ� ���� �ݺ���(���� ��Ȯ���� ����)�� �����ϴ�. 
//break�� switch��, �ݺ���(for,while)������ ���ȴ�.

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/* 
		 * ���� �÷��̾� ���α׷��� �����
		 * ������ 1������ 10������ ���
		 */
		
		Scanner scanf=new Scanner(System.in);
		//������ �ٽ� ��� �ٽ� ������� ����
		char repeat ='y';
		
		while (true) {
			System.out.println("������ ����մϴ�.");
			
//			int i=1;
//			while (i<=10) {
//				System.out.println(i+"��Ʈ�����");
//				i+=1;
//			}
			System.out.println("1��Ʈ�����");
			System.out.println("2��Ʈ�����");
			System.out.println("3��Ʈ�����");
			System.out.println("4��Ʈ�����");
			System.out.println("5��Ʈ�����");
			System.out.println("6��Ʈ�����");
			System.out.println("7��Ʈ�����");
			System.out.println("8��Ʈ�����");
			System.out.println("9��Ʈ�����");
			System.out.println("10��Ʈ�����");
			
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat=scanf.next().charAt(0);
			if (repeat !='y') {
				break;
			}//end if
		}//end while
		
//		do-while������ �ٲٱ�
//		do {
//			System.out.println("������ ����մϴ�.");
//			
//			System.out.println("1��Ʈ�����");
//			System.out.println("2��Ʈ�����");
//			System.out.println("3��Ʈ�����");
//			System.out.println("4��Ʈ�����");
//			System.out.println("5��Ʈ�����");
//			System.out.println("6��Ʈ�����");
//			System.out.println("7��Ʈ�����");
//			System.out.println("8��Ʈ�����");
//			System.out.println("9��Ʈ�����");
//			System.out.println("10��Ʈ�����");
//			
//			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
//			repeat=scanf.next().charAt(0);
//		} while (repeat=='y');

	}

}
