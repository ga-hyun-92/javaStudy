package chapter13;

public class Person extends Animal{
	public Person() {
		super("사람");
	}

	@Override
	public void run() {
		System.out.println(getMyName()+"이 두발로 달립니다.");
		
	}

	@Override
	public void findFood() {
		System.out.println("배달 음식을 주문합니다.");
		
	}

	@Override
	public void eatFood() {
		System.out.println("음식을 야미야미 먹습니다.");
		
	}
}
