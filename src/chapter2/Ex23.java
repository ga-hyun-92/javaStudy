package chapter2;

public class Ex23 {

	public static void main(String[] args) {
		//����1-���ǹ� if��
		System.out.println("�ڵ����");
		
		if (true) {
			System.out.println("�� if����");
			System.out.println("���̹Ƿ�");
			System.out.println("�ڵ尡 ����˴ϴ�");
		}
		
		if (false) {
			System.out.println("�� if����");
			System.out.println("���̹Ƿ�");
			System.out.println("�ڵ尡 ����˴ϴ�");
		}
		
		System.out.println("�ڵ峡");
		
		
		//����2-���ǹ� if��
		int score=59;
		if (score>=60) {
			System.out.println("���");
		}
		
		if (score<60) {
			System.out.println("�����");
		}

	}

}
