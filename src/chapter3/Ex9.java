package chapter3;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		
		System.out.print("ù�� ° ��: ");
		int num1=scanf.nextInt();
		
		System.out.print("�ι� ° ��: ");
		int num2=scanf.nextInt();
		
		System.out.print("������: ");
		String operator=scanf.next();
		
		switch (operator) {
		case "+":
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case "-":
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case "*":
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
		case "/":
			System.out.println(num1+"/"+num2+"="+((double)num1/num2));
			break;

		default:
			System.out.println("+,-,*,/�� �Է��� �� �ֽ��ϴ�.");
			break;
		}
		
		

	}

}
