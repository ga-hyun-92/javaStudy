package chapter3;
//	switch(��) '��'=>���� �Ǵ� ���ڸ� ����
//  break������ ���� ������ ��� �ڵ� ����
//  default�� ���û���

public class Ex6 {

	public static void main(String[] args) {
		
		//����1
		int num=3;
		
		switch (num) {
		case 1:
			System.out.println("1�Դϴ�");
			break;
		case 2: 
			System.out.println("2�Դϴ�");
			break;
		case 3:
			System.out.println("3�Դϴ�");
//			break; //break�� ������, num=3�϶�, case4���� �����ϰ� ��ģ��. 
		case 4:
			System.out.println("4�Դϴ�");
			break;
		default:
			break;
		}//end switch
		
		System.out.println("���α׷� ����");
		
		
		//����2
		int book=2;
		
		if (book>=0) {
			switch (book) {
			case 0:
				System.out.println("���� �� �����ô°� ���ھ��!");
				break;
			case 1:
				System.out.println("�� ���̳� �����̱���!");
				break;
			case 2:
				System.out.println("å�� ����Ͻô� ���̽ó׿�!");
				break;		
			default:
				System.out.println("�ٵ����Դϴ�.");
				break;//break��� ��.
			}//end switch
			
		} else {
			System.out.println("1�� ���� ���� å�� ���� ����� �����մϴ�.");
		}//end if
		

	}//end main

}//end class
