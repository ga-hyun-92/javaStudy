package chapter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try {
			fr=new FileReader("Ex11.java");
			br=new BufferedReader(fr);
			
//			fw=new FileWriter("Ex11.bak");
			fw=new FileWriter("Ex11_import.bak");
			bw=new BufferedWriter(fw);
			
			String line="";
			for (int i = 1; line !=null; i++) {
				//line->�Է� ��Ʈ������ �о�� �� ���� ���ڿ��� ����
				line=br.readLine();
				
  				//line���� �� import���ڿ��� ���ԵǾ��ִ��� üũ
				//indexOf �޼���-> �Ű������� ������ ���ڿ��� �ش� ��ü �� ��� ��ġ�� �����ϴ��� �˷��ִ� �޼���
				//�Ű������� ������ ���ڿ��� �����Ѵ�->0�̻��� ���� ��ȯ/�Ű������� ������ ���ڿ��� �ε��� ��ȣ
				//�Ű������� ������ ���ڿ��� �������� �ʴ´�->-1��ȯ
				if (line !=null && line.indexOf("import") == 0) {
					//line.indexOf("import") != -1 �̶�� �ϸ�, import�ܾ ���Ե� �ּ��� �Բ� �������Եȴ�.
					bw.write(i+" : "+line);
					bw.newLine();
				}
				
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
