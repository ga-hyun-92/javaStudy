package chapter3;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//예제1
		Scanner scanf=new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요(0<=x<=100): ");
		int num1=scanf.nextInt();
		
		Scanner scanf2=new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요(0<=x<=100): ");
		int num2=scanf2.nextInt();
		
		if ((num1>=0&&num1<=100)&&(num2>=0&&num2<=100)) {
			if (num1>=num2) {
				System.out.println("max="+num1);
			} else if(num1<num2){
				System.out.println("max="+num2);
			} 
		} else {
			System.out.println("0-100사이 수만 가능합니다.");
		}
		
		//예제1
		Scanner scanf3=new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score=scanf3.nextInt();
		
		if (score>=90) {
			System.out.println("학점: A");
		} else if (score>=80 ) {
			System.out.println("학점: B");
		}else if (score>=70 ){
			System.out.println("학점: C");
		}else if (score>=60 ){
			System.out.println("학점: D");
		}else {
			System.out.println("학점: F");
		}
//		scanf.close();
		
		//예제3
		Scanner scanf4=new Scanner(System.in);
		String a="+";
//		next 메서드=> 사용자가 입력한 값을 문자열로 가져옴
		System.out.println("문자를 입력하세요: ");
		String b=scanf4.next();
		
		if (a==b) {
			System.out.println("a와 b가 같습니다.");
		} else {
			System.out.println("a와 b가 다릅니다.");
		}
		//+라고 입력해도 "다릅니다"라고 출력된다. 왜???? 
		//문자열은 기본데이터 타입이 아니라서, 주소값을 저장한다. 주소가 다르기 때문에 다르다고 나온것
				
		
		if (a.equals(b)) {
			System.out.println("a와 b가 같습니다.");
		} else {
			System.out.println("a와 b가 다릅니다.");
		}
		
		scanf.close();
	}

}
