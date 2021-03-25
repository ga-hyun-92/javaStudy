package chapter11;

public class TV {
 
	//��������� �� private���� �����صд�.
	//�ܺη� �����ϸ� �ȵǴ� �����͸� ���ߴ� ���� ĸ��ȭ,�������� �̶�� ��.
	private int vol;
	private int channel;
	private boolean power;
	private String color;
	private int volume;
	private int hour;
	private int min;
	private int second;

	//��ü������ �����͵��� ���� ���� ��ü�� �����ؾ��ϰ�
	//��ü�� �����ϴ� ����� �����ؾ��ϹǷ�
	//������Ʈ ���� �Ⱓ�� ������� ������ ����
	//������Ʈ�� �Ը� Ŀ���� ���� ��������
	//������Ʈ�� ��ü���������� ����� ���踦 �صθ�
	//�������� �ӵ��� ������ ��������.
	
	//���ν��������� �����͸� �����ϸ�ǹǷ�
	//������Ʈ ���� �Ⱓ�� ��������� ª�� ������ ����
	//������Ʈ�� �Ը� Ŀ���� �����Ͱ� �Ź���ó�� ������ ���ǹǷ�
	//�������� �ӵ��� ������ ������.
	
	//���� �޼��� - �ѹ��� �ϳ��� ��ɸ� �����ϴ� �޼���
	//�Ʒ� power�޼���� �ΰ��� ����� �����Ѵ�.
	//1. ������ �Ѱ�
	//2. ���� ä�� ��ȣ�� �˷��ش�.
	public void power() {
		power = !power;
		
		if(power) {
			System.out.println("������ �������ϴ�.");
			showChannel();
		} else {
			System.out.println("������ �������ϴ�.");
		}
	}
	
	//Source Ŭ��-Generate Getters and Setters
	public int getVol() {
		return vol;
	}

	public int getChannel() {
		return channel;
	}

	public boolean isPower() {
		return power;
	}

	public String getColor() {
		return color;
	}
	
	//setter->private���� �������� ��� ������ ���ϴ� ���� �����ؾ��� �� �ʿ��� �޼���
	public void setColor(String color) {
		//TV�÷��� red,blue�� �����ϴ�.
		if (color.equals("red")||color.equals("blue")) {
			this.color=color;
		}else {
			System.out.println("����� ��縸 ����");
		}
		
	}

	public int getVolume() {
		return volume;
	}

	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public int getSecond() {
		return second;
	}

	public void channelUp( ) {
//		channel++;
		channel=(channel%500)+1;
		showChannel();
	}
	
	public void channelDown( ) {
//		channel--;
		channel=(channel%500)-1;
		showChannel();
	}
	
//	channelUp,Down�޼��带 ���� �޼���
//	public���� �ϸ� �������� ���� �����ϰ� �ȴ�.�׷��Ƿ� private���� ����.
	private void showChannel() {
		System.out.println("���� ä�ι�ȣ�� "+channel+"�Դϴ�.");
	}
	
	//������ �����
	public TV() {
		color="black";
		power=false;
		channel=1;
	}
	
	public TV(String color) {
		this.color=color;
		System.out.println("�Ű����� �ϳ� ������ ȣ��");
	}
	
	public TV(String color,boolean power) {
		this.color=color;
		this.power=power;
		System.out.println("�Ű����� �ΰ� ������ ȣ��");
	}
	
}
