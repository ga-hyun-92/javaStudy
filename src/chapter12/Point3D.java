package chapter12;

//3���� �� ���� ǥ���ϱ� ���� Ŭ����
public class Point3D extends Point{
	private int z;
	
	public int getZ() {
		return z;
	}

	//�������̵�: �θ�Ŭ������ ���ǵǾ� �ִ� �޼��带 �ڽ� Ŭ�������� �������ϴ� ��
	//Source - Override/implement Methods
	@Override//annotation�ּ�
	public String getLocation() {
//		return super.getLocation()+", z: "+z;
		return  getLocation()+", z: "+z;
		//super�� '�θ���'��� �ǹ�
		//thisl�� ���������� super������ �ʰ� �޼��� ȣ��
	}
	
//	public String getLocation() {
//		//3������ �� ���� ��ǥ�� ���ڿ��� ��ȯ
//		int x=getX();
//		int y=getY();
//		
//		return "x:"+x+", y: "+y+", z: "+z; 
//		}
	
	public String get3DLocation() {
		return  getLocation()+", z: "+z;
	}
}

//�����ε�(��Ӱ� ���� ���� ����): �� Ŭ���� �� ������ �̸��� ����ϸ鼭 �Ű������� ���� �ٸ� �޼���

//�������̵�(��� ���迡���� ��� ����): �θ� Ŭ�������� ��� �޴� ��� �޼��带 ������
//����1-�̸��� ���ƾ���.
//����2-�Ű������� ���ƾ���.
//����3-��ȯŸ���� ���ƾ���.
