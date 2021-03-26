package chapter12;

public class Ex4 {

	public static void main(String[] args) {
		TV tv=new TV();
		
		CaptionTV captionTV=new CaptionTV();
		
		//다형성- tv2라는 객체는 TV타입의 객체이면서
		//      TV클래스의 자식 클래스인 CaptionTV타입의 객체도 된다.
		TV tv2=new CaptionTV();
		
//		단,자식 타입의 객체가 부모타입의 인스턴스를 가리킬 수는 없음.
//		CaptionTV captionTV2=new TV();// 이건 컴파일 오류

	}

}
