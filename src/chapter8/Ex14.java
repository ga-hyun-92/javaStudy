package chapter8;

import java.io.File;

public class Ex14 {

	public static void main(String[] args) {
		File file=new File("src\\test\\");
		
		// !(not)������ ���
		if (!file.exists() || !file.isDirectory()) {
			System.out.println("�������� �ʰų� ���丮�� �ƴմϴ�.");
			
			System.out.println("�ش� ��ο� ���丮�� �����մϴ�.");
			
			//mkdir-> make directory 
			//�츮�� ������ ������ ���丮�� �����ϴ� �޼���
			file.mkdir();
			//mkdirs->������ ��� �� �������� �ʴ� ���丮���� �� �������ִ� �޼���
			//("src\\a\\b\\test")src �ؿ� a,b�� �������� ������, a,b���丮�� �Բ� �������ְ� test����
			file.mkdirs();
		} else {
			System.out.println("�����մϴ�.");
		}

	}

}
