package chapter12;

public class Ex1 {

	public static void main(String[] args) {
		//A-최상위 부모 클래스
		//B-A클래스의 자식 클래스
		//C-A클래스의 자식 클래스,D클래스의 부모 클래스
		//D-C클래스의 자식 클래스

		A a =new A();
		a.num1=1;//public
		a.num3=3;//default
		a.num4=4;//protected
		
		B b =new B();
		
		C c =new C();
		
		D d =new D();
		
		Point point =new Point();
		System.out.println(point.getLocation());
		
		Point3D point3D=new Point3D();
		System.out.println(point3D.getLocation());
		
	}

}
