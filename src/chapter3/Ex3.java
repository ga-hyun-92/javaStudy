package chapter3;

import java.util.Scanner;

public class Ex3 {
	
	static final int now_year=2021;
	static final int WEEK=7;

	public static void main(String[] args) {
	//else if��-����1	
		int num=1;
		
		if (num==1) {
			System.out.println("1�Դϴ�");
		} else if(num==2){
			System.out.println("2�Դϴ�");
		} else if (num==3) {
			System.out.println("3�Դϴ�");
		} else if (num==4) {
			System.out.println("4�Դϴ�");
		}
		
		
	//else if��-����2	
		int birth_year=1992;
		int age=Ex3.now_year -birth_year;
		
		if (age>=1&&age<=7) {
			System.out.println("������ ���Ƶ��Դϴ�.");
		} else if (age>=8&&age<=13) {
			System.out.println("�ʵ��л��Դϴ�");
		} else if(age>=14&&age<=16){
			System.out.println("���л��Դϴ�.");
		} else if (age>=17&& age<=19) {
			System.out.println("����л��Դϴ�.");
		} else if (age>=20) {
			System.out.println("�����Դϴ�.");
		}
		
	//else if��-����3	
		System.out.print("2021�� 3���� ��¥: ");
		Scanner scanf=new Scanner(System.in);
		//����ڰ� �Է��� ���� ������ �޾ƿ´�.
		int dayOfMonth=scanf.nextInt();
		int date=dayOfMonth%Ex3.WEEK;
		
		System.out.print("3��"+dayOfMonth+"���� ");
		if (date==1) {
			System.out.println("�������Դϴ�.");
		} else if(date==2){
			System.out.println("ȭ�����Դϴ�.");
		} else if (date==3) {
			System.out.println("�������Դϴ�.");
		} else if (date==4) {
			System.out.println("������Դϴ�.");
		} else if (date==5) {
			System.out.println("�ݿ����Դϴ�.");
		} else if (date==6) {
			System.out.println("������Դϴ�.");
		} else {
			System.out.println("�Ͽ����Դϴ�.");
		}

	}

}
