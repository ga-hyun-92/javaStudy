package chapter2;

public class Ex9 {

	public static void main(String[] args) {
		int[][] student= {
				{84,62,55},
				{93,71,80},
				{52,79,33},
				{42,100,52}};

		System.out.println(student[0][0]);
		System.out.println(student[0][1]);
		System.out.println(student[0][2]);
		
		//행번호만 사용했을때 적절한 타입의 변수에 저장하세요.
		int[] student1=student[0];//student의 1행에 해당하는 변수들을 저장
		System.out.println(student1[0]);
		System.out.println(student1[1]);
		System.out.println(student1[2]);
		
		int[] student2=student[1];
		
		int[][] studentInfo=new int[3][];
		studentInfo[0]=new int[3];//열은 나중에 공간을 할당하는 방법
		studentInfo[1]=new int[5];
		studentInfo[2]=new int[1];
		

	}

}
