package chapter13;

//�߻�Ŭ������ �ٸ� Ŭ������ �θ� Ŭ������ �� �� �ִ�.
//�θ� Ŭ������ �߻� Ŭ�������
//�ڽ� Ŭ������ �θ� Ŭ������ ���ǵǾ� �ִ�
//�߻� �޼��带 �ݵ�� �����ؾ��Ѵ�.
public class AudioPlayer extends Player{
	//�θ� Ŭ������ ���ǵǾ��ִ� �޼��带 �ڽ� Ŭ�������� �������ϴ� ��: �������̵�

	@Override
	public void stop() {
		System.out.println("stop!!!");
	}

	@Override
	public void play(int pos) {
		System.out.println("play�޼��� �������̵�");
	}

}
