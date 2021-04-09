package chapter9;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

//URL: 서버가 제공하는 자원에 접근하기 위한 경로

public class Ex2 {

	public static void main(String[] args) {
		try {
			String protocol="http://";
			String host="www.ddaily.co.kr/";
			String path="data/photos/cdn/20210104/";
			String resource="art_1611539583.jpg";
			String queryString="?referer=naver";//쿼리스트링
			String anchor="#index";
			URL url=new URL(protocol+host+path+resource+queryString+anchor);//절대경로로 자원에 접근
			
			System.out.println("url.getAuthority()="+url.getAuthority());
			System.out.println("url.getContent()="+url.getContent());//자원에 대한 정보를 직접 갖고 있는 객체
			System.out.println("url.getDefaultPort()="+url.getDefaultPort());//기본 포트 번호
			System.out.println("url.getPort()="+url.getPort());//실제 내가 접속한 포트 번호
			System.out.println("url.getFile()="+url.getFile());//요청한 자원의 이름 반환
			System.out.println("url.getHost()="+url.getHost());//서버 호스트 이름
			System.out.println("url.getPath()="+url.getPath());
			System.out.println("url.getProtocol()="+url.getProtocol());
			System.out.println("url.getQuery()="+url.getQuery());
			System.out.println("url.getRef()="+url.getRef());//anchor부분
			System.out.println("url.getUserInfo()="+url.getUserInfo());//이 자원에 접근한 사용자의 정보
			System.out.println("url.toExternalForm()="+url.toExternalForm());
			System.out.println("url.toURI()="+url.toURI());//자원까지 접근하기위한 유일한 경로
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}

	}

}
