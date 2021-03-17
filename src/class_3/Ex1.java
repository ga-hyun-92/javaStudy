package class_3;

public class Ex1 {

	public static void main(String[] args) {
		//대입 연산자
		//함축 연산자
		/**
		int num1=10;
		
//		num1=num1+5;
		num1+=5;
		
//		num1=num1-5;
		num1-=5;
		
//		num1=num1*5;
		num1*=5;
		
//		num1=num1/5;
		num1/=5;
		
//		num1=num1%5;
		num1%=5;
		
		
		//증감연산자
		int num2=1;
//		num2=num2+1;
//		num2+=1;
		num2++;
		++num2;
		System.out.println(num2);
		
		int num3=1;
		System.out.println(++num3);//전위
		System.out.println(num3++);//후위
		
		*/
		
		int num1=10;
		System.out.println(num1++);//10으로 출력,11이 됨

		num1=num1+10;//num1은21
		System.out.println(++num1);//22로 출력
		
		num1=num1-7;
		System.out.println(--num1);//14로 출력
		
		num1=num1*2;
		System.out.println(num1--);
		
		double fNum =num1/4.0;
		System.out.println(--fNum);
		
		num1=num1%12;
		System.out.println(++num1);

	}

}
