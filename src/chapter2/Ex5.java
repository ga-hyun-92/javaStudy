package chapter2;

import java.util.Arrays;

public class Ex5 {

	public static void main(String[] args) {
		int[] arr1=new int[1];
		arr1[0]=12;
		System.out.println(Arrays.toString(arr1));
		
		double[] arr2=new double[7];
		arr2[0]=0.7;
		arr2[1]=0.6;
		arr2[2]=0.5;
		arr2[3]=0.4;
		arr2[4]=0.3;
		arr2[5]=0.2;
		arr2[6]=0.1;
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2[6]);
		
		char[] arr3=new char[2];
		arr3[0]='a';
		arr3[1]='b';
		System.out.println(Arrays.toString(arr3));
	}

}
