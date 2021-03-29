package chapter13;

//인터페이스의 이름은 주로 맨 끝에 able을 붙인다.
public interface Parseable {
	//구문 분석 작업 수행
	public abstract void parse(String fileName);
}
