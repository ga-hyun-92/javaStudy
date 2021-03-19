package chapter2;

import java.util.Arrays;

public class Ex19 {

	public static void main(String[] args) {
		int num1=10;
		
		int[] arr1=new int[2];
		arr1[0]=num1;//num1의 값을 복사해서 저장한다.
		
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));
		
		//num1값 변경
		num1++;
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));//arr1 0번 인덱스 값은 변하지 않는다.
		
		System.out.println("========== ========");
		
		Student student =new Student();
		student.name="김철수";
		
		Student[] studentList=new Student[2];
		studentList[0]=student;
		
		System.out.println(student.name);
		System.out.println(studentList[0].name);
		
		//이름 변경
		student.name="고영희";
		System.out.println(student.name);
		System.out.println(studentList[0].name);//메모리 주소를 복사해서 저장하는거라서 같인 바뀐다.
		
	}

}
