package chapter12;

public class Ex1 {

	public static void main(String[] args) {
		//A-�ֻ��� �θ� Ŭ����
		//B-AŬ������ �ڽ� Ŭ����
		//C-AŬ������ �ڽ� Ŭ����,DŬ������ �θ� Ŭ����
		//D-CŬ������ �ڽ� Ŭ����

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
