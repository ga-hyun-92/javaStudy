package chapter10;
//메서드-선언 및 호출 예제

public class Ex2 {

	void programStartMessage() {
		System.out.println("Java Program Start");
	}
	
	void simple3() {
		System.out.println(1+1);
	}
	
	
	public static void main(String[] args) {
		Ex2 ex2=new Ex2();
		ex2.programStartMessage();
		ex2.simple3();
	

	}

}
