package chapter8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		
		//inputStream과 연결된 배열
		byte[] inSrc= {0,1,2,3,4,5,6,7,8,9};
		//outputStream에 저장된 데이터를 갖을 배열
		byte[] outSrc=null;
		
		byte[] temp=new byte[3];//배열에서 한번에 3개씩 읽어오겠다.
		
		//바이트 기반의 input스트림 생성
		ByteArrayInputStream input=new ByteArrayInputStream(inSrc);
		//바이트 기반의 output스트림 생성
		ByteArrayOutputStream output=new ByteArrayOutputStream();

		System.out.println(Arrays.toString(inSrc));
		
		try {
			while (input.available()>0) {
				//read시 IOException이 발생하는 이유는??
				//배열의 갯수(inSrc와 temp)가 다를수 있기 때문
				//len->read메서드가 반환하는 읽어온 데이터의 개수
				
				int len=input.read(temp);
				
				//temp배열의 0번 인덱스부터 읽어온 데이터의 갯수만큼 출력스트림으로 내보낸다.
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
//				//스트림과 연결된 데이터의 끝을 만났다면
//				//이 반복문을 빠져나가라
//				break;
//			}
//			output.write(data);
//		}//end while
		
//		outSrc=output.toByteArray();
//		System.out.println(Arrays.toString(outSrc));
		
		//스트림을 열었으면 꼭 닫아줘야함. 닫지 않으면 사용중이라 생각하게 되어서 
		//해당 메모리를 영원히 사용하지 못할수도 있다.
		//스트림 닫을때 입출력 관련한 예외(IOException)발생할수 있으니, try-catch문으로 처리해주기
		//단, byteArray는 닫아주지 않아도 된다. garbageCollector가 있어서..
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
