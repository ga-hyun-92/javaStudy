package class_3;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		System.out.print("시력: ");
		
		//시력은 0.0~2.0까지 있습니다.
		//sight변수에 시력을 저장하고 시력이 0.0~2.0사이인지 확인하세요.
		
		double sight=scanf.nextDouble();
		 
		// &&사용
		boolean right=sight>=0.0 && sight<=2.0;
		System.out.println(right);
		
		// ||사용
		boolean right2= !(sight<0.0 || sight>2.0);
		System.out.println(right2);
//		boolean result1=sight<0.0;
//		boolean result2=sight>2.0;
//		boolean result =result1 || result2;
//		System.out.println(!result);
	}

}
