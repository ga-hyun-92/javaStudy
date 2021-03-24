package chapter10;

import chapter2.SimpleType1;

//Ex1 클래스는 메서드를 만들고
//만든 메서드를 실행할 클래스
//메서드를 만든다->메서드를 정의한다//선언한다.

public class Ex1 {
	//반환타입이 없는 메서드: void
	//어떤 동작을 수행하고 결과값을 돌려줄때 돌려주는 결과값을 '반환값'이라고 함.
	//1. 매개변수와 반환값이 없는 메서드 만들기.
	void simple1() {
		System.out.println("Hello World~!");
	}
	
	public static void main(String[] args) {
		
		Ex1 ex1=new Ex1(); //simple1메서드는 Ex1안에 있는 메서드라서 EX1 인스턴스를 먼저 생성해야함
		//simple1메서드 호출하자.
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
