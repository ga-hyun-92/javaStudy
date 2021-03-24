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

	
	//1~N까지 누적합을 반환하는 stackAdd메서드.
	//num은 0이상 100이하만 가능합니다.
	int stackAdd(int num) {
		if (num<0||num>100) {
			System.out.println("n은 0이상 100이하만 가능합니다.");
			return -1;//나올수 없는 누적합인, -1을 반환하도록 함.
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
