package edu.handong.csee.java;
import java.util.Scanner;

public class Main_14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1사분면 ++, 2사분면 -+, 3사분면 --, 4사분면 +-
		Scanner stdInt = new Scanner(System.in);
		int first, second;
		
		first = stdInt.nextInt();
		second = stdInt.nextInt();
		stdInt.close();

		if(first>0 && second>0)
			System.out.println("1");
		else if(first<0 && second>0)
			System.out.println("2");
		else if(first<0 && second<0)
			System.out.println("3");
		else if(first>0 && second<0)
			System.out.println("4");
	}

}
