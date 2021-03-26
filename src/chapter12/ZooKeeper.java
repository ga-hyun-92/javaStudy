package chapter12;

public class ZooKeeper {
//	void feed(Lion lion) {
//		//동물에게 먹이를 줌
//		System.out.println(lion.getMyName()+"에게 먹이주기");
//	}
//	
//	void feed(Rabbit rabbit) {
//		System.out.println(rabbit.getMyName()+"에게 먹이주기");
//	}
//	
//	void feed(Monkey monkey) {
//		System.out.println(monkey.getMyName()+"에게 먹이주기");
//	}
	
	//다형성 활용
	void feed(Animal animal) {
		System.out.println(animal.getMyName()+"에게 먹이주기");
	}
}
