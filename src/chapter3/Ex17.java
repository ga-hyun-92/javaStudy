package chapter3;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		/* 아래와 같이 줄 수를 입력 받아 별(*)을 출력하세요.
		 * 
		 * 줄 수:(입력) 3
		 * 
		 * *
		 * **
		 * ***
		 * 다음과 같이 출력되도록,,
		 * 
		 */
		
		Scanner scanf=new Scanner(System.in);
		System.out.print("1.줄 수를 입력하세요: ");
		int line=scanf.nextInt();
		
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}//end for i
				System.out.println();
		}//end for j

		
		
		
		//반대로 해보기
		/* ****
		 *  ***
		 *   **
		 *    *
		 */
		
		System.out.print("2.줄 수를 입력하세요: ");
		int row=scanf.nextInt();
		
		for (int i = row; i <= 1; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.println(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}//end for i
				System.out.println();
		}//end for j
		
		
		
		
		
	}
}
