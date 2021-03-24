package chapter10;

import java.util.Scanner;

//매개변수가 있고 반환값이 없는 메서드
public class Ex4 {
	//매개변수로 정수가 1개가 필요한 메서드이다(int val)
	void simple1(int val) {
		System.out.println(val);
	}
	
	void simple2() {
		System.out.println("Hello World");
	}
	
	void simple3(String message) {
		System.out.println(message);
	}
	
	//simple4메서드는 정수 두개가 필요한 메서드
	void simple4(int num1,int num2) {
		if (num1>num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		
	}
	
	//simple5 메서드는 정수 2개와 문자 1개가 필요한 메서드
	void simple5(int var1,int var2,char var3) {
		if (var3=='+') {
			System.out.println(var1+var2);
		} else {
			System.out.println(var1-var2);
		}
	}
	
	//매개변수가 있는 메서드
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
		
		//인자 1->1을 복사해서 메서드simple1로 가지고 올라간다.
		ex4.simple1(1);
		ex4.simple2();
		ex4.simple3("Hello World");
		ex4.simple3("안녕하세요");
		ex4.simple5(1, 1, '+');
		
		Scanner scanf=new Scanner(System.in);
		System.out.println("출력할 구구단(2~9):");
		int gugu =scanf.nextInt();
		ex4.gugudan(gugu);
		
		ex4.plus0();
		ex4.plus(10, 20);
		ex4.compare1(10, 11);
		ex4.compare2();
	}

}
