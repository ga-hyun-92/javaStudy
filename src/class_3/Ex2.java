package class_3;

public class Ex2 {

	public static void main(String[] args) {
		// �񱳿��� �ǽ�1
		System.out.println(10==10);
		System.out.println(24!=10);
		System.out.println(17>32);
		System.out.println(17>=17);
		System.out.println(17<32);
		System.out.println(17<=17);
		
		// �񱳿��� �ǽ�2
		char mon1='a';//�ƽ�Ű�ڵ�ǥ 97
		char mon2='a';
		
		System.out.println(mon1==mon2);
		System.out.println(mon1!=mon2);
		System.out.println(mon1>mon2);
		System.out.println(mon1>=mon2);
		System.out.println(mon1<mon2);
		System.out.println(mon1<=mon2);

		char mon3='b';//�ƽ�Ű�ڵ�ǥ 98
		System.out.println(mon1<mon3);
		
		System.out.println();
		
		String monja1="apple"; 
		String monja2="banana";
		//���ڿ��� �⺻������ Ÿ���� �ƴ�. ���ڿ��� ����� �޸� �ּҸ� ������ ����
		//�׷��Ƿ� ���ڿ� �񱳿����� (�޸� �ּҰ�)����,�ٸ��� 2���� ������
		System.out.println(monja1==monja2);
		System.out.println(monja1!=monja2);
		
		System.out.println();
		//�񱳿��� �ǽ�3
		int num1=27;
		
		System.out.println(num1 != 10);
		System.out.println(num1 != 5);
		
		System.out.println(num1>=27);
		System.out.println(num1<=27);
		
		System.out.println(num1<=30);
		System.out.println(num1<=27);
	}

}
