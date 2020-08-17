package edu.handong.csee.java;
import java.util.Scanner;

public class Main_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
	
		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
	
		입력의 마지막에는 0 두 개가 들어온다.
	 */
	Scanner stdInt = new Scanner(System.in);
	int A = 0;
	int B = 0;
	int[] add = new int[1000];
	int i=0;
		
	do{
			A = stdInt.nextInt();
			B = stdInt.nextInt();
			add[i] = A+B;
			i++;
			
		}while(A != 0 && B != 0);
		
		for(int j=0;j<i-1;j++) {
			System.out.println(add[j]);
		}
		
	}

}
