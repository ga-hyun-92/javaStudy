package chapter3;
//for�ݺ��� for(�ʱ��; ���ǽ�; ������)
public class Ex15 {

	public static void main(String[] args) {
		int sum=0;
		
		//for���� �ʱ�� �ڸ��� ������ ������ for�������� ����� �� �ִ�.
		//���� ����: �ʱ��-> ���ǽ� -> ������ -> ���ǽ� -> ������ -> ���ǽ�...
		for (int i = 1; i <= 10; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		//1-10���� Ȧ���� ���� ���Ͻÿ�.
		sum=0;
		for (int i = 0; i <= 10; i++) {
			if (i%2==1) {
				sum+=i;
			}//end if
			
		}//end for
		System.out.println(sum);
		
		//1-10���� ¦���� ���� ���Ͻÿ�.
		//1) for���� if���� ����ؼ�
		sum=0;
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				sum+=i;
			}//end if
			
		}//end for
		System.out.println(sum);

		//2) for������ ����ؼ�
		sum=0;
		for (int i = 0; i <= 10; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
