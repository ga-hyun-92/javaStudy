package chapter12;

public class Ex6 {

	public static void main(String[] args) {
		//����1
		// ����� ���� �� �ִ� �ٱ��ϸ� ���� �ٱ��Ͽ� ����� ��ƺ�����.
		Apple[] appleBasket=new Apple[3];
		appleBasket[0]=new Apple();
		
		//�ٳ����� ���� �� �ִ� �ٱ��ϸ� ���� �ٱ��Ͽ� �ٳ����� ��ƺ�����.
		Banana[] bananBasket=new Banana[3];
		bananBasket[0]=new Banana();
				
		Onion[] onionBasket=new Onion[3];
		onionBasket[0]=new Onion();
		
		//����2
		//��ǰ(Product)�� ���� �� �ִ� �ٱ��ϸ� ����� �ٱ��Ͽ� 
		//���,����,�ٳ����� ��� ��������.
		Product[] basket=new Product[3];
		basket[0]=new Apple();
		basket[1]=new Banana();
		basket[2]=new Onion();
		
		
		//����3
		//���� �����뿡�� ���ϸ� ����ǵ���,,,
		//����� �����̸鼭 ��ǰ�̴�.
		//�ٳ����� �����̸鼭 ��ǰ�̴�.
		Product[] fruit_shelf=new Fruit[3];
		fruit_shelf[0]=new Apple();
		fruit_shelf[1]=new Banana();
//		fruit_shelf[1]=new Onion; //������. Onion�� FruitŬ������ ��ӹ��� �ʱ� ����.
		
		//ä�� �����뿡�� ä�Ҹ� ����ǵ���,,,
		//���Ĵ� ä���̸鼭 ��ǰ�̴�.
		Vegetable[] vegetableSelf=new Vegetable[3];
		vegetableSelf[0]=new Onion();
		
		
				
		
				
		
		

	}
}

