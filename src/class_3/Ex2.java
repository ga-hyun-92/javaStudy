package class_3;

public class Ex2 {

	public static void main(String[] args) {
		// 비교연산 실습1
		System.out.println(10==10);
		System.out.println(24!=10);
		System.out.println(17>32);
		System.out.println(17>=17);
		System.out.println(17<32);
		System.out.println(17<=17);
		
		// 비교연산 실습2
		char mon1='a';//아스키코드표 97
		char mon2='a';
		
		System.out.println(mon1==mon2);
		System.out.println(mon1!=mon2);
		System.out.println(mon1>mon2);
		System.out.println(mon1>=mon2);
		System.out.println(mon1<mon2);
		System.out.println(mon1<=mon2);

		char mon3='b';//아스키코드표 98
		System.out.println(mon1<mon3);
		
		System.out.println();
		
		String monja1="apple"; 
		String monja2="banana";
		//문자열은 기본데이터 타입이 아님. 문자열이 저장된 메모리 주소를 가지고 있음
		//그러므로 문자열 비교연산은 (메모리 주소가)같나,다른가 2가만 가능함
		System.out.println(monja1==monja2);
		System.out.println(monja1!=monja2);
		
		System.out.println();
		//비교연산 실습3
		int num1=27;
		
		System.out.println(num1 != 10);
		System.out.println(num1 != 5);
		
		System.out.println(num1>=27);
		System.out.println(num1<=27);
		
		System.out.println(num1<=30);
		System.out.println(num1<=27);
	}

}
