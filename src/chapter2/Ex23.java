package chapter2;

public class Ex23 {

	public static void main(String[] args) {
		//예제1-조건문 if문
		System.out.println("코드시작");
		
		if (true) {
			System.out.println("이 if문은");
			System.out.println("참이므로");
			System.out.println("코드가 실행됩니다");
		}
		
		if (false) {
			System.out.println("이 if문은");
			System.out.println("참이므로");
			System.out.println("코드가 실행됩니다");
		}
		
		System.out.println("코드끝");
		
		
		//예제2-조건문 if문
		int score=59;
		if (score>=60) {
			System.out.println("통과");
		}
		
		if (score<60) {
			System.out.println("재시험");
		}

	}

}
