package chapter10;

import chapter2.SimpleType1;

//Ex1 Ŭ������ �޼��带 �����
//���� �޼��带 ������ Ŭ����
//�޼��带 �����->�޼��带 �����Ѵ�//�����Ѵ�.

public class Ex1 {
	//��ȯŸ���� ���� �޼���: void
	//� ������ �����ϰ� ������� �����ٶ� �����ִ� ������� '��ȯ��'�̶�� ��.
	//1. �Ű������� ��ȯ���� ���� �޼��� �����.
	void simple1() {
		System.out.println("Hello World~!");
	}
	
	public static void main(String[] args) {
		
		Ex1 ex1=new Ex1(); //simple1�޼���� Ex1�ȿ� �ִ� �޼���� EX1 �ν��Ͻ��� ���� �����ؾ���
		//simple1�޼��� ȣ������.
		ex1.simple1();
		ex1.simple1();
		ex1.simple1();
		ex1.simple1();
		
		Ex2 ex2=new Ex2();
		ex2.programStartMessage();
		ex2.simple3();
		
		Ex3 ex3=new Ex3();
		ex3.foundationDay();
		
		
	}

}
