package chapter11;
//Ŭ���� ��ȭ-������

public class Car {
	private int color;
	private int wheel;
	private float speed;
	private double fuel;
	
	//������
	//�ν��Ͻ��� ������������� "�ڵ�����" ȣ��Ǵ� �޼���
	//�Ϲ����� �޼��尡 �ƴϹǷ� �̸��� ����������
	//������ �޼����� �̸��� Ŭ������ �̸��� ���ƾ���.
	//������ �޼���� ��ȯŸ���� ����.
	//�������� ���������ڴ� public,private �� �ϳ��� �� �� �ִ�.
	public Car() {
		//�ν��Ͻ� ���鋚
		//�ش� �ν��Ͻ��� �츮�� ���ϴ� ���� ���� �ֵ���
		//������ �� ����
//		color=1;
//		wheel=4;
//		speed=0;
//		fuel=0;
		this(1,4,0,0);
		System.out.println("�Ű����� ���� �ν��Ͻ��� ���������");
		System.out.println("�� �����ڰ� ó���� ������ �ڵ��");
		System.out.println("�Ű����� ���� CarŬ������ ������ ȣ��");
	}
	
	//�����ڸ� �����ε��Ѵ�.
	public Car(int color,int wheel,float speed,double fuel) {
		this.color=color;
		this.wheel=wheel;
		this.speed=speed;
		this.fuel=fuel;
		System.out.println("�Ű����� �װ� ������ ȣ��");
	}
	//�����ڸ� �����ε��Ѵ�.
	public Car(int color) {
		//this()�� ����ϸ� �����ڸ� ȣ���� �� �ִµ�
		//�����ڸ��� �����ڸ� ȣ���� �� �ִ�.
		//�Ϲ����� �޼��尡 �����ڸ� ȣ���� �� ����.
		
		//�ٸ� �����ڸ� ȣ���ϴ� �� �ڵ�� �������� �� ���� ��ġ�ؾ��Ѵ�.
		
		//������ �ȿ��� �ٸ� �����ڸ� ȣ���ϴ� ���
		//this(�Ű�����) �� �����ڸ� ȣ���ϴ� ���
		this(color,0,0.0f,0.0);
		
		this.color=color;
		System.out.println("�Ű����� �ϳ� ������ ȣ��");
	}
	//�����ڸ� �����ε��Ѵ�.
	public Car(int color,int wheel) {
		this(color,wheel,0.0f,0.0);
		this.color=color;
		this.wheel=wheel;
		System.out.println("�Ű����� �ΰ� ������ ȣ��");
	}
	//�����ڸ� �����ε��Ѵ�.
	public Car(int color,int wheel,float speed) {
		this(color,wheel,speed,0.0);
		this.color=color;
		this.wheel=wheel;
		this.speed=speed;
		System.out.println("�Ű����� ���� ������ ȣ��");
		
	}
	
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}
	
	
	
	

}
