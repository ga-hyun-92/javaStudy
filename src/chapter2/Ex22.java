package chapter2;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		char ch='1';
		
		boolean exam= ch>='0' && ch<='9';
		boolean exam2= ch>=48 && ch<=57;
		System.out.println(exam);

		//���� ���� �ڵ�
		Scanner scanf=new Scanner(System.in);
		System.out.println("�Է��ϼ���:");
		char ch_2=scanf.nextLine().charAt(0);
		boolean result= ch_2>='0' && ch_2<='9';
		System.out.println(result);
		
	
	}

}
