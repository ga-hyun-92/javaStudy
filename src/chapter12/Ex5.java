package chapter12;

public class Ex5 {

	public static void main(String[] args) {
		Car car =null;
		FireEngine fe1=new FireEngine();
		FireEngine fe2=null;
		
		//��ĳ����/����ȯ ������ ���� ����
		car=(Car)fe1;
		//�ٿ�ĳ����/����ȯ ������ ���� �Ұ���
		fe2=(FireEngine)car;
		fe2.water();
		fe1.water();
		
		FireEngine fe=new FireEngine();
		System.out.println(fe instanceof FireEngine);
		System.out.println(fe instanceof Car);
		System.out.println(fe instanceof Object);
		
		//����ȯ
		Car car1=new Car();
		System.out.println(car1 instanceof FireEngine);
		System.out.println(car1 instanceof Car);
		System.out.println(car1 instanceof Object);

	}

}
