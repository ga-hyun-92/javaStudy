package chapter3;
//�ݺ���
//while(���ǽ�)=>���ǽ��� ��������
//������ ���� ��쿡�� �ݺ������� ����ȴ�.
public class Ex11 {

	public static void main(String[] args) {
		/*
		// i�� 0����
		int i=0;
		
		//9������ ����
		while (i<=9) {
			System.out.println(i);
			
			//�ϳ��� �����ϸ鼭
			i=i+1;
			
		}//end while
		
		System.out.println("==================");
		
		//1���� 10���� ����ϴµ� ¦���� ���(while, if�� ����ؼ�)
		int j=1;
		while (j<=10) {
			if (j%2==0) {
				System.out.println(j);
			}
			
			//�ϳ��� �����ϸ鼭
			j=j+1;
		}
		
		System.out.println("==================");

		//1���� 10���� ����ϴµ� ¦���� ���(while�� ����ؼ�)
		int k=2;
		while (k<=10) {
			System.out.println(k);
			k=k+2;
		}
		
		
		int i=10;
		while (i>=1) {
			System.out.println(i);
			i=i-1;
		}
		*/
		
		//10���� 1���� ����� �ϴµ� Ȧ���� ��µǵ��� �ϼ���.
		//while���� if�� ����ؼ�
		int j=10;
		while (j>=1) {
			if(j%2==1) {
				System.out.println(j);
			}			
			j=j-1;
		}
		
		System.out.println("==================");

		//while�� ����ؼ�
		int i=9;
		while (i>=1) {
			System.out.println(i);
			i=i-2;
		}
		
	}//end main
}//end class
