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
		
		//���ȣ�� ��������� ������ Ÿ���� ������ �����ϼ���.
		int[] student1=student[0];//student�� 1�࿡ �ش��ϴ� �������� ����
		System.out.println(student1[0]);
		System.out.println(student1[1]);
		System.out.println(student1[2]);
		
		int[] student2=student[1];
		
		int[][] studentInfo=new int[3][];
		studentInfo[0]=new int[3];//���� ���߿� ������ �Ҵ��ϴ� ���
		studentInfo[1]=new int[5];
		studentInfo[2]=new int[1];
		

	}

}
