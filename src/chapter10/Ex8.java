package chapter10;

public class Ex8 {
	int add(int num1,int num2) {
		int result=num1+num2;
		return result;
	}
	
	double div(int num1,int num2) {
		double result=num1/num2;
		return result;
	}

	
	//1~N���� �������� ��ȯ�ϴ� stackAdd�޼���.
	//num�� 0�̻� 100���ϸ� �����մϴ�.
	int stackAdd(int num) {
		if (num<0||num>100) {
			System.out.println("n�� 0�̻� 100���ϸ� �����մϴ�.");
			return -1;//���ü� ���� ��������, -1�� ��ȯ�ϵ��� ��.
		}
		
		int sum=0;
		for (int i = 1; i <= num; i++) {
			sum+=i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		Ex8 ex8=new Ex8();
		 int result=ex8.add(1, 1);
		 System.out.println(result);
		 
		 System.out.println(ex8.div(212, 7));
		 System.out.println(ex8.stackAdd(120));
	}

}
