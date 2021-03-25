package chapter11;
//접근제어자
//public:모든 클래스에서 사용가능
//default:같은 패키지 내 클래스에서만 사용 가능
//protected: 같은 패키지 또는 자식 클래스만 사용 가능
//private: 오직 자신만 사용 가능

//주로 default,private만 사용한다.
//객체 안에 있는 데이터를 함부로 바꾸지 않게 하려고...데이터 보호

public class SimpleType {
//	static int num1=10;
//	
//	static void hello() {
//		System.out.println("Hello World");
//	}
	
	public int num1;
	int num2;//접근 제어자를 안쓰면 자동으로 default 접근제어자로 설정됨
	private int num3;
	
	public void func1() {
		System.out.println("func1");
	}
	
	void func2() {
		System.out.println("func2");
	}
	
	private void func3() {
		System.out.println("func3");
	}
}
