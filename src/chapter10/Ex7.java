package chapter10;
//�Ű����� ���� ��ȯ�� �ִ� �޼���
public class Ex7 {
	//int -> add  �޼��尡 �����ϰ� ���� ����� ���� ������� ���� Ÿ���̶�� ��
	//add -> �޼����� �̸�
	//() -> �Ű������� �ʿ� ���� �޼���
	//��ȯŸ��
	//����:byte,short,int,long
	//�Ǽ�:float,double
	//����:char
	//���ڿ�:String
	//�ν��Ͻ�: �ν��Ͻ��� �´� Ŭ������
	//��ȯ���� ������ returnŰ���尡 ���Եȴ�.
	int add() {
		int result =1+1;
		
		return result;
		}
	
	//36%5�� ����� �Ǽ������� ��ȯ�ϴ� div�޼��� ����
	double div() {
		
		double result=36%5;
		return result;
	}
	
	int stackAdd() {
		int sum=0;
		for (int i = 1; i <= 5; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Ex7 ex7=new Ex7();
		
		int result=ex7.add();
		System.out.println(result);
		System.out.println(ex7.add());
		
		double result2=ex7.div();
		System.out.println(result2);

		int result3=ex7.stackAdd();
		System.out.println(result3);
	}

}
//1.�Ű����� ���� ��ȯ���� ���� �޼���
//2.�Ű������� �ְ� ��ȯ���� �ִ� �޼���
//3.�Ű������� ���� ��ȯ���� �ִ� �޼���
