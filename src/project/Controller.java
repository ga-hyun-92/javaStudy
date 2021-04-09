package project;

import java.util.Scanner;


public class Controller {

	public static void main(String[] args) {
		System.out.println("===========[ 도서 정보 관리 프로그램 ]==========");
		System.out.println("1. 추가");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 목록");
		System.out.println("5. 종료");
		
		
		Scanner scanf=new Scanner(System.in);
		
		while (true) {
			
			System.out.print("선택하세요: ");
			int menu_i=scanf.nextInt();
			scanf.nextLine();
//		Menu menu=Menu.values()[menu_i];//Menu.values()->배열
			Menu menus[] =Menu.values();
			Menu menu=menus[menu_i];
			System.out.println(menu);
			BookInfo bookInfo;
			String bookName;
			
			
			switch (menu) {
			case insert:{
				System.out.println("도서 정보 추가 기능 실행합니다"); 
				System.out.print("도서명: ");
				bookName=scanf.nextLine();
				System.out.print("회사명: ");
				String companyName=scanf.nextLine();
				System.out.print("가격: ");
				int price=scanf.nextInt();
				bookInfo=new BookInfo(bookName, companyName, price);
//				bookInfo.add();//자기 자신을 저장한다.
				if (bookInfo.add()) {
					System.out.println("도서의 정보를 추가했습니다");
				} else {
					System.out.println("도서의 정보가 중복되어 추가하지 못했습니다.");
				}
					
				
				break;
			}	
			case update:	System.out.println("수정 기능 실행"); break;
			case delete:	
				System.out.println("도서 정보 삭제 기능을 실행합니다"); 
				System.out.print("삭제할 도서명 : ");
				bookName=scanf.nextLine();
				
				BookInfo deleteTarget=BookInfo.get(bookName);
				if (deleteTarget==null) {
					System.out.println("삭제할 도서가 없습니다.");
				} else {
					if (BookInfo.delete(bookName)) {
						System.out.println("도서 정보 삭제");
					} else {
						System.out.println("문제가 발생하여 도서의 정보를 지우지 못했습니다.");
						
					}
				}
				
				
				break;
			case list:	
				System.out.println("저장된 도서의 목록을 출력합니다."); 
				for (BookInfo bookInfo1 : BookInfo.bookInfoList) {
					System.out.println(bookInfo1);
				}
				break;
			case exit:	System.out.println("종료 기능 실행"); break;
			
			}//end switch
		}//end while
			
			
	}

}
