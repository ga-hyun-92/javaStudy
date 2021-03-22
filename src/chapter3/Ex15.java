package chapter3;
//for반복문 for(초기식; 조건식; 증감식)
public class Ex15 {

	public static void main(String[] args) {
		int sum=0;
		
		//for문의 초기식 자리에 선언한 변수는 for문에서만 사용할 수 있다.
		//실행 순서: 초기식-> 조건식 -> 증감식 -> 조건식 -> 증감식 -> 조건식...
		for (int i = 1; i <= 10; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		//1-10까지 홀수의 합을 구하시오.
		sum=0;
		for (int i = 0; i <= 10; i++) {
			if (i%2==1) {
				sum+=i;
			}//end if
			
		}//end for
		System.out.println(sum);
		
		//1-10까지 짝수의 합을 구하시오.
		//1) for문과 if문을 사용해서
		sum=0;
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				sum+=i;
			}//end if
			
		}//end for
		System.out.println(sum);

		//2) for문만을 사용해서
		sum=0;
		for (int i = 0; i <= 10; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
