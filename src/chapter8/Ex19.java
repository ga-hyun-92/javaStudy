package chapter8;

import java.io.File;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		
		System.out.println("=======[����]=====");
		System.out.println("��� : (���丮 �Ǵ� ������ ��� �Է�)");
		System.out.println("�̸� : (������ ������ �̸�)");
		System.out.println("���α׷� ���� -> exit�Է�");

		while (true) {
			System.out.println("���: ");
			String path=scanf.next();
			
			System.out.println("������ ������ �̸�: ");
			String name=scanf.next();
			
			if (path.equals("exit")) {
				System.out.println("���α׷� ����");
				break;
			}//end if
			
			File file=new File(path);
			File[] files=file.listFiles();
			
			boolean isDelete=deleteFile(files,name);
			if (isDelete) {
				System.out.println(name+"��(��) �����߽��ϴ�.");
			} else {
				System.out.println(name+"��(��) �������� ���߽��ϴ�.");
				}
		}//end while
	}//end main
	
	public static boolean deleteFile(File[] files,String name) {
		boolean result=false;
		
		for (File f : files) {
			if (f.isFile()) {
				String filename=f.getName();
				
				if (filename.equals(name)) {
					result=f.delete();
				}//end if
			}//end if
		}//end for
		return result;
	}
}
