package chapter3;

public class Ex12 {

	public static void main(String[] args) {
		System.out.println("구구단 2단..");
		
		
		//구구단2-5단까지 출력하는 코드를 반복문을 사용해서 최적화시키세요.
		int j=2;
		while (j<=5) {
			
			int i=1;
			while (i<10) {
				System.out.println(j+"*"+i+"= "+(j*i));
				i+=1;
			}//end while i
			System.out.println("==========");
			j+=1;
			
		}//end while j
		
//		int i=1;
//		while (i<10) {
//			System.out.println("2*"+i+"= "+(2*i));
////			i=i+1;
//			i+=1;
//		}
//		
//		3단 출력
//		i=1;
//		while (i<10) {
//			System.out.println("3*"+i+"= "+(3*i));
//			i+=1;
//		}
//		
//		4단 출력
//		i=1;
//		while (i<10) {
//			System.out.println("4*"+i+"= "+(4*i));
//			i+=1;
//		}
//		
//		5단 출력
//		i=1;
//		while (i<10) {
//			System.out.println("5*"+i+"= "+(5*i));
//			i+=1;
//		}

	}

}
