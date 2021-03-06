package chapter8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {

	public static void main(String[] args) {
		
		FileOutputStream fos=null;

		try {
			
			fos=new FileOutputStream("C:\\Users\\ITPS\\Desktop\\output.txt",true);//append
			
			//해당 스트림과 연결된 파일에 a~z까지 저장하세요.
				for (byte i = 'A'; i <= 'Z'; i++) {
				fos.write(i); //byte값을 저장해야함
				fos.write('\n');
				}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} catch(IOException e){
			e.printStackTrace();
		}finally {
			
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//end try
			
		}//end try-catch-finally
	}

}
