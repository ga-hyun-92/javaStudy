package project;

import java.util.Random;
import java.util.Scanner;

public class ThirtyOne {

	public static void main(String[] args) {
		//����ڿ� ��ǻ�Ͱ� ���� ���ڸ� �θ���.
		//���ڴ� �ѹ��� �ּ�1������ �ִ� 3������ �θ��� �ִ�.
		//1~31���� �����ϸ鼭 �ҷ����Ѵ�.
		//������ 31�� �θ� ����� ���ӿ��� ����.
		
		Scanner scanf=new Scanner(System.in);
		//1. ����ڰ� ���� �� �� ��ǻ�Ͱ� ���� �� �� ����
		
		//turn->true:������� ����, flase: ��ǻ���� ����
		boolean turn=false;
		while (true) {
			System.out.println("���� ���� �ұ��?");
			System.out.println("1�� : �����");
			System.out.println("2�� : ��ǻ��");
			int select=scanf.nextInt();
			
			if (select==1) {
				//����� ���� ����
				System.out.println("����ڰ� ���� �����մϴ�.");
				turn=true;
				break;
			} else if(select==2) {
				//��ǻ�� ���� ����
				System.out.println("��ǻ�Ͱ� ���� �����մϴ�");
				turn=false;
				break;
			} else {
				System.out.println("�������� �ΰ��� ���Դϴ�.");
			}
			
		}//end while(���� ���ϱ�)
		
		System.out.println("Game Start!!");
		
		scanf.nextLine();//�Է��ߴ��Ÿ� �ѹ� ������ ����?
		int lastNumber=0;
		
		//2. ���� �����ϴ� ���� ���ڸ� �θ���.
		while (true) {
			if (turn) {
				//����� ����
				//3. ���ڴ� �ѹ���  �Է��ؾ��Ѵ�.
				//�Է� ����) ����: 1 2 3 
				while (true) {
					
					System.out.println("����� �����Դϴ�.");
					System.out.println("�ִ� 3���� ���ڸ� �����ּ���!");
					String user=scanf.nextLine();
					String[] users=user.split(" ");
//					System.out.println("user= "+Arrays.toString(users));
					
					if (users.length==0 || users.length>3) {
						System.out.println("���ڴ� �ִ� 3�������� ��ĥ �� �ֽ��ϴ�!");
					} else {
						lastNumber=Integer.parseInt(users[users.length-1]);//parseInt ���ڿ��ε� ���ڸ� ������ ���ڷ� �ٲ��ش�.
						break;
					}
				}//end while
				
			}else {
				//��ǻ�� ����
				System.out.println();
				System.out.println("��ǻ�� �����Դϴ�.");
				
				Random random=new Random();
				int roof=random.nextInt(3)+1;//��� ���ڸ� ���� �������� ����
				for (int i = 1; i <= roof; i++) {
					lastNumber=lastNumber+1;
					if (lastNumber<=31) {
						System.out.print(lastNumber+" ");
					}
				}
				
				System.out.println();
				
			}
			
			if (lastNumber>=31) {
				if (turn) {
					System.out.println("����ڰ� �����ϴ�.");
				} else {
					System.out.println("����ڰ� �̰���ϴ�.");
				}
				break;
			}
			turn= !turn;
		}//end while
		

	}

}
