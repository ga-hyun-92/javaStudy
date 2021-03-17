package chapter1;

public class Ex3 {

	public static void main(String[] args) {
//		자료형 변수명;
//		변수명=저장할 값; // '='은 대입연산자
		/*문자(char): A-Z,a-z,0-9,일부 특수문자
		 *정수(int)
		 *실수(double) 
		 *논리(boolean)
		 */
		char value='A';
		System.out.println(value);

		int number=10;
//		int number;
//		number =10;
		System.out.println(number);
		
		double data=-17.1;
//		double data;
//		data =-17.1;
		System.out.println(data);

		boolean val1=true;
//		boolean val1;
//		val1=true;
		System.out.println(val1);
		
		//출력 대상을 출력하는 기능
		//출력 대상은 값만 가능하다.
		System.out.println();
		
		
//		실습예제1
		double num1=3.14;
		
		char num2='z';
		
		boolean num3=false;
		
		int num4=100;
		
		//변수명은 영문자,숫자 특수문자($와 _(언더바))만 사용할수 있다.
		//변수명은 한글도 되기는 하지만 권장하지는 않음
		int word;
		int word1;
		int word$;
		int word_;
		
		//변수명의 시작은 영문자,특수문자만 가능하다.
		int _word;
		int $word;
//		int 1word; 이렇게 숫자로 시작하면 오류가 뜸
		
		//변수명은 영문 대소문자를 구분한다
		int apple=17;
		int Apple=27;
		
		System.out.println(apple);
		System.out.println(Apple);
		
		//변수명은 키워드를 사용할수 없음
		//키워드-영단어이기는 하지만 자바가 미리 선정한 영단어
//		int double=17; //오류뜸
		
		//변수는 중복해서 선언할 수 없다.
		int apple1 =17; //int apple=17; 오류뜸

		//카멜표기법(낙타표기법)
		int myAge;//단어가 바뀔때, 대문자로 시작하게 함.
		char myGrade;

	}

}
