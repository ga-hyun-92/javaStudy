package chapter3;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
//		Ex13���� �߰�: �� Ʈ���� ����� ������ �ٽ� ó������ ����� �� ���´�.
		
		Scanner scanf=new Scanner(System.in);
		//������ �ٽ� ��� �ٽ� ������� ����
		char repeat ='y';
		
		while (true) {
			System.out.println("������ ����մϴ�.");
			
			int i=1;
			while (i<=10) {
				System.out.println(i+"��Ʈ�����");
				System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
				repeat=scanf.next().charAt(0);
				if (repeat =='y') {
					//�ٽ� ó������ ���
					i=1;
					continue;
				} 
				i+=1;
			
			}//end while
			
		}//end while
	}

}
