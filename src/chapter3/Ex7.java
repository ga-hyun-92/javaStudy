package chapter3;

public class Ex7 {

	public static void main(String[] args) {
		//예제3
				int book_1=13;
				
				System.out.println(book_1/10);
				
				System.out.println(0/10);
				System.out.println(1/10);
				System.out.println(2/10);
				System.out.println(3/10);
				System.out.println(4/10);
				System.out.println(5/10);
				System.out.println(6/10);
				System.out.println(7/10);
				System.out.println(8/10);
				System.out.println(9/10);
				
				System.out.println("========= ===========");
				System.out.println(10/10);
				System.out.println(11/10);
				System.out.println(12/10);
				System.out.println(13/10);
				System.out.println(14/10);
				System.out.println(15/10);
				System.out.println(16/10);
				System.out.println(17/10);
				System.out.println(18/10);
				System.out.println(19/10);
				
				int book=book_1/10;
				
//				0-9권/10-19권 범위지정
				if (book_1>=0) {
					switch (book) {
					
					case 0:
						System.out.println("조금 더 읽으시는게 좋겠어요!");
						break;
					
					case 1:
						System.out.println("책 읽는 것을 즐기시는 분이시네요");
						break;		
						
					case 2:
						System.out.println("책을 사랑하시는 분이시네요");
						break;
					default:
						System.out.println("다독왕입니다.");
					}//end switch
					
				} else {
					System.out.println("1년 동안 읽은 책의 수는 양수만 가능합니다.");
				}//end if
	}

}
