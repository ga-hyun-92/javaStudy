package chapter1;

public class Ex6 {

	public static void main(String[] args) {
		// ������-���,����,����,��,��,����
				System.out.println(3+10);
				System.out.println(3-10);
				System.out.println(3*10);
				System.out.println(3/10.0); //���� �ϳ��� �Ǽ����� ������� �Ǽ��� ����
				System.out.println(3/10);//������ ������ ����ϸ� ������ ����� �����Ե� �׷��� 0���� ��µ�
				System.out.println(3%10); //mod������ ������
				
				// ����
				// ö���� ������ �հ�
				int sum=74+85+98;
				
				//���迡 ������ ������ ��;
				int subject=3;
				
				// ö���� ���
				double avg=sum/(double)subject; //  �̷��� ���ϸ� ����� ���� �ٸ��� ����
				
				System.out.println("ö���� ����="+sum);
				System.out.println("ö���� ���="+avg);
				
				//mod���� - ��¥ ����Ҷ� ��¥�� 7�� ������ ������ �� �� ����
				System.out.println(0%3);
				System.out.println(1%3);
				System.out.println(2%3);
				System.out.println(3%3);
				System.out.println(4%3);
				System.out.println(5%3);
				System.out.println(6%3);
				
				int addResult=1+1;
				System.out.println(addResult);
				
				double divResult=10.0/3.0;
				System.out.println(divResult);
				
				int mon='0'+'1';
				System.out.println("����0�� 1�� ��="+mon); //�ƽ�Ű�ڵ忡 ���ؼ� 48+49�� ������� ��µȴ�.
				
				int num_1=31;
				num_1=num_1+1;
				System.out.println(num_1);
				
				int sum1=0;
				for (int i = 1; i <= 10; i++) {
					sum1+=i;
				}
				System.out.println(sum1);

	}

}
