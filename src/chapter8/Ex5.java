package chapter8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {

	public static void main(String[] args) {
		
		FileOutputStream fos=null;

		try {
			
			fos=new FileOutputStream("C:\\Users\\ITPS\\Desktop\\output.txt",true);//append
			
			//�ش� ��Ʈ���� ����� ���Ͽ� a~z���� �����ϼ���.
				for (byte i = 'A'; i <= 'Z'; i++) {
				fos.write(i); //byte���� �����ؾ���
				fos.write('\n');
				}
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
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
