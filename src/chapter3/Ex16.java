package chapter3;

public class Ex16 {

	public static void main(String[] args) {
		// n!�� �ݺ����� ����ؼ� ���ϼ���
		//n���� 1���� �ϳ��� �����ϸ鼭 ������ ������Ű�� �ݺ���.
		int n=5;
		int sum=1;
		System.out.println(n+"!= ");
	    for (int i = n; i >= 1; i--) {
			sum*=i;
			if (i==1) {
				System.out.print(i);
			} else {
			System.out.print(i+"*");
			}
		}
	    System.out.println();
	    System.out.println("������ ���="+sum);
	    
	    
	    //����
	    //1���� 10���� �����ϴ� �ϳ��� for������ Ȧ��, ¦���� ���� ���ϼ���.
	    int sum1=0;
	    int sum2=0;
	    for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				sum2 +=i;
			} else {
				sum1 +=i;
			}
			
			System.out.println("Ȧ���� ��="+sum1);
			System.out.println("¦���� ��="+sum2);
			
		}

	}

}
