package edu.handong.csee.java;
import java.util.Scanner;

public class AddAB {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("A의 값:");  int A = stdIn.nextInt();
		System.out.print("B의 값:");  int B = stdIn.nextInt();
		int add = A+B;
		System.out.println( "A와 B의 합: " + add);
	}

}
