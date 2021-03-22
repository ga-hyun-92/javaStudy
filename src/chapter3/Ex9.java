package chapter3;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		
		System.out.print("첫번 째 수: ");
		int num1=scanf.nextInt();
		
		System.out.print("두번 째 수: ");
		int num2=scanf.nextInt();
		
		System.out.print("연산자: ");
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
			System.out.println("+,-,*,/만 입력할 수 있습니다.");
			break;
		}
		
		

	}

}
