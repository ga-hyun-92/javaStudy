package chapter3;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
//		Ex13에서 추가: 매 트랙을 재생할 때마다 다시 처음부터 재생할 지 묻는다.
		
		Scanner scanf=new Scanner(System.in);
		//음악을 다시 듣고 다시 재생할지 여부
		char repeat ='y';
		
		while (true) {
			System.out.println("음악을 재생합니다.");
			
			int i=1;
			while (i<=10) {
				System.out.println(i+"번트랙재생");
				System.out.println("다시 처음부터 재생하시겠습니까?");
				repeat=scanf.next().charAt(0);
				if (repeat =='y') {
					//다시 처음부터 재생
					i=1;
					continue;
				} 
				i+=1;
			
			}//end while
			
		}//end while
	}

}
