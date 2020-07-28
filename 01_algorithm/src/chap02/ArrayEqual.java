package chap02;

import java.util.Scanner;

public class ArrayEqual {
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	static void copy(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println("배열a를 복사했습니다.");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int numA = scan.nextInt();
		
		int[] a = new int[numA];
		
		for(int i = 0; i < numA; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = scan.nextInt();
		}
		
		System.out.print("배열 b의 요솟");
		int numB = scan.nextInt();
		
		int[] b = new int[numB];
		
		for(int i = 0; i < numB; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = scan.nextInt();
		}
		
		System.out.println("배열 a와 b는 " + (equals(a, b) ? "같습니다" : "같지 안습니다."));
		
		
	}
}
