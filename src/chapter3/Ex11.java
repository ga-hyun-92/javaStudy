package chapter3;
//반복문
//while(조건식)=>조건식은 논리형으로
//조건이 참일 경우에만 반복적으로 실행된다.
public class Ex11 {

	public static void main(String[] args) {
		/*
		// i가 0부터
		int i=0;
		
		//9이하일 동안
		while (i<=9) {
			System.out.println(i);
			
			//하나씩 증가하면서
			i=i+1;
			
		}//end while
		
		System.out.println("==================");
		
		//1부터 10까지 출력하는데 짝수만 출력(while, if문 사용해서)
		int j=1;
		while (j<=10) {
			if (j%2==0) {
				System.out.println(j);
			}
			
			//하나씩 증가하면서
			j=j+1;
		}
		
		System.out.println("==================");

		//1부터 10까지 출력하는데 짝수만 출력(while문 사용해서)
		int k=2;
		while (k<=10) {
			System.out.println(k);
			k=k+2;
		}
		
		
		int i=10;
		while (i>=1) {
			System.out.println(i);
			i=i-1;
		}
		*/
		
		//10부터 1까지 출력을 하는데 홀수만 출력되도록 하세요.
		//while문과 if문 사용해서
		int j=10;
		while (j>=1) {
			if(j%2==1) {
				System.out.println(j);
			}			
			j=j-1;
		}
		
		System.out.println("==================");

		//while만 사용해서
		int i=9;
		while (i>=1) {
			System.out.println(i);
			i=i-2;
		}
		
	}//end main
}//end class
