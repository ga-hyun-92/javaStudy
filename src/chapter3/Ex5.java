package chapter3;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요: ");
		int num1=scanf.nextInt();
		
		Scanner scanf2=new Scanner(System.in);
		System.out.print("두 번째 수를 입력하세요: ");
		int num2=scanf2.nextInt();
		
		Scanner scanf3=new Scanner(System.in);
		System.out.print("연산자를 입력하세요: ");
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
			System.out.println("연산자가 잘못 입력되었습니다.");
		}
		

	}

}
