package chapter2;

public class Ex24 {

	public static void main(String[] args) {
		double weight=55.0;
		double height=160.0;
		double BMI=(weight/(height*height))*10000;
		
		System.out.println("����� BMI������ "+BMI+"�Դϴ�");
		
		if (BMI<18.5) {
			System.out.println("��ü���Դϴ�.");
		}
		
		if (BMI>=18.5&&BMI<23) {
			System.out.println("����");
		}
		
		if (BMI>=23 && BMI<=24) {
			System.out.println("��ü�� �ǽ�");
		}
		
		if (BMI>=25 && BMI<=29) {
			System.out.println("��");
		}
		
		if (BMI>=30) {
			System.out.println("����");
		}
		
		

	}

}
