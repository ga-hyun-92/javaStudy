package chapter8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		
		//inputStream�� ����� �迭
		byte[] inSrc= {0,1,2,3,4,5,6,7,8,9};
		//outputStream�� ����� �����͸� ���� �迭
		byte[] outSrc=null;
		
		byte[] temp=new byte[3];//�迭���� �ѹ��� 3���� �о���ڴ�.
		
		//����Ʈ ����� input��Ʈ�� ����
		ByteArrayInputStream input=new ByteArrayInputStream(inSrc);
		//����Ʈ ����� output��Ʈ�� ����
		ByteArrayOutputStream output=new ByteArrayOutputStream();

		System.out.println(Arrays.toString(inSrc));
		
		try {
			while (input.available()>0) {
				//read�� IOException�� �߻��ϴ� ������??
				//�迭�� ����(inSrc�� temp)�� �ٸ��� �ֱ� ����
				//len->read�޼��尡 ��ȯ�ϴ� �о�� �������� ����
				
				int len=input.read(temp);
				
				//temp�迭�� 0�� �ε������� �о�� �������� ������ŭ ��½�Ʈ������ ��������.
				output.write(temp,0,len);
				outSrc=output.toByteArray();
				
				System.out.println("temp: "+Arrays.toString(temp));
				System.out.println("output source: "+Arrays.toString(outSrc));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
//		while (true) {
//			int data=input.read();
//			if (data==-1) {
//				//��Ʈ���� ����� �������� ���� �����ٸ�
//				//�� �ݺ����� ����������
//				break;
//			}
//			output.write(data);
//		}//end while
		
//		outSrc=output.toByteArray();
//		System.out.println(Arrays.toString(outSrc));
		
		//��Ʈ���� �������� �� �ݾ������. ���� ������ ������̶� �����ϰ� �Ǿ 
		//�ش� �޸𸮸� ������ ������� ���Ҽ��� �ִ�.
		//��Ʈ�� ������ ����� ������ ����(IOException)�߻��Ҽ� ������, try-catch������ ó�����ֱ�
		//��, byteArray�� �ݾ����� �ʾƵ� �ȴ�. garbageCollector�� �־..
		try {
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
