package chapter8;

import java.io.File;

public class Ex12 {

	public static void main(String[] args) {
//		File file1=new File("C:\\Users\\ITPS\\Desktop\\test.txt");
//		File file2=new File("C:\\Users\\ITPS\\Desktop","test.txt");
//		
//		//디렉토리->윈도우에서는 폴더라고 부름
//		File directory =new File("C:\\Users\\ITPS\\Desktop");
//		File file3=new File(directory,"test.txt");
		
		
		File directory=new File("src\\chapter8\\");
		//파일 이름을 이렇게 따로 만듬
		String fileName="Ex12.java";
		//Ex12.java라는 소스파일을 객체로 만듬
//		File file=new File(path,fileName);
//		String path="C:\\Users\\ITPS\\eclipse-workspace\\2021-03-29\\src\\chapter8\\Ex12.java";
		File file=new File(directory,fileName);
//		File file=new File(path);
//		String fileName=file.getName();
		
		int position =fileName.lastIndexOf(".");
		
		System.out.println("경로를 제외한 파일이름-"+fileName);
		//substring->문자열을 잘라주는 메서드, substring(시작번호,끝번호)
		System.out.println("확장자를 제외한 파일이름-"+fileName.substring(0,position));
		System.out.println("확장자-"+fileName.substring(position+1));
		System.out.println();
		
		System.out.println("경로를 포함한 파일 이름-"+file.getPath());//처음에 경로를 절대경로로 입력해서 아래와 같게 나옴.
		System.out.println("파일의  절대 경로-"+file.getAbsolutePath());//파일의 최상위 위치부터 알려줌.
		System.out.println("파일이 속해 있는 디렉토리-"+file.getParent());
		System.out.println();
		
		//getProperty-현재 이 프로그램이 어디에서 실행중이지?
		System.out.println("user.dir-"+System.getProperty("user.dir"));

	}

}
