package chapter2;

import java.util.Arrays;

public class Ex6 {

	public static void main(String[] args) {
		int[] korArr =new int[4];
		korArr[0]=84;
		korArr[1]=93;
		korArr[2]=52;
		korArr[3]=42;
		
		korArr[1]=75;
		System.out.println(Arrays.toString(korArr));

		//예제1-인덱싱예제<데이터를 한칸씩 뒤로 미루기>
		double[] avgArr =new double[4];
		avgArr[0]=67;
		avgArr[1]=81.3;
		avgArr[2]=54.67;
		avgArr[3]=64.67;
		
		System.out.println(Arrays.toString(avgArr));
		
		avgArr[3]=avgArr[2];
		avgArr[2]=avgArr[1];
		avgArr[1]=avgArr[0];
		avgArr[0]=78.99;
		System.out.println(Arrays.toString(avgArr));
		
		
		
	}

}
