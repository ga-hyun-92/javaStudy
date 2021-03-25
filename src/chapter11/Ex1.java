package chapter11;
//클래스 심화
public class Ex1 {
	int num1;
	double num2;
	char num3;
	String num4;
	
	void func1() {
		//this는 이 인스턴스에 있는 이라는 의미
		System.out.println(this.num1);
	}
	void func2() {
		System.out.println(this.num2);
	}
	
	void func3() {
		System.out.println(this.num3);
		
	}
	
	void func4() {
		System.out.println(this.num4);
		
	}
	
}
