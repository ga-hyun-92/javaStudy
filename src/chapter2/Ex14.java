package chapter2;

public class Ex14 {

	public static void main(String[] args) {
		 int var1;
		 
		//1. EX11타입의 인스턴스를 생성
		//2. obj1 객체에 저장
		 Ex11 obj1; //obj1이라는 변수(객체)에는 Ex11타입의 데이터를 저장할거다. 즉, 라벨을 만든 개념
		 obj1=new Ex11(); //공간을 만든다(박스준비). ctrl키 누른 상태로 Ex11누르면 거기로 이동함.
//		 Ex11 obj1=new Ex11();
		 obj1.var1=10;
		 obj1.var2=3.14;
		 obj1.var3='a';
		 obj1.var4="Hello";
		 
		//1. EX12타입의 인스턴스를 생성
		//2. obj2 객체에 저장
		 Ex12 obj2=new Ex12();
		 
		//1. EX13타입의 인스턴스를 생성
		//2. obj3 객체에 저장
		 Ex13 obj3=new Ex13();
		 
		 
		 //예제1.Ex13 클래스의 인스턴스를 만들고 ex13객체에 저장하세요.
		 Ex13 ex13=new Ex13();
		 
		 //예제2.chulsu 객체를 만들고 Student클래스의 인스턴스를 저장하세요.
		 Student chulsu=new Student();
		 chulsu.name="이철수";
		 chulsu.age=16;
		 System.out.println(chulsu.name);
		 System.out.println(chulsu.age);
		 
		 //예제3.Student 클래스의 인스턴스를 만들고 student객체에 저장하세요.
		 Student student=new Student();
		 
		 System.out.println(student.name);//저장한 값이 없어서, 기본값이 출력됨
		 System.out.println(student.age);//기본값이 출력됨
		 
		 //클래스라고 하는 나만의 데이터 타입 선언
		 //클래스를 사용해서 인스턴스를 생성
		 //인스턴스 안에 데이터를 저장
		 //저장된 데이터를 출력
		 
		 //obj2객체에 100,50정수를 저장하세요
		 obj2.num1=100;
		 obj2.num2=50;
		 
		 //obj3객체에 32,180.6,'A',"나이키", "삼성"을 저장하세요/
		 obj3.num1=32;
		 obj3.num2=180.6;
		 obj3.var1='A';
		 obj3.var2="나이키";
		 obj3.var3="삼성";
		 
		 System.out.println(obj3.num1);
		 System.out.println(obj3.num2);
		 System.out.println(obj3.var1);
		 System.out.println(obj3.var2);
		 System.out.println(obj3.var3);
	}

}
