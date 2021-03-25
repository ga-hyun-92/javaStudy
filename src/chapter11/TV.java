package chapter11;

public class TV {
 
	//멤버변수는 다 private으로 설정해둔다.
	//외부로 공개하면 안되는 데이터를 감추는 것을 캡슐화,정보은닉 이라고 함.
	private int vol;
	private int channel;
	private boolean power;
	private String color;
	private int volume;
	private int hour;
	private int min;
	private int second;

	//객체지향은 데이터들을 갖고 있을 객체를 생각해야하고
	//객체가 제공하는 기능을 설계해야하므로
	//프로젝트 개발 기간이 길어지는 단점이 있음
	//프로젝트의 규모가 커지면 점점 복잡해짐
	//프로젝트를 객체지향적으로 제대로 설계를 해두면
	//유지보수 속도가 굉장히 빨라진다.
	
	//프로시저지향은 데이터만 생각하면되므로
	//프로젝트 개발 기간이 상대적으로 짧은 장점이 있음
	//프로젝트의 규모가 커지면 데이터가 거미줄처럼 얽혀서 사용되므로
	//유지보수 속도가 굉장히 느리다.
	
	//좋은 메서드 - 한번에 하나의 기능만 제공하는 메서드
	//아래 power메서드는 두가지 기능을 제공한다.
	//1. 전원을 켜고
	//2. 현재 채널 번호를 알려준다.
	public void power() {
		power = !power;
		
		if(power) {
			System.out.println("전원이 켜졌습니다.");
			showChannel();
		} else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	
	//Source 클릭-Generate Getters and Setters
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
	
	//setter->private접근 제어자인 멤버 변수에 원하는 값을 설정해야할 때 필요한 메서드
	public void setColor(String color) {
		//TV컬러는 red,blue만 가능하다.
		if (color.equals("red")||color.equals("blue")) {
			this.color=color;
		}else {
			System.out.println("레드와 블루만 가능");
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
	
//	channelUp,Down메서드를 위한 메서드
//	public으로 하면 누군가가 변경 가능하게 된다.그러므로 private으로 설정.
	private void showChannel() {
		System.out.println("현재 채널번호는 "+channel+"입니다.");
	}
	
	//생성자 만들기
	public TV() {
		color="black";
		power=false;
		channel=1;
	}
	
	public TV(String color) {
		this.color=color;
		System.out.println("매개변수 하나 생성자 호출");
	}
	
	public TV(String color,boolean power) {
		this.color=color;
		this.power=power;
		System.out.println("매개변수 두개 생성자 호출");
	}
	
}
