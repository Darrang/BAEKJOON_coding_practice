package edu.handong.csee.java;
import java.util.Scanner;
public class Main_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdInt = new Scanner(System.in);
		
		int A = 0,B = 0;
		int N = 0;
		
		
		N = stdInt.nextInt();
		stdInt.close();

		int[] array = new int[N];
		
		for(int i=0; i<N; i++) {
			
			A = stdInt.nextInt();
			B = stdInt.nextInt();
			
			array[i] = A+B;
		}
		
		
		for(int i=0 ; i<N;i++) {
			System.out.println(array[i]);
		}
		
	}

}
