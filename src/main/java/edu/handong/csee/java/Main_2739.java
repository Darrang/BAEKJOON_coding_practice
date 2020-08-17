package edu.handong.csee.java;
import java.util.Scanner;

public class Main_2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		Scanner stdInt = new Scanner(System.in);
		
		int N = stdInt.nextInt();
		
		stdInt.close();
		
		for(int i=1; i<10; i++) {
			System.out.println(N + " * " + i + " = " + N * i);
		}
	
	}

}
