package chapter2;

public class Ex14 {

	public static void main(String[] args) {
		 int var1;
		 
		//1. EX11Ÿ���� �ν��Ͻ��� ����
		//2. obj1 ��ü�� ����
		 Ex11 obj1; //obj1�̶�� ����(��ü)���� Ex11Ÿ���� �����͸� �����ҰŴ�. ��, ���� ���� ����
		 obj1=new Ex11(); //������ �����(�ڽ��غ�). ctrlŰ ���� ���·� Ex11������ �ű�� �̵���.
//		 Ex11 obj1=new Ex11();
		 obj1.var1=10;
		 obj1.var2=3.14;
		 obj1.var3='a';
		 obj1.var4="Hello";
		 
		//1. EX12Ÿ���� �ν��Ͻ��� ����
		//2. obj2 ��ü�� ����
		 Ex12 obj2=new Ex12();
		 
		//1. EX13Ÿ���� �ν��Ͻ��� ����
		//2. obj3 ��ü�� ����
		 Ex13 obj3=new Ex13();
		 
		 
		 //����1.Ex13 Ŭ������ �ν��Ͻ��� ����� ex13��ü�� �����ϼ���.
		 Ex13 ex13=new Ex13();
		 
		 //����2.chulsu ��ü�� ����� StudentŬ������ �ν��Ͻ��� �����ϼ���.
		 Student chulsu=new Student();
		 chulsu.name="��ö��";
		 chulsu.age=16;
		 System.out.println(chulsu.name);
		 System.out.println(chulsu.age);
		 
		 //����3.Student Ŭ������ �ν��Ͻ��� ����� student��ü�� �����ϼ���.
		 Student student=new Student();
		 
		 System.out.println(student.name);//������ ���� ���, �⺻���� ��µ�
		 System.out.println(student.age);//�⺻���� ��µ�
		 
		 //Ŭ������� �ϴ� ������ ������ Ÿ�� ����
		 //Ŭ������ ����ؼ� �ν��Ͻ��� ����
		 //�ν��Ͻ� �ȿ� �����͸� ����
		 //����� �����͸� ���
		 
		 //obj2��ü�� 100,50������ �����ϼ���
		 obj2.num1=100;
		 obj2.num2=50;
		 
		 //obj3��ü�� 32,180.6,'A',"����Ű", "�Ｚ"�� �����ϼ���/
		 obj3.num1=32;
		 obj3.num2=180.6;
		 obj3.var1='A';
		 obj3.var2="����Ű";
		 obj3.var3="�Ｚ";
		 
		 System.out.println(obj3.num1);
		 System.out.println(obj3.num2);
		 System.out.println(obj3.var1);
		 System.out.println(obj3.var2);
		 System.out.println(obj3.var3);
	}

}