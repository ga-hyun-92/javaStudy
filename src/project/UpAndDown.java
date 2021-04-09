package project;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		//컴퓨터가  1~100 사이의 수 중 하나의 수를 선택한다.
		Random random=new Random();
		
		System.out.println("숫자를 고르고 있어요");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//0~99사이의 임의의 수가 만들어짐
		int num =random.nextInt(100)+1;
		
		System.out.println("숫자를 골랐어요!");
		
		boolean correct=false;
		Scanner scanf=new Scanner(System.in);
		//기회는 5번
		//내가 작성한 코드
//		int count=0;
		/*
		 * while (count<=5) {
		 * 
		 * //사용자는 컴퓨터가 선택한 수를 맞춰야한다. System.out.println("컴퓨터가 선택한 수를 맞춰보세요(1~100): ");
		 * int userInput=scanf.nextInt(); if (userInput>num) {
		 * System.out.println("적은 숫자를 입력해주세요!"); } else if(userInput<num){
		 * System.out.println("큰 숫자를 입력해주세요!"); } else if (userInput==num) {
		 * System.out.println("정답입니다!"); }
		 * 
		 * count++; }
		 */
			
		int diff;
			for (int i = 1; i <=5; i++) {
				System.out.println("컴퓨터가 선택한 수를 맞춰보세요(1~100)"+i+"번: ");
				int userInput=scanf.nextInt();
				diff=num-userInput;
				if (1<=diff && diff<=5) {
					System.out.println("제가 생각한 숫자와 비슷해요");
					System.out.println("큰 숫자를 입력해주세요");
				} else if (-5<=diff && diff<=-1) {
					System.out.println("제가 생각한 숫자와 비슷해요");
					System.out.println("작은 숫자를 입력해주세요");
				}else if (userInput>num) {
					//사용자가 입력한 수가 컴퓨터가 선택한 수보다 크다면
					//컴퓨터는 "적은 숫자를 입력해주세요!"라고 출력하고
					System.out.println("적은 숫자를 입력해주세요!");
//					if (Math.abs(userInput-num)<=5) {
//						System.out.println("제가 생각한 숫자와 비슷해요");
//					}
				} else if(userInput<num){
					//사용자가 입력한 수가 컴퓨터가 선택한 수보다 작다면
					//컴퓨터는 "큰 숫자를 입력해주세요!"라고 출력하세요.
					System.out.println("큰 숫자를 입력해주세요!");
//					if (Math.abs(userInput-num)<=5) {
//						System.out.println("제가 생각한 숫자와 비슷해요");
//					}
				} else if (userInput==num) {
					//사용자가 입력한 수가 컴퓨터가 선택한 수라면
					//컴퓨터는 "정답입니다!"라고 출력하세요.
					System.out.println("정답입니다!");
					correct=true;
				}
				
			}
		
			if (!correct) {
				System.out.println("제가 선택한 숫자는 "+num+"입니다");
				System.out.println("다음에 다시 도전해주세요");
			}
			
		scanf.close();
		
				

	}

}
