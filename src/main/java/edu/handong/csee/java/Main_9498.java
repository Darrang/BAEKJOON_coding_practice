package edu.handong.csee.java;
import java.util.Scanner;

public class Main_9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		Scanner stdInt = new Scanner(System.in);
		
		int grade;
		grade = stdInt.nextInt();
		stdInt.close();

		if(grade >= 90)
			System.out.println("A");
		else if(grade >= 80)
			System.out.println("B");
		else if(grade >= 70)
			System.out.println("C");
		else if(grade >= 60)
			System.out.println("D");
		else 
			System.out.println("F");
		
	}

}
