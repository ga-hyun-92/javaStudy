package chapter3;

public class Ex7 {

	public static void main(String[] args) {
		//����3
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
				
//				0-9��/10-19�� ��������
				if (book_1>=0) {
					switch (book) {
					
					case 0:
						System.out.println("���� �� �����ô°� ���ھ��!");
						break;
					
					case 1:
						System.out.println("å �д� ���� ���ô� ���̽ó׿�");
						break;		
						
					case 2:
						System.out.println("å�� ����Ͻô� ���̽ó׿�");
						break;
					default:
						System.out.println("�ٵ����Դϴ�.");
					}//end switch
					
				} else {
					System.out.println("1�� ���� ���� å�� ���� ����� �����մϴ�.");
				}//end if
	}

}
