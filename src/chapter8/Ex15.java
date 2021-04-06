package chapter8;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Ex15 {

	public static Map<String, Integer> printFileList(File dir){
		//listFiles-> �� ��ü(dir)�� ���� �ִ� ���丮�� ������ ���
		File[] files=dir.listFiles();
		
		//�� ��ü �� ���丮�� ��
		int dirNum=0;
		//�� ��ü �� ������ ��
		int fileNum=0;
		
		for (int i = 0; i < files.length; i++) {
			File file=files[i];
			String filename=file.getName();
			
			if (file.isDirectory()) {
				filename="["+filename+"]";
				dirNum++;
			} else {
				fileNum++;
			}
			System.out.println(filename);
		}//end for
		
		Map<String, Integer> count=new HashMap<String, Integer>();
		count.put("fileNum", fileNum);
		count.put("dirNum", dirNum);
		return count;
	}
	
	public static void main(String[] args) {
		
		File dir=new File("src");
		
		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			//exit->���α׷� ���� / ���� ������ ������ �ƴ�..���� ����
			System.exit(0);
		} else {
			//�����ϰ� ���丮�� ���,
			//�̷����� ó����..
		}
		
		System.out.println(dir.getAbsolutePath()+"���丮");
		Map<String, Integer> count=printFileList(dir);
		
		System.out.println("�� "+count.get("fileNum")+"���� ����");
		System.out.println("�� "+count.get("dirNum")+"���� ���丮");

	}

}
