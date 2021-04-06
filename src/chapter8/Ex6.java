package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex6 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("C:\\Users\\ITPS\\Desktop\\output.txt");
			
			while (true) {
				int data=fis.read();
				if (data==-1) {
					break;
				}
//				char c=(char)data;//저장된 아스키코드 값을 다시 문자열로 저장
//				System.out.print(c);
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
