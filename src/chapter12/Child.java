package chapter12;

public class Child extends Parent{
	//�θ� Ŭ�����κ��� ��� ���� ������ �����ϴ� x
//	public int x=20;
	public int x;
	public int y;
	
	//��� ���迡���� �ڽ� Ŭ������ �⺻ �����ڴ�
	//�Ű������� ���� �θ� Ŭ������ �⺻ �����ڸ� ȣ���Ѵ�.
	public Child() {
		this(0,0);//�ڽ��� �ٸ� ������ ȣ���Ұ�� super()����.��� ȣ���� �ٸ� �����ڿ��� super()ȣ����.
		System.out.println("�Ű����� ���� ������");
//		�⺻ �����ڸ� ���� �߰��߰�
//		�θ� Ŭ������ �⺻ �����ڸ� ȣ���ϴ� �ڵ带 �ۼ����� �ʾҴ�.
//		�׷��� �����Ϸ��� �ڵ����� super()�� �߰����ش�.
//		super();
	}
	
	//�ڽ�Ŭ������ �ν��Ͻ��� ������� ��
	//�θ� Ŭ������ ������� ���� �����ϹǷ�
	//�ڽ� Ŭ������ �����ڸ� ����ٸ� 
	//�ڽ� Ŭ������ �������� �� ó���� �θ� Ŭ������ �����ڸ� ȣ���ؾ��Ѵ�.
	public Child(int x,int y) {
		super(1);//�θ�Ŭ���� �����ڰ� �⺻ �����ڰ� �ƴϹǷ� ���� �����������.
		System.out.println("�Ű����� �ִ� ������");
		System.out.println("�ڽ� Ŭ������ ������");
		this.x=x;
		this.y=y;
//		super(); //�̷��� �ϸ� ����!!�� ù�ٿ� ȣ���ؾ���.
	}
	
	

	
	
	public void method() {
		System.out.println("x="+x);//�ڱ� �ڽ��� x��� ��������� ������ �ڽ��� ������ �ް� ������ �θ�Ŭ�����κ��� ���� x������
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
	
	public static void main(String[] args) {
		Child child=new Child();//�θ�Ŭ���� ������ �ڵ�ȣ��
//		child.method();
	}
}
