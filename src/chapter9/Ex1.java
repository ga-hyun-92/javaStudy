package chapter9;
//IP�ּ�
//��Ʈ��ŷ
//-����
//-Ŭ���̾�Ʈ
//
//cmd����
//ipconfig �Է�
//IPv4 �ּ� . . . . . . . . . : 192.168.2.31  ->IP�ּ�
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		InetAddress ip=null;
		InetAddress ipArray[]=null;
		
		try {
			ip=InetAddress.getByName("www.naver.com");
			//������:IP �ּҷ� ������ �����ؾ��ϴµ�,IP�ּҴ� 0-255������ 4�ڸ� ���ڷ� �̷���� �����Ƿ�
			//���ټ��� ������. �׷��Ƿ� ���ڸ� �ǹ��ִ� ���ڷ� �����ؼ� ����ϴ°� �� ����
			//�������, 223.130.195.95 ���, www.naver.com �� ���
			//�̷��� ���ڸ� ���ڷ� �ٲ��ִ� ���񽺸� '������ ���� ����'��� ��-> DNS
			System.out.println("getHostName() = "+ip.getHostName());
			System.out.println("getHostAddress() = "+ip.getHostAddress());//�ش� ������ ���ڷε� IP�ּҸ� �˷���.
			System.out.println("toString() = "+ip.toString());
			
			//IP->4�ڸ� ���ڷ� �̷�������� / 1Byte(0-255���� ǥ��)
			byte[] ipAddress=ip.getAddress();
			System.out.println("getAddress() = "+Arrays.toString(ipAddress));
			
			//subNetMask�����
			String result="";
			for (int i = 0; i < ipAddress.length; i++) {
				result +=(ipAddress[i]<0)? ipAddress[i]+256 : ipAddress[i];
				result +=".";
				
			}
			System.out.println("getAddress() +256 = "+result);
			System.out.println("===============");
			
			//getLocalHost() �� ��ǻ���� IP����
			ip=InetAddress.getLocalHost();
			
			System.out.println("getHostName() = "+ip.getHostName());
			System.out.println("getHostAddress() = "+ip.getHostAddress());
			System.out.println("===============");
			
			//�ش� �̸��� ������ ����ؼ� �����Ҽ� �ִ� ��� ������ ������ �˷���
			ipArray=InetAddress.getAllByName("www.naver.com");
			for (int i = 0; i < ipArray.length; i++) {
				System.out.println("ipArray["+i+"]="+ipArray[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
