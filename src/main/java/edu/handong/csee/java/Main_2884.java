package edu.handong.csee.java;
import java.util.Scanner;

public class Main_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdInt = new Scanner(System.in);
		int input_hour, input_minutes;
		/*
		 * 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.

입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
		 */
		
		//1. 분이 45분보다 작은지 확인
		//2. 
		
		input_hour = stdInt.nextInt();
		input_minutes = stdInt.nextInt();
		
		stdInt.close();
	

	    if(input_minutes < 45) {
	    	input_hour--;
	    	input_minutes = 60 - (45- input_minutes);
	    	
	    	if(input_hour < 0)
				input_hour = 23;
	    	
	    	System.out.println(input_hour + " " + input_minutes);
	    	
	    }else {
	    
	    	System.out.println(input_hour + " " + (input_minutes - 45));
	    	
	    }
	    
	}

}
