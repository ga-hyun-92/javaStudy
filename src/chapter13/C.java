package chapter13;
//인터페이스는 인터페이스끼리 상속 가능
//다중상속 가능
public interface C extends B,A{
	//인터페이스에서는 private접근 제어자 사용 불가
	public static final int a=1;
	
	//메서드도 private접근 제어자 사용 불가
	public abstract void method1();
}
