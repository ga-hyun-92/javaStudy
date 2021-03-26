package chapter13;

//추상클래스는 다른 클래스의 부모 클래스가 될 수 있다.
//부모 클래스가 추상 클래스라면
//자식 클래스는 부모 클래스에 정의되어 있는
//추상 메서드를 반드시 구현해야한다.
public class AudioPlayer extends Player{
	//부모 클래스에 정의되어있는 메서드를 자식 클래스에서 재정의하는 것: 오버라이딩

	@Override
	public void stop() {
		System.out.println("stop!!!");
	}

	@Override
	public void play(int pos) {
		System.out.println("play메서드 오버라이딩");
	}

}
