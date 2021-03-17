package class_3;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// 비트 연산자
		int num1=15;//  1111
		int num2=17;// 10001
		
		System.out.println(num1 & num2);//둘다 1일때만 1로 계산
		System.out.println(num1 | num2);//11111 결과값
		System.out.println(num1 ^ num2);
		System.out.println(num1 << 2);
		System.out.println(num1 >> 2);
		
		
		// 삼항연산자 - (조건식)?식1:식2
		int num3=true?1:2;
		int num4=false?1:2;
		System.out.println(num3);
		System.out.println(num4);
		
		boolean  button=true;
		String status=button? "불이 켜졌습니다" : "불이 꺼졌습니다";
		System.out.println(status);
		
		/*
		 * 국어성적은 0-100점 사이입니다.
		 * 0-100점 사이를 입력했을때는 "올바른 점수입니다"가 출력되고
		 * 그렇지 않을때는, "점수가 잘못되었습니다"가 출력되도록 하세요.
		 */
		
		Scanner scanf=new Scanner(System.in);
		System.out.print("국어점수: ");
		int kor=scanf.nextInt();
		String result=(kor>=0 && kor<=100)?"올바른 점수입니다" :"점수가 잘못되었습니다";
		System.out.println(result);
		
		
		/*
		 * 국어 성적이 50점 이상이면 "Pass" 를 출력하고
		 * 국어 성적이 50점 미만이면 "Fail"을 출력하세요.
		 */
		Scanner scanf2=new Scanner(System.in);
		System.out.print("국어점수2: ");
		int kor2=scanf2.nextInt();
		String result2=(kor2>=50)?"Pass":"Fail";
		System.out.println(result2);

	}

}
