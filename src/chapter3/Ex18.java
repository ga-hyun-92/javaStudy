package chapter3;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		//예제
//				//for문을 사용해서 number객체에 들어있는 문자열을 처음부터 끝까지 접근해서 출력하세요. 
//				String number="0123456789";
//				System.out.println(number.length());
		
//				for (int i = 0; i < number.length(); i++) {
//					System.out.println(number.charAt(i));
//					char monja;
//					if (monja=='a') {
//						System.out.println(monja);
//					}
//				}
				
		//문자열을 입력 받아 문자열 내 포함되어 있는 공백을 제거하고 출력하세요.
		Scanner scanf=new Scanner(System.in);
		System.out.println("문자열을 입력하세요:");
		String mon=scanf.nextLine();
		
		for (int i = 0; i < mon.length(); i++) {
			char monja=mon.charAt(i);
			if (monja !=' ') {
				System.out.print(monja);
			} 
		}

	}

}
