package chapter12;

//3차원 한 점을 표현하기 위한 클래스
public class Point3D extends Point{
	private int z;
	
	public int getZ() {
		return z;
	}
	
	
//오버라이딩: 부모클래스에 정의되어 있는 메서드를 자식 클래스에서 재정의하는 것

	public String getLocation() {
		//3차원의 한 점의 좌표를 문자열로 반환
		int x=getX();
		int y=getY();
		
		return "x:"+x+", y: "+y+", z: "+z; 
		}
}

//오버로딩(상속과 전혀 관계 없음): 한 클래스 내 동일한 이름을 사용하면서 매개변수가 서로 다른 메서드

//오버라이딩(상속 관계에서만 사용 가능): 부모 클래스에서 상속 받는 멤버 메서드를 재정의
//조건1-이름이 같아야함.
//조건2-매개변수가 같아야함.
//조건3-반환타입이 같아야함.
