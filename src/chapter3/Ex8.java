package chapter3;

public class Ex8 {

	public static void main(String[] args) {
		//� ���� ¦���� ��� "¦����",Ȧ�� �� ��� "Ȧ��"�� ȭ�鿡 ���
		int num=23;
		num=num%2;
		
		switch (num) {
		case 0:
			System.out.println("¦���Դϴ�.");
			break;
		case 1:
			System.out.println("Ȧ���Դϴ�.");
			break;
//		default:
//			break;
		}
		
		
		//2021�� 3���� Ư�� ��¥�� �ش��ϴ� ������ ȭ�鿡 ����ϼ���.
		int date=21;
		date=date%7;
		
		switch (date) {
		case 0:System.out.println("�Ͽ����Դϴ�."); break;
		case 1:System.out.println("�������Դϴ�."); break;
		case 2:System.out.println("ȭ�����Դϴ�."); break;
		case 3:System.out.println("�������Դϴ�."); break;
		case 4:System.out.println("������Դϴ�."); break;
		case 5:System.out.println("�ݿ����Դϴ�."); break;
		default: System.out.println("������Դϴ�.");
		}

	}

}
