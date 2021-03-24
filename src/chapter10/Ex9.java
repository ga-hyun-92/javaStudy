package chapter10;

public class Ex9 {
	//이름은 같지만 매개변수가 다른 메서드들을 "오버로딩"된 메서드라고 함
	//두 정수를 더한 결과를 반환하는 메서드
	int add(int num1,int num2) {
		return num1+num2;
	}
	
	//두 실수를 더한 결과를 반환하는 메서드
	double add(double fnum1,double fnum2) {
		return fnum1+fnum2;
	}
	
	//하나의 정수와 하나의 실수를 더한 결과를 반환하는 메서드
	double add(double fnum1,int num2) {
		return fnum1+num2;
	}
	
	
	int num1;
	
	static int num2;
	
	void instanceMemberMethod() {
		System.out.println("인스턴스 멤버 메서드");
	}
	
	static void classMemberMethod() {
		System.out.println("클래스 멤버 메서드");
	}
	
	//main도 클래스 멤버 메서드이다.
	public static void main(String[] args) {
		Ex9 ex9=new Ex9();
		ex9.add(1, 1);
		ex9.add(1.0, 1.0);
		ex9.add(1.0, 1);
		
		ex9.instanceMemberMethod();
		Ex9.classMemberMethod();
     
	}

}
