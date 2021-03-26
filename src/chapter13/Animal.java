package chapter13;

public abstract class Animal {
	private String name;
	
	
	//배고픔 정도(0:매우배고픔,10:매우배부름)
	private int hungry;
	
	public Animal() {
		this("animal");
	}
	
	public Animal(String name) {
		this.name=name;
	}
	
	public String getMyName() {
		return name;
	}
	
	
	public int getHungry() {
		return hungry;
	}

	public void setHungry(int hungry) {
		this.hungry = hungry;
	}

	public abstract void run();
	public abstract void findFood();
	public abstract void eatFood();
	
	//동물들은 배고플 때 음식을 찾아서 먹으므로
	//eat메서드를 사용해서 배고프다면(if (hungry<=5) )
	//음식을 찾고 먹도록 구현하였다.
	//이때 동물들마다 음식을 찾는 방식이 다 다르므로 findFood메서드는 추상메서드로
	//동물들마다 음식을 먹는 방식이 다 다르므로 eatFood메서드는 추상메서드로 선언함.
	public void eat() {
		if (hungry<=5) {
			//음식을 찾는다.
			findFood();
			//음식을 먹는다.
			eatFood();
		}
	}
}
