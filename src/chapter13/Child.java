package chapter13;
//Child클래스의 부모는 클래스만 가능하다.
//인터페이스는 클래스가 아니므로,,,부모를 상속받는 extends로 받지 않음
//대신, implements로 받는다.

//인터페이스간에 상속(extends)은 가능하다.

//클래스의 상속은 한번에 하나의 클래스만 상속할 수 있다(부모가 여럿일 수 없음)
//클래스는 단일 상속만 가능
//그러나, 인터페이스의 상속은 한번에 여러 인터페이스를 상속할 수 있다 -> 다중상속
//인터페이스는 다중 상속 가능
public class Child implements 인터페이스명{

	@Override
	public void memMethod1() {
		
	}

	@Override
	public void memMethod2() {
		
	}

	@Override
	public void memMethod3() {
		
	}

}
