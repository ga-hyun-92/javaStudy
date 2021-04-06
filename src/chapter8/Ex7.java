package chapter8;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex7 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		try {
			//��� ��Ʈ�� ����
			fos=new FileOutputStream("C:\\Users\\ITPS\\Desktop\\bos.txt"); //fos�� ö��
			//��� ��Ʈ���� ���� ��Ʈ���� ����
			//������ �⺻ ������� 8KB
			//������ ����� 5����Ʈ�� ����
			bos=new BufferedOutputStream(fos,5);//bos�� ����
			
			for (char i = '1'; i <= '9'; i++) { //bos��� ������ i��� �մ��� �¿��� �̵�
					bos.write(i);
			}//1-9���� write�϶�� �ߴµ�, 12345�� ����Ǿ� ����.
			bos.flush();//flush�� �ϸ� ���۸� �ٷ� ��߽�Ŵ->1-9���� ��� �����.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//������Ʈ�� bos �ݾ��ش�->������Ʈ���� ����� ��ݽ�Ʈ���� �Բ� �ڵ����� �ݾ��ش�.
			try {
				bos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}

	}
}
