package chapter11;
//����������
//public:��� Ŭ�������� ��밡��
//default:���� ��Ű�� �� Ŭ���������� ��� ����
//protected: ���� ��Ű�� �Ǵ� �ڽ� Ŭ������ ��� ����
//private: ���� �ڽŸ� ��� ����

//�ַ� default,private�� ����Ѵ�.
//��ü �ȿ� �ִ� �����͸� �Ժη� �ٲ��� �ʰ� �Ϸ���...������ ��ȣ

public class SimpleType {
//	static int num1=10;
//	
//	static void hello() {
//		System.out.println("Hello World");
//	}
	
	public int num1;
	int num2;//���� �����ڸ� �Ⱦ��� �ڵ����� default ���������ڷ� ������
	private int num3;
	
	public void func1() {
		System.out.println("func1");
	}
	
	void func2() {
		System.out.println("func2");
	}
	
	private void func3() {
		System.out.println("func3");
	}
}
