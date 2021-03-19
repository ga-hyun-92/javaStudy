package chapter2;

public class Ex24 {

	public static void main(String[] args) {
		double weight=55.0;
		double height=160.0;
		double BMI=(weight/(height*height))*10000;
		
		System.out.println("당신의 BMI지수는 "+BMI+"입니다");
		
		if (BMI<18.5) {
			System.out.println("저체중입니다.");
		}
		
		if (BMI>=18.5&&BMI<23) {
			System.out.println("정상");
		}
		
		if (BMI>=23 && BMI<=24) {
			System.out.println("과체중 의심");
		}
		
		if (BMI>=25 && BMI<=29) {
			System.out.println("비만");
		}
		
		if (BMI>=30) {
			System.out.println("고도비만");
		}
		
		

	}

}
