package chapter2;

import java.util.Arrays;

public class Ex7 {

	public static void main(String[] args) {
		//����2-�ε��̿���
		int[] numArr= {2,4,6,8};
				
		int num=numArr[2];
		System.out.println("numArr[2]="+num);
				
		//����3-�ε��̿���
		char[] charArr= {'Z','Y'};
		char monja=charArr[0];
		System.out.println("charArr[0]="+monja);
		
		int[] arr1;
		arr1=new int[2];
		//�Ҵ��� ��������, �⺻���� �����
		System.out.println(arr1[0]);//������ �⺻���� '0',�Ǽ��� �⺻��: 0.0
		System.out.println(arr1[1]);
		
		char[] arr=new char[2];
		System.out.println(arr[0]);//������ �⺻��: \0
		System.out.println(arr[1]);
	    System.out.println(Arrays.toString(arr));

	}
}
