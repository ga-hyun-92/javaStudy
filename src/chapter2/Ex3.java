package chapter2;

import java.util.Arrays;
//Arrays�� �迭���õ� ��ɲٷ���

public class Ex3 {

	public static void main(String[] args) {
		//�迭�� ������� �����Ͱ� ����ǰ� �ߺ��� �����͵� ���尡��
		int[] korArr =new int[] {84,93,52,42};
		System.out.println(korArr);
		System.out.println(Arrays.toString(korArr));
		
		int[] korArr1=new int[4];
		korArr1[0]=84;
		korArr1[1]=93;
		korArr1[2]=52;
		korArr1[3]=42;
		System.out.println(Arrays.toString(korArr1));
		
		double[] avgArr= {67,81.3,54.67,64.67};
		System.out.println(Arrays.toString(avgArr));
		double[] avgArr1=new double[4];
		avgArr1[0]=67;
		avgArr1[1]=81.3;
		avgArr1[2]=54.67;
		avgArr1[3]=64.67;
		System.out.println(Arrays.toString(avgArr1));
		
		
		char[] gradeArr= {'B','A','C','B'};
		System.out.println(Arrays.toString(gradeArr));
		char[] gradeArr1=new char[4];
		gradeArr1[0]='B';
		gradeArr1[1]='A';
		gradeArr1[2]='C';
		gradeArr1[3]='B';
		
		
		
		
		
		
		
		
		

	}

}
