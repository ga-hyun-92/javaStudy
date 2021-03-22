package chapter3;
//	switch(값) '값'=>정수 또는 문자만 가능
//  break만날때 까지 하위의 모든 코드 실행
//  default는 선택사항

public class Ex6 {

	public static void main(String[] args) {
		
		//예제1
		int num=3;
		
		switch (num) {
		case 1:
			System.out.println("1입니다");
			break;
		case 2: 
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
//			break; //break가 없으면, num=3일때, case4까지 실행하고 마친다. 
		case 4:
			System.out.println("4입니다");
			break;
		default:
			break;
		}//end switch
		
		System.out.println("프로그램 종료");
		
		
		//예제2
		int book=2;
		
		if (book>=0) {
			switch (book) {
			case 0:
				System.out.println("조금 더 읽으시는게 좋겠어요!");
				break;
			case 1:
				System.out.println("한 권이나 읽으셨군요!");
				break;
			case 2:
				System.out.println("책을 사랑하시는 분이시네요!");
				break;		
			default:
				System.out.println("다독왕입니다.");
				break;//break없어도 됨.
			}//end switch
			
		} else {
			System.out.println("1년 동안 읽은 책의 수는 양수만 가능합니다.");
		}//end if
		

	}//end main

}//end class
