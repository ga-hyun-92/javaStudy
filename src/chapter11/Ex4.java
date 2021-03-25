package chapter11;

public class Ex4 {

	public static void main(String[] args) {
		SimpleType type=new SimpleType();
		
		//public 접근제어자로 선언된  num1,func1()
		type.num1=10;
		type.func1();
		
		//default 접근제어자로 선언된
		type.num2=10;
		type.func2();
		
		//같은 패키지에 다른 클래스에 private접근제어자로 선언된 num3,func3()은 접근 불가능.
		
		
		TV samsung=new TV();
		
		

	}

}
