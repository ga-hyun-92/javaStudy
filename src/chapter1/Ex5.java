package chapter1;

public class Ex5 {

	public static void main(String[] args) {
		// ����-�� ��ȯ
				// ����ȯŸ�� ����B = (����ȯŸ��)����A;
				// ����ȯ�� �������� �����ϰ� ����.
				int num1=20;
				double num2=17.3149;
				
				System.out.println((double)num1);
				System.out.println((int)num2);
				
				double num3=(double)num1;
				int num4=(int)num2;
				System.out.println(num3);
				System.out.println(num4);

				
//				����
				byte value=127;
				System.out.println("value="+(int)value);
				
				int value2=32768;
				System.out.println("value2="+(short)value2);
				
				float value3=95.7f;
				System.out.println("value3="+(double)value3);
				
				double value4=179.8;
				System.out.println("value4="+(float)value4);
				

				//����-�� ��ȯ ��ĳ���� �ǽ�
				/* �Ǽ�>����>����
				 * 
				 */
				char monja='A';
				int num=20;
				
				//���ڸ� ������ ��ȯ(��ĳ����)
				int num0=monja;
				
				//������ �Ǽ��� ��ȯ(��ĳ����)
				float fNum=num;
				
				//�ٿ�ĳ���� : ���� ū �������� ���� �������� �� ��ȯ
				double fNum1=17.3149;
				int num_1=(int)fNum1;
				System.out.println(num_1);
				
				char var_1=(char)num;
				System.out.println(var_1);
				
//				����
				double a=-1.1414;
				int b=(int)a; 
				System.out.println(b); //�ٿ�ĳ����, ���� ���� ����
				
				int c=1;
				double d=(double)c; //������ �Ǽ��� ��ȯ, ��ĳ����-> ��ȣ ���� ����
				System.out.println(d);//���� ���� ����
				
				char e='A';
				int f=(int)e;//���ڸ� ������ ��ȯ, ��ĳ����-> ��ȣ ���� ����
				System.out.println(f);//���� ������ ����
				
				int g=100;
				char h=(char)g;//������ ���ڷ� ��ȯ, �ٿ�ĳ����
				System.out.println(h);//���� ������ ����

	}

}
