package edu.handong.csee.java;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				Scanner stdIn = new Scanner(System.in);
				int A = stdIn.nextInt();
				int B = stdIn.nextInt();
				int C = stdIn.nextInt();
				stdIn.close();

				System.out.println((A+B)%C);
				System.out.println(((A%C) + (B%C))%C);
				System.out.println((A*B)%C);
				System.out.println(((A%C) * (B%C))%C);
	}

}
