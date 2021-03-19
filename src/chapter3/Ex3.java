package chapter3;

import java.util.Scanner;

public class Ex3 {
	
	static final int now_year=2021;
	static final int WEEK=7;

	public static void main(String[] args) {
	//else if문-예제1	
		int num=1;
		
		if (num==1) {
			System.out.println("1입니다");
		} else if(num==2){
			System.out.println("2입니다");
		} else if (num==3) {
			System.out.println("3입니다");
		} else if (num==4) {
			System.out.println("4입니다");
		}
		
		
	//else if문-예제2	
		int birth_year=1992;
		int age=Ex3.now_year -birth_year;
		
		if (age>=1&&age<=7) {
			System.out.println("미취학 유아동입니다.");
		} else if (age>=8&&age<=13) {
			System.out.println("초등학생입니다");
		} else if(age>=14&&age<=16){
			System.out.println("중학생입니다.");
		} else if (age>=17&& age<=19) {
			System.out.println("고등학생입니다.");
		} else if (age>=20) {
			System.out.println("성인입니다.");
		}
		
	//else if문-예제3	
		System.out.print("2021년 3월의 날짜: ");
		Scanner scanf=new Scanner(System.in);
		//사용자가 입력한 값을 정수로 받아온다.
		int dayOfMonth=scanf.nextInt();
		int date=dayOfMonth%Ex3.WEEK;
		
		System.out.print("3월"+dayOfMonth+"일은 ");
		if (date==1) {
			System.out.println("월요일입니다.");
		} else if(date==2){
			System.out.println("화요일입니다.");
		} else if (date==3) {
			System.out.println("수요일입니다.");
		} else if (date==4) {
			System.out.println("목요일입니다.");
		} else if (date==5) {
			System.out.println("금요일입니다.");
		} else if (date==6) {
			System.out.println("토요일입니다.");
		} else {
			System.out.println("일요일입니다.");
		}

	}

}
