package chapter2;

//������ ��ȭ
public class Ex21 {

	public static void main(String[] args) {
		Numbers numbers=new Numbers();
		
		//1,000,000(1�鸸)
		numbers.num1=1_000_000;
		numbers.num2=numbers.num1;
		
		//1�鸸*1�鸸=1,000,000,000,000(1��??)
//		int var=numbers.num1*numbers.num2;//�ᱣ�� 1���� �ҽǵǴ� ������ �߻�=�����÷ο�
		long var=(long)numbers.num1*numbers.num2;

		System.out.println(var);
		
		double pi=3.141592;
		
		//�Ҽ��� 3° �ڸ����� ���
		double pi_1=(int)(pi*1000)/1000.0;
		System.out.println(pi_1);
		
		//�Ҽ��� 3° �ڸ����� �ݿø� �� ���(2° �ڸ����� ���)
		double pi_2=(int)(pi*100+0.5)/100.0;
		System.out.println(pi_2);
		

	}

}
