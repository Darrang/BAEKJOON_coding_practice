package edu.handong.csee.java;
import java.util.Scanner;

public class Main_11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdInt = new Scanner(System.in);
		
		int N = stdInt.nextInt();
		int A = 0,B = 0;
			
		int[] array = new int[N];
		stdInt.close();
		
		for(int i = 0; i < N; i++) {
			A = stdInt.nextInt();
			B = stdInt.nextInt();
			array[i] = A+B;
		}
		
		for(int i=0; i<N; i++) {
			System.out.println("Case #" + (i+1) + ": " + array[i]);
		}
	
	}

}
