package chapter12;

//상속을 받으면 부모 크래스에 있는 대부분 멤버 변수와 멤버 메서드를 사용할 수 있다.
//부모 클래스에 정의되어 있는 생성자는 상속 받을 수 없다.
//private접근 제어자로 되어 있는 멤버 변수, 메서드는 상속을 받기는 하지만
//자식 클래스가 접근할 수 없는 멤버의 형태로 상속을 받는다.
public class B extends A{
	
	public void showNum1() {
		System.out.println(this.num1);
		
//		System.out.println(this.num2); //컴파일 오류!!num2는 private변수
//		방법은?? getter메서드 사용
		System.out.println(getNum2());
//		setter사용해서 다른 값으로 설정도 가능
		setNum2(10);
	}
}
