package chapter11;

public class Ex2 {

	public static void main(String[] args) {
		Ex1 obj=new Ex1();
		obj.num1=1;
		obj.num2=3.14;
		obj.num3='a';
		obj.num4="hello";
		
		obj.func1();
		obj.func2();
		obj.func3();
		obj.func4();
		
		System.out.println("==================");
		
		//방금 같이 그린것처럼 obj2인스턴스의 상태를 그려보세요
		Ex1 obj2=new Ex1();
		obj2.num1=1;
		obj2.num2=3.14;
		obj2.num3='a';
		obj2.num4="hello";
		
		obj2.func1();
		obj2.func2();
		obj2.func3();
		obj2.func4();

	}

}
