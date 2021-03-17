package class_3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/* 논리 연산자:논리값( true,false)를 연산하기 위한 연산자
		 * true->참,1
		 * false->거짓,0
		 * 1*1만 1인 것처럼,,,그래서 논리곱이라고도 부름
		 * 
		 * &&:두 값 모두 true일때 결과가 true
		 * ||:두 값 중 하나만  true이면 결과가 true
		 * ! :true를 false로, false를 true로 값을 반대로 만들어주는 연산자
		 */

		//논리곱 1*1일때만 1이라는 값이 나옴 / 그리고
		System.out.println(true&&true);//두 값 모두 true일때 결과가 true
		System.out.println(true&&false);
		System.out.println(false&&false);
		System.out.println(false&&true);
		
		
		//논리합 0+0일때만, 0이라는 값이 나옴 / 또는
 		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||false);
		System.out.println(false||true);
		
		System.out.println();
		System.out.println(!true);
		System.out.println(!false);
		
		
		/* 예제
		 * 성적 계산 프로그램을 개발하세요
		 * 국어 성적은 0-100점 사이입니다.
		 * 국어 성적을 입력 받아 적절한 학점으로 변환해주세요.
		 */
		
		//Scanner 기능 꾸러미: 입력을 위한 여러가지 기능을 갖고 있음
		//기능 꾸러미를 사용하려면 구체화를 시켜야함.
		Scanner scanf=new Scanner(System.in);
		System.out.print("국어점수 입력:");
		//객체가 제공하는 기능을 메서드라고 부름. scanf 객체가 제공하는 메서드 중 하나
		//nextInt 메서드: 입력한 값을 정수로 가져오는 기능
		int score=scanf.nextInt();
		
		boolean right=score>=0 && score<=100;
		System.out.println(right);
//		if (score<0 || score>100) {
//			System.out.println("0-100점 사이만 가능합니다.");
//		} else {
//			System.out.println("점수="+score);
//		}
		
		scanf.close();
		
		
		
	}

}
