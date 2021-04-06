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
			//기반 스트림 생성
			fos=new FileOutputStream("C:\\Users\\ITPS\\Desktop\\bos.txt"); //fos는 철길
			//기반 스트림에 보조 스트림을 부착
			//버퍼의 기본 사이즈는 8KB
			//버퍼의 사이즈를 5바이트로 설정
			bos=new BufferedOutputStream(fos,5);//bos는 기차
			
			for (char i = '1'; i <= '9'; i++) { //bos라는 기차에 i라는 손님을 태워서 이동
					bos.write(i);
			}//1-9까지 write하라고 했는데, 12345만 저장되어 있음.
			bos.flush();//flush를 하면 버퍼를 바로 출발시킴->1-9까지 모두 저장됨.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//보조스트림 bos 닫아준다->보조스트림과 연결된 기반스트림도 함께 자동으로 닫아준다.
			try {
				bos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}

	}
}
