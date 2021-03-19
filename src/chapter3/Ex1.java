package chapter3;

public class Ex1 {

	public static void main(String[] args) {
				//예제1-조건문 if-else문
				System.out.println("코드시작");
				
				if (false) {
					System.out.println("이 if문은");
					System.out.println("참이므로");
					System.out.println("코드가 실행됩니다");
				}  else {
					System.out.println("이 if문은");
					System.out.println("거짓이므로");
					System.out.println("코드가 실행되지않습니다");
				}
				
				System.out.println("코드끝");
				
				
				//예제2-조건문 if-else문
				int score=59;
				if (score>=60) {
					System.out.println("통과");
				} else {
					System.out.println("재시험");
				}
				
				//예제3-조건문 if-else 문
				
				System.out.println("코드 시작");
				int num=0;
				if (num==0) {
					System.out.println("변수num에 들어있는 값은 0입니다.");
				} else {
					System.out.println("변수num에 들어있는 값은 0이 아닙니다");
				}
				
				System.out.println("코드끝");
	}

}
