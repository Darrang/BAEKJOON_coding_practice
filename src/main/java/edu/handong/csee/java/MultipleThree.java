package edu.handong.csee.java;
import java.util.Scanner;


public class MultipleThree {

	public static void main(String[] args) {
		
	run();

	}

	
	public static void run() {
		
		Scanner stdInt = new Scanner(System.in);
		
		int multiple1,multiple2; //곱하는 숫자
		int first, second, third; //자리수
		int answer1, answer2, answer3, total;
		
		
		multiple1 = stdInt.nextInt(); //472
		multiple2 = stdInt.nextInt(); //385
		stdInt.close();

		third = multiple2 / 100; //  3
		second = (multiple2 % 100) / 10; // 8 
		first = (multiple2 % 100) %10; // 5
		
		// multiple2에 0이 있는지 검사 
		
		answer1 = multiple1 * third;
		answer2 = multiple1 * second;
		answer3 = multiple1 * first;
		total = multiple1 * multiple2;
		
		System.out.println(answer3);
		System.out.println(answer2);
		System.out.println(answer1);
		System.out.println(total);
	}
	
	
	
}

/*
 *
 * 세 자리 수 곱셈
 * 
 * 472
 * 385
 * 
 * 2360 ------ 472 * 5
 * 3776 ------ 472 * 8
 * 1416 ------ 472 * 3
 * 
 * 181720 
 * 
 */