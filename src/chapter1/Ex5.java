package chapter1;

public class Ex5 {

	public static void main(String[] args) {
		// 변수-형 변환
				// 형변환타입 변수B = (형변환타입)변수A;
				// 형변환은 다형성에 유용하게 쓰임.
				int num1=20;
				double num2=17.3149;
				
				System.out.println((double)num1);
				System.out.println((int)num2);
				
				double num3=(double)num1;
				int num4=(int)num2;
				System.out.println(num3);
				System.out.println(num4);

				
//				예제
				byte value=127;
				System.out.println("value="+(int)value);
				
				int value2=32768;
				System.out.println("value2="+(short)value2);
				
				float value3=95.7f;
				System.out.println("value3="+(double)value3);
				
				double value4=179.8;
				System.out.println("value4="+(float)value4);
				

				//변수-형 변환 업캐스팅 실습
				/* 실수>정수>문자
				 * 
				 */
				char monja='A';
				int num=20;
				
				//문자를 정수로 변환(업캐스팅)
				int num0=monja;
				
				//정수를 실수로 변환(업캐스팅)
				float fNum=num;
				
				//다운캐스팅 : 값이 큰 범위에서 작은 범위로의 형 변환
				double fNum1=17.3149;
				int num_1=(int)fNum1;
				System.out.println(num_1);
				
				char var_1=(char)num;
				System.out.println(var_1);
				
//				예제
				double a=-1.1414;
				int b=(int)a; 
				System.out.println(b); //다운캐스팅, 값의 변경 있음
				
				int c=1;
				double d=(double)c; //정수를 실수로 변환, 업캐스팅-> 괄호 생략 가능
				System.out.println(d);//값의 변경 없음
				
				char e='A';
				int f=(int)e;//문자를 정수로 변환, 업캐스팅-> 괄호 생략 가능
				System.out.println(f);//값의 변경이 있음
				
				int g=100;
				char h=(char)g;//정수를 문자로 변환, 다운캐스팅
				System.out.println(h);//값의 변경이 있음

	}

}
