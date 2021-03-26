package chapter13;

//abstract키워드를 붙이면 추상 클래스가 된다.
//추상 클래스는 인스턴스를 생성할 수 없다.
//추상 클래스는 추상메서드가 필수는 아니다.
//그러나 추상 메서드가 있는 클래스는 반드시 추상 클래스가 되어야한다.

public abstract class Player {
	public int num1=90;
	
	public abstract void stop();
	public abstract void play(int pos);
	
//	public static void main(String[] args) {
//		//추상 클래스 타입의 객체는 생성 가능하지만,
//		//추상 클래스의 인스턴스는 생성할 수 없다.
//		Player player;
//		player=new Player();//컴파일 오류
//	}
}
