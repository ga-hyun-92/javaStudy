package chapter12;

//����� ������ �θ� ũ������ �ִ� ��κ� ��� ������ ��� �޼��带 ����� �� �ִ�.
//�θ� Ŭ������ ���ǵǾ� �ִ� �����ڴ� ��� ���� �� ����.
//private���� �����ڷ� �Ǿ� �ִ� ��� ����, �޼���� ����� �ޱ�� ������
//�ڽ� Ŭ������ ������ �� ���� ����� ���·� ����� �޴´�.
public class B extends A{
	
	public void showNum1() {
		System.out.println(this.num1);
		
//		System.out.println(this.num2); //������ ����!!num2�� private����
//		�����?? getter�޼��� ���
		System.out.println(getNum2());
//		setter����ؼ� �ٸ� ������ ������ ����
		setNum2(10);
	}
}
