package chapter3;

public class Ex8 {

	public static void main(String[] args) {
		//어떤 수가 짝수일 경우 "짝수를",홀수 일 경우 "홀수"를 화면에 출력
		int num=23;
		num=num%2;
		
		switch (num) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
			break;
//		default:
//			break;
		}
		
		
		//2021년 3월의 특정 날짜에 해당하는 요일을 화면에 출력하세요.
		int date=21;
		date=date%7;
		
		switch (date) {
		case 0:System.out.println("일요일입니다."); break;
		case 1:System.out.println("월요일입니다."); break;
		case 2:System.out.println("화요일입니다."); break;
		case 3:System.out.println("수요일입니다."); break;
		case 4:System.out.println("목요일입니다."); break;
		case 5:System.out.println("금요일입니다."); break;
		default: System.out.println("토요일입니다.");
		}

	}

}
