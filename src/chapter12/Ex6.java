package chapter12;

public class Ex6 {

	public static void main(String[] args) {
		//예제1
		// 사과를 담을 수 있는 바구니를 만들어서 바구니에 사과를 담아보세요.
		Apple[] appleBasket=new Apple[3];
		appleBasket[0]=new Apple();
		
		//바나나를 담을 수 있는 바구니를 만들어서 바구니에 바나나를 담아보세요.
		Banana[] bananBasket=new Banana[3];
		bananBasket[0]=new Banana();
				
		Onion[] onionBasket=new Onion[3];
		onionBasket[0]=new Onion();
		
		//예제2
		//상품(Product)을 담을 수 있는 바구니를 만들어 바구니에 
		//사과,양파,바나나를 모두 담으세요.
		Product[] basket=new Product[3];
		basket[0]=new Apple();
		basket[1]=new Banana();
		basket[2]=new Onion();
		
		
		//예제3
		//과일 진열대에는 과일만 저장되도록,,,
		//사과는 과일이면서 상품이다.
		//바나나는 과일이면서 상품이다.
		Product[] fruit_shelf=new Fruit[3];
		fruit_shelf[0]=new Apple();
		fruit_shelf[1]=new Banana();
//		fruit_shelf[1]=new Onion; //오류뜸. Onion은 Fruit클래스를 상속받지 않기 때문.
		
		//채소 진열대에는 채소만 저장되도록,,,
		//양파는 채소이면서 상품이다.
		Vegetable[] vegetableSelf=new Vegetable[3];
		vegetableSelf[0]=new Onion();
		
		
				
		
				
		
		

	}
}

