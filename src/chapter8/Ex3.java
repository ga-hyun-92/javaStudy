package chapter8;

//FileInputStream : ���α׷� �ۿ� �ִ� ������ ���α׷� ������ �ҷ���.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//����η� ���� ã��
public class Ex3 {

	public static void main(String[] args) {
		//���ڸ� ���ڿ��� �������ָ� ���ڷ� ���޹��� ��ο� �ִ� ���ϰ� ��Ʈ���� ����
		//������: �ֻ��� ��θ� ������ ������ ��ġ /�ֻ��� ��κ��� �ش� ��ġ���� ������ ã��
		//���� ���,
		//C:\Users\ITPS\eclipse-workspace\2021-03-29\src\chapter8\test.txt
		
		//�����: �ֻ��� ��θ� ������ ������ ��ġ /���� ���α׷��� ����Ǵ� ��ġ���� �ش� ��ġ���� ������ ã��
		//������ ���� "test.txt"�� �Ǿ�������, ����η� ã�Ƴ���.
		
		//try�� �ۿ� ��Ʈ�� �����ϱ�
		FileInputStream fis=null;
		try {
			//��Ʈ�� ������ try�� �ȿ��� ó���ؼ� ����ó�� ����.
//			fis=new FileInputStream("test.txt");//�����
//			fis=new FileInputStream("C:\\Users\\ITPS\\Desktop\\test.txt");//������(����ȭ�鿡 �ִ� ����)
			String path="C:\\Users\\ITPS\\eclipse-workspace\\2021-03-29\\src\\chapter8\\Ex3.java";
			fis=new FileInputStream(path);
			while (true) {
				int data=fis.read();//���ڸ� �ƽ�Ű�ڵ� ������ data�� ����, read():�� ����Ʈ�� �����͸� �о��.
				if (data==-1) {
					break;
				}
				char c=(char)data;//����� �ƽ�Ű�ڵ� ���� �ٽ� ���ڿ��� ����
				System.out.print(c);
			}
			
			//��Ʈ�� �ݴ°� �߿�
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} catch (IOException e) {
			System.out.println("��Ʈ���� �ݴ� ���� ������ �߻��߽��ϴ�.");
		} finally {
			//finally�� �׻� ����Ǵ� �ڵ��̹Ƿ� �׻� �ؾ��ϴ� close�ڵ带 finally�� �־��� 
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//Exception>IOException>FileNotFoundException
		//�׷��Ƿ� IOException �ϳ��� ����ó�� ����.
		
		System.out.println("���α׷� ��");
	}

}
