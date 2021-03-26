package test;

import chapter12.Parent2;

public class Ex2 {

	public static void main(String[] args) {
		//같은 패키지에 있는 클래스 또는
		//같은 패키지에 있는 자식 클래스가
		//해당 멤버에 접근할 수 있도록 해주는 접근 제어자
		//protected
		
		//public-일반적으로 메서드의 접근 권한을 public으로 설정
		//       또는 바꿀수 없는 클래스 멤버 변수 사용할때,public static final
		//default
		//private-일반적으로 변수의 접근 권한을 private으로 설정
		//protected
		Parent2 parent=new Parent2();
		
//		System.out.println(parent.num);//패키지가 달라서 num에 접근 불가
		
		
	}

}
