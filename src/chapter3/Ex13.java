package chapter3;
//while문은 주로 조건 반복문(끝이 명확하지 않은)에 적합하다. 
//break는 switch문, 반복문(for,while)에서만 사용된다.

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/* 
		 * 음악 플레이어 프로그램을 만든다
		 * 음악은 1번부터 10번까지 재생
		 */
		
		Scanner scanf=new Scanner(System.in);
		//음악을 다시 듣고 다시 재생할지 여부
		char repeat ='y';
		
		while (true) {
			System.out.println("음악을 재생합니다.");
			
//			int i=1;
//			while (i<=10) {
//				System.out.println(i+"번트랙재생");
//				i+=1;
//			}
			System.out.println("1번트랙재생");
			System.out.println("2번트랙재생");
			System.out.println("3번트랙재생");
			System.out.println("4번트랙재생");
			System.out.println("5번트랙재생");
			System.out.println("6번트랙재생");
			System.out.println("7번트랙재생");
			System.out.println("8번트랙재생");
			System.out.println("9번트랙재생");
			System.out.println("10번트랙재생");
			
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat=scanf.next().charAt(0);
			if (repeat !='y') {
				break;
			}//end if
		}//end while
		
//		do-while문으로 바꾸기
//		do {
//			System.out.println("음악을 재생합니다.");
//			
//			System.out.println("1번트랙재생");
//			System.out.println("2번트랙재생");
//			System.out.println("3번트랙재생");
//			System.out.println("4번트랙재생");
//			System.out.println("5번트랙재생");
//			System.out.println("6번트랙재생");
//			System.out.println("7번트랙재생");
//			System.out.println("8번트랙재생");
//			System.out.println("9번트랙재생");
//			System.out.println("10번트랙재생");
//			
//			System.out.println("다시 처음부터 재생하시겠습니까?");
//			repeat=scanf.next().charAt(0);
//		} while (repeat=='y');

	}

}
