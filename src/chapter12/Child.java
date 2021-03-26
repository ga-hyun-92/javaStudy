package chapter12;

public class Child extends Parent{
	//부모 클래스로부터 상속 받은 정수를 저장하는 x
//	public int x=20;
	public int x;
	public int y;
	
	//상속 관계에서는 자식 클래스의 기본 생성자는
	//매개변수는 없고 부모 클래스의 기본 생성자를 호출한다.
	public Child() {
		this(0,0);//자신의 다른 생성자 호출할경우 super()안함.대신 호출한 다른 생성자에서 super()호출함.
		System.out.println("매개변수 없는 생성자");
//		기본 생성자를 직접 추가했고
//		부모 클래스의 기본 생성자를 호출하는 코드를 작성하지 않았다.
//		그래도 컴파일러가 자동으로 super()를 추가해준다.
//		super();
	}
	
	//자식클래스의 인스턴스가 만들어질 때
	//부모 클래스의 멤버들을 같이 생성하므로
	//자식 클래스의 생성자를 만든다면 
	//자식 클래스의 생성자의 맨 처음에 부모 클래스의 생성자를 호출해야한다.
	public Child(int x,int y) {
		super(1);//부모클래스 생성자가 기본 생성자가 아니므로 직접 정의해줘야함.
		System.out.println("매개변수 있는 생성자");
		System.out.println("자식 클래스의 생성자");
		this.x=x;
		this.y=y;
//		super(); //이렇게 하면 오류!!맨 첫줄에 호출해야함.
	}
	
	

	
	
	public void method() {
		System.out.println("x="+x);//자기 자신의 x라는 멤버변수가 있으면 자신의 값으로 받고 없으면 부모클래스로부터 받은 x값으로
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
	
	public static void main(String[] args) {
		Child child=new Child();//부모클래스 생성자 자동호출
//		child.method();
	}
}
