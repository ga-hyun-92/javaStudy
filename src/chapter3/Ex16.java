package chapter3;

public class Ex16 {

	public static void main(String[] args) {
		// n!을 반복문을 사용해서 구하세요
		//n부터 1까지 하나씩 감소하면서 곱셈을 누적시키는 반복문.
		int n=5;
		int sum=1;
		System.out.println(n+"!= ");
	    for (int i = n; i >= 1; i--) {
			sum*=i;
			if (i==1) {
				System.out.print(i);
			} else {
			System.out.print(i+"*");
			}
		}
	    System.out.println();
	    System.out.println("순차곱 결과="+sum);
	    
	    
	    //예제
	    //1부터 10까지 증가하는 하나의 for문에서 홀수, 짝수의 합을 구하세요.
	    int sum1=0;
	    int sum2=0;
	    for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				sum2 +=i;
			} else {
				sum1 +=i;
			}
			
			System.out.println("홀수의 합="+sum1);
			System.out.println("짝수의 합="+sum2);
			
		}

	}

}
