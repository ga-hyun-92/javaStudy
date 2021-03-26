package chapter13;

public class Ex1 {

	public static void main(String[] args) {
		//부모 클래스에 정의되어 있는 메서드를
		//자식 클래스마다 서로 다르게 구현해야할 때
		//추상 클래스가 유요하게 사용됨.
		Lion lion =new Lion();
		Person person=new Person();
		
		lion.run();
		lion.setHungry(6);
		lion.eat();
		
		person.run();
		person.setHungry(1);
		person.eat();

	}

}
