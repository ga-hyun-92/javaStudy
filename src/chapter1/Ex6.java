package chapter1;

public class Ex6 {

	public static void main(String[] args) {
		// 연산자-산술,대입,증감,비교,논리,삼항
				System.out.println(3+10);
				System.out.println(3-10);
				System.out.println(3*10);
				System.out.println(3/10.0); //둘중 하나만 실수여도 결과값은 실수로 나옴
				System.out.println(3/10);//정수와 정수를 계산하면 정수로 결과가 나오게됨 그래서 0으로 출력됨
				System.out.println(3%10); //mod연산은 나머지
				
				// 예제
				// 철수의 국영수 합계
				int sum=74+85+98;
				
				//시험에 응시한 과목의 수;
				int subject=3;
				
				// 철수의 평균
				double avg=sum/(double)subject; //  이렇게 안하면 계산이 조금 다르게 나옴
				
				System.out.println("철수의 총점="+sum);
				System.out.println("철수의 평균="+avg);
				
				//mod연산 - 날짜 계산할때 날짜를 7로 나누면 요일을 알 수 있음
				System.out.println(0%3);
				System.out.println(1%3);
				System.out.println(2%3);
				System.out.println(3%3);
				System.out.println(4%3);
				System.out.println(5%3);
				System.out.println(6%3);
				
				int addResult=1+1;
				System.out.println(addResult);
				
				double divResult=10.0/3.0;
				System.out.println(divResult);
				
				int mon='0'+'1';
				System.out.println("문자0과 1의 합="+mon); //아스키코드에 의해서 48+49의 결과값이 출력된다.
				
				int num_1=31;
				num_1=num_1+1;
				System.out.println(num_1);
				
				int sum1=0;
				for (int i = 1; i <= 10; i++) {
					sum1+=i;
				}
				System.out.println(sum1);

	}

}
