package chapter2;

import java.util.Arrays;

public class Ex7 {

	public static void main(String[] args) {
		//예제2-인덱싱예제
		int[] numArr= {2,4,6,8};
				
		int num=numArr[2];
		System.out.println("numArr[2]="+num);
				
		//예제3-인덱싱예제
		char[] charArr= {'Z','Y'};
		char monja=charArr[0];
		System.out.println("charArr[0]="+monja);
		
		int[] arr1;
		arr1=new int[2];
		//할당은 안했지만, 기본값이 저장됨
		System.out.println(arr1[0]);//정수의 기본값은 '0',실수의 기본값: 0.0
		System.out.println(arr1[1]);
		
		char[] arr=new char[2];
		System.out.println(arr[0]);//문자의 기본값: \0
		System.out.println(arr[1]);
	    System.out.println(Arrays.toString(arr));

	}
}
