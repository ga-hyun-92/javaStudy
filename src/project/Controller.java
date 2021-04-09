package project;

import java.util.Scanner;


public class Controller {

	public static void main(String[] args) {
		System.out.println("===========[ ���� ���� ���� ���α׷� ]==========");
		System.out.println("1. �߰�");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ���");
		System.out.println("5. ����");
		
		
		Scanner scanf=new Scanner(System.in);
		
		while (true) {
			
			System.out.print("�����ϼ���: ");
			int menu_i=scanf.nextInt();
			scanf.nextLine();
//		Menu menu=Menu.values()[menu_i];//Menu.values()->�迭
			Menu menus[] =Menu.values();
			Menu menu=menus[menu_i];
			System.out.println(menu);
			BookInfo bookInfo;
			String bookName;
			
			
			switch (menu) {
			case insert:{
				System.out.println("���� ���� �߰� ��� �����մϴ�"); 
				System.out.print("������: ");
				bookName=scanf.nextLine();
				System.out.print("ȸ���: ");
				String companyName=scanf.nextLine();
				System.out.print("����: ");
				int price=scanf.nextInt();
				bookInfo=new BookInfo(bookName, companyName, price);
//				bookInfo.add();//�ڱ� �ڽ��� �����Ѵ�.
				if (bookInfo.add()) {
					System.out.println("������ ������ �߰��߽��ϴ�");
				} else {
					System.out.println("������ ������ �ߺ��Ǿ� �߰����� ���߽��ϴ�.");
				}
					
				
				break;
			}	
			case update:	System.out.println("���� ��� ����"); break;
			case delete:	
				System.out.println("���� ���� ���� ����� �����մϴ�"); 
				System.out.print("������ ������ : ");
				bookName=scanf.nextLine();
				
				BookInfo deleteTarget=BookInfo.get(bookName);
				if (deleteTarget==null) {
					System.out.println("������ ������ �����ϴ�.");
				} else {
					if (BookInfo.delete(bookName)) {
						System.out.println("���� ���� ����");
					} else {
						System.out.println("������ �߻��Ͽ� ������ ������ ������ ���߽��ϴ�.");
						
					}
				}
				
				
				break;
			case list:	
				System.out.println("����� ������ ����� ����մϴ�."); 
				for (BookInfo bookInfo1 : BookInfo.bookInfoList) {
					System.out.println(bookInfo1);
				}
				break;
			case exit:	System.out.println("���� ��� ����"); break;
			
			}//end switch
		}//end while
			
			
	}

}
