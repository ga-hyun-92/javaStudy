package chapter8;

import java.io.File;

public class Ex12 {

	public static void main(String[] args) {
//		File file1=new File("C:\\Users\\ITPS\\Desktop\\test.txt");
//		File file2=new File("C:\\Users\\ITPS\\Desktop","test.txt");
//		
//		//���丮->�����쿡���� ������� �θ�
//		File directory =new File("C:\\Users\\ITPS\\Desktop");
//		File file3=new File(directory,"test.txt");
		
		
		File directory=new File("src\\chapter8\\");
		//���� �̸��� �̷��� ���� ����
		String fileName="Ex12.java";
		//Ex12.java��� �ҽ������� ��ü�� ����
//		File file=new File(path,fileName);
//		String path="C:\\Users\\ITPS\\eclipse-workspace\\2021-03-29\\src\\chapter8\\Ex12.java";
		File file=new File(directory,fileName);
//		File file=new File(path);
//		String fileName=file.getName();
		
		int position =fileName.lastIndexOf(".");
		
		System.out.println("��θ� ������ �����̸�-"+fileName);
		//substring->���ڿ��� �߶��ִ� �޼���, substring(���۹�ȣ,����ȣ)
		System.out.println("Ȯ���ڸ� ������ �����̸�-"+fileName.substring(0,position));
		System.out.println("Ȯ����-"+fileName.substring(position+1));
		System.out.println();
		
		System.out.println("��θ� ������ ���� �̸�-"+file.getPath());//ó���� ��θ� �����η� �Է��ؼ� �Ʒ��� ���� ����.
		System.out.println("������  ���� ���-"+file.getAbsolutePath());//������ �ֻ��� ��ġ���� �˷���.
		System.out.println("������ ���� �ִ� ���丮-"+file.getParent());
		System.out.println();
		
		//getProperty-���� �� ���α׷��� ��𿡼� ����������?
		System.out.println("user.dir-"+System.getProperty("user.dir"));

	}

}
