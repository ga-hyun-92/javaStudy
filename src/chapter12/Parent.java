package chapter12;

//모든 클래스는 생성자가 반드시 필요하다.생성자가 있어야 인스턴스가 만들어진다.
//생성자를 직접 추가해주지 않으면
//컴파일러가 기본 생성자라고 하는 것을 추가해준다.
//기본 생성자->매개변수가 없고 아무것도 하지 않는 생성자. 
public class Parent {
	public int x=10;
	

	//기본생성자->매개변수가 없고 아무것도 하지 않는 생성자. 
	public Parent(int x) {
		 System.out.println("부모 클래스의 기본 생성자");
		 this.x=x;
	}
	
}
