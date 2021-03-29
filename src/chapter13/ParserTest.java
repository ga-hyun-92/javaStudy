package chapter13;

public class ParserTest {

	public static void main(String[] args) {
		Parseable parser=ParserManager.getParser("korean");
		parser.parse("한글파일이 들어있는 파일.pdf");
		
		parser=ParserManager.getParser("english");
		parser.parse("영어파일이 들어있는 파일.pdf");
	}

}
