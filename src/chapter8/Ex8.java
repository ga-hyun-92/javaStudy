package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex8 {

	public static void main(String[] args) {
		//fis,fr-입력스트림
		//fis-바이트기반 입력스트림,한번에 1바이트씩 가져옴
		//fr-문자기반 입력스트림,한번에 2바이트씩 가져옴
		FileInputStream fis=null;
		FileReader fr=null;

		String filename="C:\\Users\\ITPS\\Desktop\\test.txt";
		
		//��Ʈ�� ���� 
		try {
			fis=new FileInputStream(filename);
			fr=new FileReader(filename);
			
			//����Ʈ��� ��Ʈ�� �о����  바이트기반 스트림
			while (true) {
				int data=fis.read();
				if (data==-1) {
					break;
				}
				System.out.print((char)data);
			}
			
			System.out.println();
			//���ڱ�� ��Ʈ�� �о���� 문자기반 스트림
			//한글이 제대로 읽힘
			while (true) {
				int data=fr.read();
				if (data==-1) {
					break;
				}
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//end try
		}//end try-catch-finally
	}
}
