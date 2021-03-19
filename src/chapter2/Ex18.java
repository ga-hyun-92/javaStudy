package chapter2;

public class Ex18 {

	public static void main(String[] args) {
		Student[] studentList =new Student[5];
		
		Student student1=new Student();
		student1.name="고영희";
		student1.addr="부산광역시 부산진구 중앙대로";
		
		Student student2=new Student();
		student2.name="이철수";
		student2.addr="부산광역시 남구 전포대로";
		
		
		studentList[0]=new Student();
		studentList[1]=student1;
		studentList[2]=new Student();
		studentList[3]=student2;
		studentList[4]=new Student();
		
//		studentList[0].name="이철수";
		
		//철수가 이사해서 주소가 바뀌었다.
		System.out.println("이사전: "+studentList[3].addr);
		
		studentList[3].addr="부산광역시 부산진구 범천동";
		System.out.println("이사후: "+studentList[3].addr);
		System.out.println("이사후: "+student2.addr);//같은 주소를 가리키고 있기 때문에 같이 바뀜
		

	}

}
