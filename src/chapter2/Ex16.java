package chapter2;

public class Ex16 {

	public static void main(String[] args) {
		// 변수
		int num1=10;
		num1=20;
		
		int num2=10;
		num2=30;
		
		// 상수 : 변하면 안되는 데이터가 있을 경우 사용 
		// 기준이 되는 값
		// 예시 : 원주율, 특정 시점에 우리나라 땅의 크기(지도앱)
		final int num3=10;// 값을 바꿀수 없는 수=상수

		final double PI=3.14;
		
		num1=num1*num2;
		System.out.println(num2);
		System.out.println(num1);

	}

}
