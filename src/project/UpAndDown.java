package project;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		//��ǻ�Ͱ�  1~100 ������ �� �� �ϳ��� ���� �����Ѵ�.
		Random random=new Random();
		
		System.out.println("���ڸ� ���� �־��");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//0~99������ ������ ���� �������
		int num =random.nextInt(100)+1;
		
		System.out.println("���ڸ� ������!");
		
		boolean correct=false;
		Scanner scanf=new Scanner(System.in);
		//��ȸ�� 5��
		//���� �ۼ��� �ڵ�
//		int count=0;
		/*
		 * while (count<=5) {
		 * 
		 * //����ڴ� ��ǻ�Ͱ� ������ ���� ������Ѵ�. System.out.println("��ǻ�Ͱ� ������ ���� ���纸����(1~100): ");
		 * int userInput=scanf.nextInt(); if (userInput>num) {
		 * System.out.println("���� ���ڸ� �Է����ּ���!"); } else if(userInput<num){
		 * System.out.println("ū ���ڸ� �Է����ּ���!"); } else if (userInput==num) {
		 * System.out.println("�����Դϴ�!"); }
		 * 
		 * count++; }
		 */
			
		int diff;
			for (int i = 1; i <=5; i++) {
				System.out.println("��ǻ�Ͱ� ������ ���� ���纸����(1~100)"+i+"��: ");
				int userInput=scanf.nextInt();
				diff=num-userInput;
				if (1<=diff && diff<=5) {
					System.out.println("���� ������ ���ڿ� ����ؿ�");
					System.out.println("ū ���ڸ� �Է����ּ���");
				} else if (-5<=diff && diff<=-1) {
					System.out.println("���� ������ ���ڿ� ����ؿ�");
					System.out.println("���� ���ڸ� �Է����ּ���");
				}else if (userInput>num) {
					//����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ ������ ũ�ٸ�
					//��ǻ�ʹ� "���� ���ڸ� �Է����ּ���!"��� ����ϰ�
					System.out.println("���� ���ڸ� �Է����ּ���!");
//					if (Math.abs(userInput-num)<=5) {
//						System.out.println("���� ������ ���ڿ� ����ؿ�");
//					}
				} else if(userInput<num){
					//����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ ������ �۴ٸ�
					//��ǻ�ʹ� "ū ���ڸ� �Է����ּ���!"��� ����ϼ���.
					System.out.println("ū ���ڸ� �Է����ּ���!");
//					if (Math.abs(userInput-num)<=5) {
//						System.out.println("���� ������ ���ڿ� ����ؿ�");
//					}
				} else if (userInput==num) {
					//����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ �����
					//��ǻ�ʹ� "�����Դϴ�!"��� ����ϼ���.
					System.out.println("�����Դϴ�!");
					correct=true;
				}
				
			}
		
			if (!correct) {
				System.out.println("���� ������ ���ڴ� "+num+"�Դϴ�");
				System.out.println("������ �ٽ� �������ּ���");
			}
			
		scanf.close();
		
				

	}

}
