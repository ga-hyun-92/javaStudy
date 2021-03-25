package chapter11;
//import java.util.Scanner;
//import 패키지명(java.util).클래스명(Scanner);

//또는  java.util밑에 있는 모든 클래스를 사용하겠다라는 의미로 다음과 같이,
import java.util.*;

//static import->클래스의 클래스 멤버들을 클래스명 없이 사용할 수 있도록 해주는 구문
import static chapter11.SimpleType.*;

public class Ex3 {
	
	

	public static void main(String[] args) {
//		java.util.Scanner scanf=new java.util.Scanner(System.in); 
		//원래 이렇게 패키지명과 함께..
		Scanner scanf=new Scanner(System.in);
		
		
		SimpleType type=new SimpleType();
		//Ex3()클래스와 같은 패키지에 들어있으므로 패키지 import안해도됨.
		
//		System.out.println(SimpleType.num1);
//		System.out.println(num1);
//		
//		SimpleType.hello();
//		hello();
		
		
	}

}