package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		//�ζ� 1~45���� ���ڰ� �ִ�
		//6���� ���ڸ� �̴´�.
		//1 1 2 3 4 5 ��÷ ��ȣ�� �ߺ��Ǽ� ������ ����.
		
		//1~45������ 6�� ���ڸ� ���� �� �ߺ����� �ʰ� �̴´�.
		//List�÷��� �����ӿ��� ����ؼ� �����ϼ���.
		List<Integer> lotto2=new ArrayList<Integer>();
		Random random=new Random();
		for (int i = 0; i < 6; i++) {
			//n��° ���ڸ� ����
			lotto2.add(random.nextInt(45)+1);
			
			//0~n-1��°���� ���� ������ ���ڰ� ����ִ��� üũ
			for (int j = 0; j < lotto2.size()-1; j++) {
				if (lotto2.get(j)==lotto2.get(i)) {
					lotto2.remove(i);
					i=i-1;
					break;
				}//end if
			}//end for j
		}//end for i
	
			
		
//		Set<Integer> lotto=new HashSet<Integer>();
//		
//		Random random=new Random();
//		while (true) {
//			
//			lotto.add(random.nextInt(45)+1);
//			if(lotto.size()==6) {
//				break;
//			}
//			
//		}
//		System.out.println("��÷ ��ȣ��");
//		System.out.println(lotto);

	
		System.out.println("��÷ ��ȣ��");
		System.out.println(lotto2);

	}
}
