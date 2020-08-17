package edu.handong.csee.java;

import java.util.Scanner;

public class Bigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdInt = new Scanner (System.in);
		
		int A,B;
		
		A = stdInt.nextInt();
		B = stdInt.nextInt();
		stdInt.close();

		if(A > B)
			System.out.println(">");
		else if(A<B)
			System.out.println("<");
		else if(A==B)
			System.out.println("==");
	}

}
