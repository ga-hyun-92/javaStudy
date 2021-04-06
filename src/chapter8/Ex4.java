package chapter8;
//�ҽ��ڵ带 �����ϴ� ���α׷� �����

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		//��������
		String srcPath="C:\\Users\\ITPS\\eclipse-workspace\\2021-03-29\\src\\chapter8\\Ex4.java";
		//�������� 
		String copyPath="C:\\Users\\ITPS\\eclipse-workspace\\2021-03-29\\src\\chapter8\\Ex4.bak";//������� 
		
		try {
			fis=new FileInputStream(srcPath);
			fos=new FileOutputStream(copyPath);
			
			while (true) {
				int data=fis.read();
				if (data==-1) {
					break;
				}
				fos.write(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} catch(IOException e){
			System.out.println("������ �߻��߽��ϴ�.");
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//end try
			
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//end try
			
		}//end try-catch-finally

		
	}

}
