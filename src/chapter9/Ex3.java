package chapter9;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

//��û�� �ڿ��� ���α׷��� ����������, URL connection
public class Ex3 {

	public static void main(String[] args) {
		URL url=null;
		String IPAddress="http://www.youtube.com";
		
		try {
			url=new URL(IPAddress);
			URLConnection conn=url.openConnection();
			
			//���� ���� ���
			System.out.println("conn="+conn);
			System.out.println("getAllowUserInteraction()="+conn.getAllowUserInteraction());
			//���� ������� ���� �ð�
			System.out.println("getConnectTimeout()="+conn.getConnectTimeout());
			//����� �ڿ��� ���� ������ ���� �ִ� content��ü
			System.out.println("getContent()="+conn.getContent());
			//����� �ڿ��� ǥ�� ����
			System.out.println("getContentEncoding()="+conn.getContentEncoding());
			//����� �ڿ��� ũ��
			System.out.println("getContentLength()="+conn.getContentLength());
			//����� �ڿ��� Ÿ��(MineType)
			System.out.println("getContentType()="+conn.getContentType());
			System.out.println("getDate()="+conn.getDate());
			System.out.println("getDoInput()="+conn.getDoInput());
			System.out.println("getDoOutput()="+conn.getDoOutput());
			//����� �ڿ��� ����Ⱓ(��)
			System.out.println("getExpiration()="+conn.getExpiration());
			System.out.println("getIfModifiedSince()="+conn.getIfModifiedSince());
			//����� �ڿ��� ������ ���� ��¥ -�� �˾Ƶδ°� ����!!
			System.out.println("getLastModified()="+conn.getLastModified());
			System.out.println("getReadTimeout()="+conn.getReadTimeout());
			System.out.println("getURL()="+conn.getURL());
			System.out.println("getUseCaches()="+conn.getUseCaches());
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
