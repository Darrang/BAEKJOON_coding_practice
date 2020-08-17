package edu.handong.csee.java;
import java.util.Scanner;

public class Main_11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		//각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		
		Scanner stdInt = new Scanner(System.in);
		
		int N = stdInt.nextInt();
		
		int[] A = new int[N];
		int[] B = new int[N];
		
		int[] array = new int[N];
		stdInt.close();

		for(int i = 0; i < N; i++) {
			A[i] = stdInt.nextInt();
			B[i] = stdInt.nextInt();
			array[i] = A[i]+B[i];
		}
		
		for(int i=0; i<N; i++) {
			System.out.println("Case #" + (i+1) + ": " + A[i] + " + " + B[i] + " = " + array[i]);
		}
	
	}

}