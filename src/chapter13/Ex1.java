package chapter13;

public class Ex1 {

	public static void main(String[] args) {
		//�θ� Ŭ������ ���ǵǾ� �ִ� �޼��带
		//�ڽ� Ŭ�������� ���� �ٸ��� �����ؾ��� ��
		//�߻� Ŭ������ �����ϰ� ����.
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
