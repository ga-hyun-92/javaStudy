package chapter3;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		//����
//				//for���� ����ؼ� number��ü�� ����ִ� ���ڿ��� ó������ ������ �����ؼ� ����ϼ���. 
//				String number="0123456789";
//				System.out.println(number.length());
		
//				for (int i = 0; i < number.length(); i++) {
//					System.out.println(number.charAt(i));
//					char monja;
//					if (monja=='a') {
//						System.out.println(monja);
//					}
//				}
				
		//���ڿ��� �Է� �޾� ���ڿ� �� ���ԵǾ� �ִ� ������ �����ϰ� ����ϼ���.
		Scanner scanf=new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���:");
		String mon=scanf.nextLine();
		
		for (int i = 0; i < mon.length(); i++) {
			char monja=mon.charAt(i);
			if (monja !=' ') {
				System.out.print(monja);
			} 
		}

	}

}
