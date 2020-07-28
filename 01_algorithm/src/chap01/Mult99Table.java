package chap01;

import java.util.Scanner;

public class Mult99Table {
	public static void main(String[] args) {
		System.out.print("   |");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		System.out.println("---+---------------------------");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%3d|", i);
			for(int j = 1; j <=9; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}
		System.out.println("====================================");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		int n = scan.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
