package chapter2;

public class Ex17 {

	public static void main(String[] args) {
		final int num1=10;
////		num1=10;//���� �Ұ����� final�����̹Ƿ� ������ ����
//		
//		SimpleType1 type1=new SimpleType1();
//		type1.num2=10;
//		
//		SimpleType1.num2=20;
//		SimpleType1.num3=30;//���� �Ұ����� Ŭ���� ��� ����
	
		Student student1=new Student();
		student1.kor=56;
		student1.eng=41;
		student1.mat=88;
		
		student1.sum=student1.kor+student1.eng+student1.mat;
		student1.avg=(int)((student1.sum/(double)Student.AMOUNT_Of_SUBJECT)*10)/10.0;
		
		System.out.println("ö���� ����="+student1.sum);
		System.out.println("ö���� ���="+student1.avg);

	}

}
