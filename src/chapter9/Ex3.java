package chapter9;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

//요청한 자원과 프로그램을 연결했을때, URL connection
public class Ex3 {

	public static void main(String[] args) {
		URL url=null;
		String IPAddress="http://www.youtube.com";
		
		try {
			url=new URL(IPAddress);
			URLConnection conn=url.openConnection();
			
			//연결 정보 출력
			System.out.println("conn="+conn);
			System.out.println("getAllowUserInteraction()="+conn.getAllowUserInteraction());
			//연결 종료까지 남은 시간
			System.out.println("getConnectTimeout()="+conn.getConnectTimeout());
			//연결된 자원에 대한 정보를 갖고 있는 content객체
			System.out.println("getContent()="+conn.getContent());
			//연결된 자원의 표현 형식
			System.out.println("getContentEncoding()="+conn.getContentEncoding());
			//연결된 자원의 크기
			System.out.println("getContentLength()="+conn.getContentLength());
			//연결된 자원의 타입(MineType)
			System.out.println("getContentType()="+conn.getContentType());
			System.out.println("getDate()="+conn.getDate());
			System.out.println("getDoInput()="+conn.getDoInput());
			System.out.println("getDoOutput()="+conn.getDoOutput());
			//연결된 자원의 만료기간(초)
			System.out.println("getExpiration()="+conn.getExpiration());
			System.out.println("getIfModifiedSince()="+conn.getIfModifiedSince());
			//연결된 자원의 마지막 수정 날짜 -꼭 알아두는게 좋음!!
			System.out.println("getLastModified()="+conn.getLastModified());
			System.out.println("getReadTimeout()="+conn.getReadTimeout());
			System.out.println("getURL()="+conn.getURL());
			System.out.println("getUseCaches()="+conn.getUseCaches());
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
