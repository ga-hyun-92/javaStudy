package chapter10;
//매개변수 없고 반환값 있는 메서드
public class Ex7 {
	//int -> add  메서드가 동작하고 나서 만들어 내는 결과값이 정수 타입이라는 것
	//add -> 메서드의 이름
	//() -> 매개변수가 필요 없는 메서드
	//반환타입
	//정수:byte,short,int,long
	//실수:float,double
	//문자:char
	//문자열:String
	//인스턴스: 인스턴스에 맞는 클래스명
	//반환값이 있으면 return키워드가 포함된다.
	int add() {
		int result =1+1;
		
		return result;
		}
	
	//36%5의 결과를 실수값으로 반환하는 div메서드 선언
	double div() {
		
		double result=36%5;
		return result;
	}
	
	int stackAdd() {
		int sum=0;
		for (int i = 1; i <= 5; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Ex7 ex7=new Ex7();
		
		int result=ex7.add();
		System.out.println(result);
		System.out.println(ex7.add());
		
		double result2=ex7.div();
		System.out.println(result2);

		int result3=ex7.stackAdd();
		System.out.println(result3);
	}

}
//1.매개변수 없고 반환값이 없는 메서드
//2.매개변수가 있고 반환값이 있는 메서드
//3.매개변수가 없고 반환값이 있는 메서드
