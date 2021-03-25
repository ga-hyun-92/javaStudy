package test;

//다른 패키지에 있는 클래스이기 때문에 import해준다.
import chapter11.SimpleType;
import chapter11.TV;

public class Ex1 {

	public static void main(String[] args) {
		SimpleType type=new SimpleType();
		
		//다른 패키지에 있어도 public멤버변수와 메서드는 접근 가능.
		 type.num1=5;
		 type.func1();
		 
		 //다른패키지에 default로 선언된 멤버변수나 메서드는 접근 불가능.
		 
		 //객체지향 프로그래밍은 기능을 중심으로 프로그램을 개발하는 방법
		 //객체를 사용하는 쪽에서는 객체가 제공하는 기능만을 사용해야한다.
		 TV LG_TV =new TV();
		  
		  LG_TV.channelDown(); 
		  LG_TV.channelUp(); 
		  
		  //프로시저지향 프로그래밍 기법...
//		  LG_TV.channel++;
		  
		 //전원을 켰을 때 현재 채널 번호를 알려주고 싶을 때는??
		 //1.전원을 켜고
		  LG_TV.power();
		 //2.채널 번호를 알려준다.
		 //getter라는 메서드 추가해서 알려준다(현재 showChannel은 private라서 접근 불가능)
		  System.out.println("채널 번호는 "+LG_TV.getChannel()+"번 입니다.");

		 //LG_TV의 특징을 갖도록, 멤버변수에 접근해서 값 설정을 해줄수 있도록,
		  //Setter 메서드 사용
		  LG_TV.setColor("green");
		  System.out.println(LG_TV.getColor());
	}

}
