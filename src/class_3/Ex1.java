package class_3;

public class Ex1 {

	public static void main(String[] args) {
		//���� ������
		//���� ������
		/**
		int num1=10;
		
//		num1=num1+5;
		num1+=5;
		
//		num1=num1-5;
		num1-=5;
		
//		num1=num1*5;
		num1*=5;
		
//		num1=num1/5;
		num1/=5;
		
//		num1=num1%5;
		num1%=5;
		
		
		//����������
		int num2=1;
//		num2=num2+1;
//		num2+=1;
		num2++;
		++num2;
		System.out.println(num2);
		
		int num3=1;
		System.out.println(++num3);//����
		System.out.println(num3++);//����
		
		*/
		
		int num1=10;
		System.out.println(num1++);//10���� ���,11�� ��

		num1=num1+10;//num1��21
		System.out.println(++num1);//22�� ���
		
		num1=num1-7;
		System.out.println(--num1);//14�� ���
		
		num1=num1*2;
		System.out.println(num1--);
		
		double fNum =num1/4.0;
		System.out.println(--fNum);
		
		num1=num1%12;
		System.out.println(++num1);

	}

}
