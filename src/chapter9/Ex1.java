package chapter9;
//IP주소
//네트워킹
//-서버
//-클라이언트
//
//cmd들어가서
//ipconfig 입력
//IPv4 주소 . . . . . . . . . : 192.168.2.31  ->IP주소
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		InetAddress ip=null;
		InetAddress ipArray[]=null;
		
		try {
			ip=InetAddress.getByName("www.naver.com");
			//도메인:IP 주소로 서버에 접근해야하는데,IP주소는 0-255사이의 4자리 숫자로 이루어져 있으므로
			//접근성이 떨어짐. 그러므로 숫자를 의미있는 문자로 지정해서 사용하는게 더 편함
			//예를들어, 223.130.195.95 대신, www.naver.com 로 사용
			//이렇게 숫자를 문자로 바꿔주는 서비스를 '도메인 네임 서비스'라고 함-> DNS
			System.out.println("getHostName() = "+ip.getHostName());
			System.out.println("getHostAddress() = "+ip.getHostAddress());//해당 서버에 숫자로된 IP주소를 알려줌.
			System.out.println("toString() = "+ip.toString());
			
			//IP->4자리 숫자로 이루어져있음 / 1Byte(0-255까지 표현)
			byte[] ipAddress=ip.getAddress();
			System.out.println("getAddress() = "+Arrays.toString(ipAddress));
			
			//subNetMask씌우기
			String result="";
			for (int i = 0; i < ipAddress.length; i++) {
				result +=(ipAddress[i]<0)? ipAddress[i]+256 : ipAddress[i];
				result +=".";
				
			}
			System.out.println("getAddress() +256 = "+result);
			System.out.println("===============");
			
			//getLocalHost() 내 컴퓨터의 IP정보
			ip=InetAddress.getLocalHost();
			
			System.out.println("getHostName() = "+ip.getHostName());
			System.out.println("getHostAddress() = "+ip.getHostAddress());
			System.out.println("===============");
			
			//해당 이름의 도메인 사용해서 접속할수 있는 모든 서버의 정보를 알려줌
			ipArray=InetAddress.getAllByName("www.naver.com");
			for (int i = 0; i < ipArray.length; i++) {
				System.out.println("ipArray["+i+"]="+ipArray[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
