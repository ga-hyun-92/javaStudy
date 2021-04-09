package chapter9;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

//URL: ������ �����ϴ� �ڿ��� �����ϱ� ���� ���

public class Ex2 {

	public static void main(String[] args) {
		try {
			String protocol="http://";
			String host="www.ddaily.co.kr/";
			String path="data/photos/cdn/20210104/";
			String resource="art_1611539583.jpg";
			String queryString="?referer=naver";//������Ʈ��
			String anchor="#index";
			URL url=new URL(protocol+host+path+resource+queryString+anchor);//�����η� �ڿ��� ����
			
			System.out.println("url.getAuthority()="+url.getAuthority());
			System.out.println("url.getContent()="+url.getContent());//�ڿ��� ���� ������ ���� ���� �ִ� ��ü
			System.out.println("url.getDefaultPort()="+url.getDefaultPort());//�⺻ ��Ʈ ��ȣ
			System.out.println("url.getPort()="+url.getPort());//���� ���� ������ ��Ʈ ��ȣ
			System.out.println("url.getFile()="+url.getFile());//��û�� �ڿ��� �̸� ��ȯ
			System.out.println("url.getHost()="+url.getHost());//���� ȣ��Ʈ �̸�
			System.out.println("url.getPath()="+url.getPath());
			System.out.println("url.getProtocol()="+url.getProtocol());
			System.out.println("url.getQuery()="+url.getQuery());
			System.out.println("url.getRef()="+url.getRef());//anchor�κ�
			System.out.println("url.getUserInfo()="+url.getUserInfo());//�� �ڿ��� ������ ������� ����
			System.out.println("url.toExternalForm()="+url.toExternalForm());
			System.out.println("url.toURI()="+url.toURI());//�ڿ����� �����ϱ����� ������ ���
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}

	}

}
