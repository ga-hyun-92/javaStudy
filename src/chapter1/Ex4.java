package chapter1;

public class Ex4 {

	public static void main(String[] args) {
		/*비트-저장용량의 최소단위: 0또는 1을 저장할수 있다.
		 * 2bit는 00,01,10,11중 하나를 저장할수 있다.
		 * 즉,저장할수 있는 데이터는 4가지-0,1,2,3
		 * 
		 * 바이트(byte)
		 * 8bit를 한 단위로 표준화한 용량 단위
		 * 1byte(8bit)에는 -128~127 중 하나를 저장할 수 있다.
		 * 저장할수 있는 가짓수 256
		 * 
		 * int 
		 * integer의 약자
		 * 메모리 공간: 4Byte
		 * -2^31~ +2^31-1
		 * 
		 * byte-1byte
		 * short-2byte
		 * int -4byte
		 * long-8byte
		 */
		
		//예제 : 데이터 타입-정수형 예제
		byte number=127;
		short number1=-129;
		int number2=32768;
		
		int num=704;
		int temp=num;
		
		temp=59;
		System.out.println(temp);
		
		/*double
		 * 실수값
		 * 음수,0,양수를 담을수 있다
		 * 8Byte
		 * 
		 * float
		 * 실수값
		 * 4Byte
		 * IEEE754참고하면 실수에 대한 설명 자세히 나옴
		 * 참고>아핀변환
		 */
		
		double fnum=70.4;
		float fnum1=1.2345f;
		double d_value=3.14;
		d_value=7.81;
		
		int num4=704;
		long num5=704L; //Long타입으로 저장하려면 숫자뒤에 L을 붙인다.
		
		/* char
		 * 문자를 담을수 있다.
		 * 숫자,한글,영문자,특수문자 등
		 * 
		 * String
		 * 문자들을 담을수 있다.
		 * 문자열
		 */
		
		char monja1='a'; //저장될때는 97로 변환해서 저장하고 있는 것. 출력할때는  a로 출력
		System.out.println(monja1);
		
		char monja2=65;
		System.out.println(monja2); //65가 출력되는게 아니라, A가 출력됨(아스키코드 참고)
		
//		String var1="ABCDE";
//		String var2="안녕하세요";
//		
//		System.out.println(var1);
//		System.out.println(var2);
		
		char var1='A';
		char var4='1';
		char var5=1;
		System.out.println(var4);//문자1도 1로 출력됨
		System.out.println(var4-1);//문자1은 아스키코드에 의해서 49로 저장되어 있음.
		System.out.println(var5-1);
		
		String var2="코리아IT아카데미";
		String var6=new String("코리아IT아카데미");
		String var3="2021-3-16";
		System.out.println(var3);
		

		/*boolean
		 * 참,거짓인 논리값
		 * 주로 조건문,반복문에서 사용
		 */
		boolean bool = true;
		System.out.println(bool);
		
		bool=false;
		System.out.println(bool);
		
//		정수: byte,short,int,long
//		실수: float, double
//		문자: char
//		문자열: String
//		논리값: boolean
		
//		기본 데이터타입 VS 사용자 정의 데이터타입
//		기본 데이터타입 - 자바 개발자가 만들어준 데이터의 형태 (위에서 문자열(String)을 뺀 8개가 기본타입)
//		사용자 정의 데이터타입 - 우리같은 개발자가 필요에 의해서 만든 데이터 타입( String )
		
//		기본 데이터타입은 대입 연산자만을 사용해서 데이터를 저장할 수 있다.
//		사용자 정의 데이터타입은 대입 연산자와 new연산자를 사용해야 데이터를 저장할 수 있다.
//		String var2="코리아IT아카데미";
//		String var6=new String("코리아IT아카데미");

	}

}
