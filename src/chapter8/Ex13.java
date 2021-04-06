package chapter8;

import java.io.File;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) {
		//�������� ���� ����(test.java)�� ��üȭ��Ű��
		File file=new File("src\\chapter8\\test.java");
		
		//�������� �ʴ� ������ ��üȭ��ų������ �� ���翩�� Ȯ���������.
		//exists -> ���� �Ǵ� ���丮�� ���翩�� �˷���/ �����ϸ� true, �������� ������ false
		//isFile -> �ش� ��ü�� ���� �ִ� ������ ������ �������? true, ���丮�� �������?false
		if (file.exists()==false || file.isFile()==false) {
			System.out.println("�������� �ʰų� ������ �ƴմϴ�.");
			
			System.out.println("�ش� ��ο� ������ �����մϴ�.");
			try {
				boolean result=file.createNewFile();
				if (result) {
					System.out.println("������ �����߽��ϴ�.");
				} else {
					System.out.println("������ �������� ���߽��ϴ�.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("�����մϴ�.");
		}

	}

}
