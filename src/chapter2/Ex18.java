package chapter2;

public class Ex18 {

	public static void main(String[] args) {
		Student[] studentList =new Student[5];
		
		Student student1=new Student();
		student1.name="����";
		student1.addr="�λ걤���� �λ����� �߾Ӵ��";
		
		Student student2=new Student();
		student2.name="��ö��";
		student2.addr="�λ걤���� ���� �������";
		
		
		studentList[0]=new Student();
		studentList[1]=student1;
		studentList[2]=new Student();
		studentList[3]=student2;
		studentList[4]=new Student();
		
//		studentList[0].name="��ö��";
		
		//ö���� �̻��ؼ� �ּҰ� �ٲ����.
		System.out.println("�̻���: "+studentList[3].addr);
		
		studentList[3].addr="�λ걤���� �λ����� ��õ��";
		System.out.println("�̻���: "+studentList[3].addr);
		System.out.println("�̻���: "+student2.addr);//���� �ּҸ� ����Ű�� �ֱ� ������ ���� �ٲ�
		

	}

}
