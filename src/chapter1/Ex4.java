package chapter1;

public class Ex4 {

	public static void main(String[] args) {
		/*��Ʈ-����뷮�� �ּҴ���: 0�Ǵ� 1�� �����Ҽ� �ִ�.
		 * 2bit�� 00,01,10,11�� �ϳ��� �����Ҽ� �ִ�.
		 * ��,�����Ҽ� �ִ� �����ʹ� 4����-0,1,2,3
		 * 
		 * ����Ʈ(byte)
		 * 8bit�� �� ������ ǥ��ȭ�� �뷮 ����
		 * 1byte(8bit)���� -128~127 �� �ϳ��� ������ �� �ִ�.
		 * �����Ҽ� �ִ� ������ 256
		 * 
		 * int 
		 * integer�� ����
		 * �޸� ����: 4Byte
		 * -2^31~ +2^31-1
		 * 
		 * byte-1byte
		 * short-2byte
		 * int -4byte
		 * long-8byte
		 */
		
		//���� : ������ Ÿ��-������ ����
		byte number=127;
		short number1=-129;
		int number2=32768;
		
		int num=704;
		int temp=num;
		
		temp=59;
		System.out.println(temp);
		
		/*double
		 * �Ǽ���
		 * ����,0,����� ������ �ִ�
		 * 8Byte
		 * 
		 * float
		 * �Ǽ���
		 * 4Byte
		 * IEEE754�����ϸ� �Ǽ��� ���� ���� �ڼ��� ����
		 * ����>���ɺ�ȯ
		 */
		
		double fnum=70.4;
		float fnum1=1.2345f;
		double d_value=3.14;
		d_value=7.81;
		
		int num4=704;
		long num5=704L; //LongŸ������ �����Ϸ��� ���ڵڿ� L�� ���δ�.
		
		/* char
		 * ���ڸ� ������ �ִ�.
		 * ����,�ѱ�,������,Ư������ ��
		 * 
		 * String
		 * ���ڵ��� ������ �ִ�.
		 * ���ڿ�
		 */
		
		char monja1='a'; //����ɶ��� 97�� ��ȯ�ؼ� �����ϰ� �ִ� ��. ����Ҷ���  a�� ���
		System.out.println(monja1);
		
		char monja2=65;
		System.out.println(monja2); //65�� ��µǴ°� �ƴ϶�, A�� ��µ�(�ƽ�Ű�ڵ� ����)
		
//		String var1="ABCDE";
//		String var2="�ȳ��ϼ���";
//		
//		System.out.println(var1);
//		System.out.println(var2);
		
		char var1='A';
		char var4='1';
		char var5=1;
		System.out.println(var4);//����1�� 1�� ��µ�
		System.out.println(var4-1);//����1�� �ƽ�Ű�ڵ忡 ���ؼ� 49�� ����Ǿ� ����.
		System.out.println(var5-1);
		
		String var2="�ڸ���IT��ī����";
		String var6=new String("�ڸ���IT��ī����");
		String var3="2021-3-16";
		System.out.println(var3);
		

		/*boolean
		 * ��,������ ����
		 * �ַ� ���ǹ�,�ݺ������� ���
		 */
		boolean bool = true;
		System.out.println(bool);
		
		bool=false;
		System.out.println(bool);
		
//		����: byte,short,int,long
//		�Ǽ�: float, double
//		����: char
//		���ڿ�: String
//		����: boolean
		
//		�⺻ ������Ÿ�� VS ����� ���� ������Ÿ��
//		�⺻ ������Ÿ�� - �ڹ� �����ڰ� ������� �������� ���� (������ ���ڿ�(String)�� �� 8���� �⺻Ÿ��)
//		����� ���� ������Ÿ�� - �츮���� �����ڰ� �ʿ信 ���ؼ� ���� ������ Ÿ��( String )
		
//		�⺻ ������Ÿ���� ���� �����ڸ��� ����ؼ� �����͸� ������ �� �ִ�.
//		����� ���� ������Ÿ���� ���� �����ڿ� new�����ڸ� ����ؾ� �����͸� ������ �� �ִ�.
//		String var2="�ڸ���IT��ī����";
//		String var6=new String("�ڸ���IT��ī����");

	}

}
