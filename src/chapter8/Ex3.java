package chapter8;

//FileInputStream : 프로그램 밖에 있는 파일을 프로그램 안으로 불러옴.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//상대경로로 파일 찾기
public class Ex3 {

	public static void main(String[] args) {
		//인자를 문자열로 전달해주면 인자로 전달받은 경로에 있는 파일과 스트림을 연결
		//절대경로: 최상위 경로를 포함한 파일의 위치 /최상위 경로부터 해당 위치까지 파일을 찾음
		//예를 들어,
		//C:\Users\ITPS\eclipse-workspace\2021-03-29\src\chapter8\test.txt
		
		//상대경로: 최상위 경로를 생략한 파일의 위치 /현재 프로그램이 실행되는 위치부터 해당 위치까지 파일을 찾음
		//다음과 같이 "test.txt"로 되어있으면, 상대경로로 찾아나감.
		
		//try문 밖에 스트림 선언하기
		FileInputStream fis=null;
		try {
			//스트림 연결은 try문 안에서 처리해서 예외처리 해줌.
//			fis=new FileInputStream("test.txt");//상대경로
//			fis=new FileInputStream("C:\\Users\\ITPS\\Desktop\\test.txt");//절대경로(바탕화면에 있는 파일)
			String path="C:\\Users\\ITPS\\eclipse-workspace\\2021-03-29\\src\\chapter8\\Ex3.java";
			fis=new FileInputStream(path);
			while (true) {
				int data=fis.read();//문자를 아스키코드 값으로 data에 저장, read():한 바이트씩 데이터를 읽어옴.
				if (data==-1) {
					break;
				}
				char c=(char)data;//저장된 아스키코드 값을 다시 문자열로 저장
				System.out.print(c);
			}
			
			//스트림 닫는게 중요
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} catch (IOException e) {
			System.out.println("스트림을 닫는 도중 문제가 발생했습니다.");
		} finally {
			//finally는 항상 실행되는 코드이므로 항상 해야하는 close코드를 finally에 넣어줌 
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//Exception>IOException>FileNotFoundException
		//그러므로 IOException 하나로 예외처리 가능.
		
		System.out.println("프로그램 끝");
	}

}
