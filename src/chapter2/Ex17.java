package chapter2;

public class Ex17 {

	public static void main(String[] args) {
		final int num1=10;
////		num1=10;//변경 불가능한 final변수이므로 컴파일 오류
//		
//		SimpleType1 type1=new SimpleType1();
//		type1.num2=10;
//		
//		SimpleType1.num2=20;
//		SimpleType1.num3=30;//변경 불가능한 클래스 멤버 변수
	
		Student student1=new Student();
		student1.kor=56;
		student1.eng=41;
		student1.mat=88;
		
		student1.sum=student1.kor+student1.eng+student1.mat;
		student1.avg=(int)((student1.sum/(double)Student.AMOUNT_Of_SUBJECT)*10)/10.0;
		
		System.out.println("철수의 총점="+student1.sum);
		System.out.println("철수의 평균="+student1.avg);

	}

}
