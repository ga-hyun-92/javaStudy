package chapter2;

public class SimpleType1 {
	//인스턴스 멤버변수: 인스턴스마다 고유한 값 저장하기 위한 변수
	int num1;
	
	//변경이 불가능한 인스턴스 멤버 변수(상수)
	final int num =0;//선언하면서 동시에 초기값 설정을 해줘야함.
	
	//클래스 멤버변수; 모든 인스턴스에 적용되는 값
	static int num2;
	
	//변경이 불가능한 클래스 멤버 변수(상수)
	static final int num3=0; //final은 주로 static과 같이 쓰인다.

	
	
}
