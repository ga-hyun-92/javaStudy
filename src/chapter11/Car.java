package chapter11;
//클래스 심화-생성자

public class Car {
	private int color;
	private int wheel;
	private float speed;
	private double fuel;
	
	//생성자
	//인스턴스가 만들어질때마다 "자동으로" 호출되는 메서드
	//일반적인 메서드가 아니므로 이름이 정해져있음
	//생성자 메서드의 이름은 클래스의 이름과 같아야함.
	//생성자 메서드는 반환타입이 없다.
	//생성자의 접근제어자는 public,private 중 하나를 쓸 수 있다.
	public Car() {
		//인스턴스 만들떄
		//해당 인스턴스가 우리가 원하는 값을 갖고 있도록
		//설정할 수 있음
//		color=1;
//		wheel=4;
//		speed=0;
//		fuel=0;
		this(1,4,0,0);
		System.out.println("매개변수 없이 인스턴스를 만들었을때");
		System.out.println("이 생성자가 처리할 고유의 코드들");
		System.out.println("매개변수 없는 Car클래스의 생성자 호출");
	}
	
	//생성자를 오버로딩한다.
	public Car(int color,int wheel,float speed,double fuel) {
		this.color=color;
		this.wheel=wheel;
		this.speed=speed;
		this.fuel=fuel;
		System.out.println("매개변수 네개 생성자 호출");
	}
	//생성자를 오버로딩한다.
	public Car(int color) {
		//this()를 사용하면 생성자를 호출할 수 있는데
		//생성자만이 생성자를 호출할 수 있다.
		//일반적인 메서드가 생성자를 호출할 수 없다.
		
		//다른 생성자를 호출하는 이 코드는 생성자의 맨 위에 위치해야한다.
		
		//생성자 안에서 다른 생성자를 호출하는 방법
		//this(매개변수) 는 생성자를 호출하는 방법
		this(color,0,0.0f,0.0);
		
		this.color=color;
		System.out.println("매개변수 하나 생성자 호출");
	}
	//생성자를 오버로딩한다.
	public Car(int color,int wheel) {
		this(color,wheel,0.0f,0.0);
		this.color=color;
		this.wheel=wheel;
		System.out.println("매개변수 두개 생성자 호출");
	}
	//생성자를 오버로딩한다.
	public Car(int color,int wheel,float speed) {
		this(color,wheel,speed,0.0);
		this.color=color;
		this.wheel=wheel;
		this.speed=speed;
		System.out.println("매개변수 세개 생성자 호출");
		
	}
	
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}
	
	
	
	

}
