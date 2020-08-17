package edu.handong.csee.java;
import java.util.Scanner;

public class Main_8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdInt = new Scanner(System.in);
		
		int N = stdInt.nextInt();
		int add = 0;
		
		stdInt.close();
		
		for(int i=1;i <= N;i++) {
			
			add +=i;
			
		}
		
		System.out.println(add);
	}

}
