package chapter3;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//����1
		Scanner scanf=new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϼ���(0<=x<=100): ");
		int num1=scanf.nextInt();
		
		Scanner scanf2=new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϼ���(0<=x<=100): ");
		int num2=scanf2.nextInt();
		
		if ((num1>=0&&num1<=100)&&(num2>=0&&num2<=100)) {
			if (num1>=num2) {
				System.out.println("max="+num1);
			} else if(num1<num2){
				System.out.println("max="+num2);
			} 
		} else {
			System.out.println("0-100���� ���� �����մϴ�.");
		}
		
		//����1
		Scanner scanf3=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int score=scanf3.nextInt();
		
		if (score>=90) {
			System.out.println("����: A");
		} else if (score>=80 ) {
			System.out.println("����: B");
		}else if (score>=70 ){
			System.out.println("����: C");
		}else if (score>=60 ){
			System.out.println("����: D");
		}else {
			System.out.println("����: F");
		}
//		scanf.close();
		
		//����3
		Scanner scanf4=new Scanner(System.in);
		String a="+";
//		next �޼���=> ����ڰ� �Է��� ���� ���ڿ��� ������
		System.out.println("���ڸ� �Է��ϼ���: ");
		String b=scanf4.next();
		
		if (a==b) {
			System.out.println("a�� b�� �����ϴ�.");
		} else {
			System.out.println("a�� b�� �ٸ��ϴ�.");
		}
		//+��� �Է��ص� "�ٸ��ϴ�"��� ��µȴ�. ��???? 
		//���ڿ��� �⺻������ Ÿ���� �ƴ϶�, �ּҰ��� �����Ѵ�. �ּҰ� �ٸ��� ������ �ٸ��ٰ� ���°�
				
		
		if (a.equals(b)) {
			System.out.println("a�� b�� �����ϴ�.");
		} else {
			System.out.println("a�� b�� �ٸ��ϴ�.");
		}
		
		scanf.close();
	}

}
