package chapter10;

import java.util.Scanner;

//�Ű������� �ְ� ��ȯ���� ���� �޼���
public class Ex4 {
	//�Ű������� ������ 1���� �ʿ��� �޼����̴�(int val)
	void simple1(int val) {
		System.out.println(val);
	}
	
	void simple2() {
		System.out.println("Hello World");
	}
	
	void simple3(String message) {
		System.out.println(message);
	}
	
	//simple4�޼���� ���� �ΰ��� �ʿ��� �޼���
	void simple4(int num1,int num2) {
		if (num1>num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		
	}
	
	//simple5 �޼���� ���� 2���� ���� 1���� �ʿ��� �޼���
	void simple5(int var1,int var2,char var3) {
		if (var3=='+') {
			System.out.println(var1+var2);
		} else {
			System.out.println(var1-var2);
		}
	}
	
	//�Ű������� �ִ� �޼���
	void gugudan(int num) {
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
	
	void plus0() {
		System.out.println(10+20);
	}
	
	void plus(int var1,int var2) {
		System.out.println(var1+var2);
	}
	
	void compare1(int var1,int var2) {
		if (var1>var2) {
			System.out.println("max="+var1);
		} else {
			System.out.println("max="+var2);
		}
			
	}
	
	void compare2() {
		int num1=10;
		int num2=11;
		if (num1>num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
			
	}

	
	public static void main(String[] args) {
		Ex4 ex4=new Ex4();
		
		//���� 1->1�� �����ؼ� �޼���simple1�� ������ �ö󰣴�.
		ex4.simple1(1);
		ex4.simple2();
		ex4.simple3("Hello World");
		ex4.simple3("�ȳ��ϼ���");
		ex4.simple5(1, 1, '+');
		
		Scanner scanf=new Scanner(System.in);
		System.out.println("����� ������(2~9):");
		int gugu =scanf.nextInt();
		ex4.gugudan(gugu);
		
		ex4.plus0();
		ex4.plus(10, 20);
		ex4.compare1(10, 11);
		ex4.compare2();
	}

}
