package test;

//�ٸ� ��Ű���� �ִ� Ŭ�����̱� ������ import���ش�.
import chapter11.SimpleType;
import chapter11.TV;

public class Ex1 {

	public static void main(String[] args) {
		SimpleType type=new SimpleType();
		
		//�ٸ� ��Ű���� �־ public��������� �޼���� ���� ����.
		 type.num1=5;
		 type.func1();
		 
		 //�ٸ���Ű���� default�� ����� ��������� �޼���� ���� �Ұ���.
		 
		 //��ü���� ���α׷����� ����� �߽����� ���α׷��� �����ϴ� ���
		 //��ü�� ����ϴ� �ʿ����� ��ü�� �����ϴ� ��ɸ��� ����ؾ��Ѵ�.
		 TV LG_TV =new TV();
		  
		  LG_TV.channelDown(); 
		  LG_TV.channelUp(); 
		  
		  //���ν������� ���α׷��� ���...
//		  LG_TV.channel++;
		  
		 //������ ���� �� ���� ä�� ��ȣ�� �˷��ְ� ���� ����??
		 //1.������ �Ѱ�
		  LG_TV.power();
		 //2.ä�� ��ȣ�� �˷��ش�.
		 //getter��� �޼��� �߰��ؼ� �˷��ش�(���� showChannel�� private�� ���� �Ұ���)
		  System.out.println("ä�� ��ȣ�� "+LG_TV.getChannel()+"�� �Դϴ�.");

		 //LG_TV�� Ư¡�� ������, ��������� �����ؼ� �� ������ ���ټ� �ֵ���,
		  //Setter �޼��� ���
		  LG_TV.setColor("green");
		  System.out.println(LG_TV.getColor());
	}

}
