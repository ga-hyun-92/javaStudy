package chapter10;

public class Ex9 {
	//�̸��� ������ �Ű������� �ٸ� �޼������ "�����ε�"�� �޼����� ��
	//�� ������ ���� ����� ��ȯ�ϴ� �޼���
	int add(int num1,int num2) {
		return num1+num2;
	}
	
	//�� �Ǽ��� ���� ����� ��ȯ�ϴ� �޼���
	double add(double fnum1,double fnum2) {
		return fnum1+fnum2;
	}
	
	//�ϳ��� ������ �ϳ��� �Ǽ��� ���� ����� ��ȯ�ϴ� �޼���
	double add(double fnum1,int num2) {
		return fnum1+num2;
	}
	
	
	int num1;
	
	static int num2;
	
	void instanceMemberMethod() {
		System.out.println("�ν��Ͻ� ��� �޼���");
	}
	
	static void classMemberMethod() {
		System.out.println("Ŭ���� ��� �޼���");
	}
	
	//main�� Ŭ���� ��� �޼����̴�.
	public static void main(String[] args) {
		Ex9 ex9=new Ex9();
		ex9.add(1, 1);
		ex9.add(1.0, 1.0);
		ex9.add(1.0, 1);
		
		ex9.instanceMemberMethod();
		Ex9.classMemberMethod();
     
	}

}
