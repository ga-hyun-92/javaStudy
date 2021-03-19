package chapter2;

//연산자 심화
public class Ex21 {

	public static void main(String[] args) {
		Numbers numbers=new Numbers();
		
		//1,000,000(1백만)
		numbers.num1=1_000_000;
		numbers.num2=numbers.num1;
		
		//1백만*1백만=1,000,000,000,000(1조??)
//		int var=numbers.num1*numbers.num2;//결괏값 1조가 소실되는 현상이 발생=오버플로우
		long var=(long)numbers.num1*numbers.num2;

		System.out.println(var);
		
		double pi=3.141592;
		
		//소수점 3째 자리까지 출력
		double pi_1=(int)(pi*1000)/1000.0;
		System.out.println(pi_1);
		
		//소수점 3째 자리에서 반올림 후 출력(2째 자리까지 출력)
		double pi_2=(int)(pi*100+0.5)/100.0;
		System.out.println(pi_2);
		

	}

}
