package chapter3;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		System.out.print("ù ��° ���� �Է��ϼ���: ");
		int num1=scanf.nextInt();
		
		Scanner scanf2=new Scanner(System.in);
		System.out.print("�� ��° ���� �Է��ϼ���: ");
		int num2=scanf2.nextInt();
		
		Scanner scanf3=new Scanner(System.in);
		System.out.print("�����ڸ� �Է��ϼ���: ");
		String cal=scanf3.next();
		
		System.out.print(num1+cal+num2+"=");
		if (cal.equals("/")) {
			System.out.println( (double)num1/num2);
		} else if(cal.equals("+")) {
			System.out.println( num1+num2);
		}  else if(cal.equals("-")) {
			System.out.println( num1-num2);
		}  else if(cal.equals("*")) {
			System.out.println( num1*num2);
		} else {
			System.out.println("�����ڰ� �߸� �ԷµǾ����ϴ�.");
		}
		

	}

}
