package chap01;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("1부터 n까지의 합을 구합니다.");
//		System.out.printf("n의 값 : ");
//		int n = scan.nextInt();
//		
//		int sum = 0;
//		
//		for(int i = 1; i < n; i++) {
//			sum += i;
//			System.out.printf("%d + ", i);
//		}
//		System.out.printf("%d = ", n);
//		sum += n;
//		
//		System.out.printf("%d\n", sum);
//		
//		System.out.println(sumGauss(n));
		
		System.out.println(sumof(3, 5));
	}
	
	static int sumGauss(int n) {
		int sum = 0;
		int i = 1;
		
		sum = (i + n) * 5;
		
		return sum;
	}
	
	static int sumof(int a, int b) {
		int sum = 0;
		
		for(int i = (a > b) ? b : a; i <= ((a > b) ? a : b); i++) {
			sum += i;
			System.out.println(i);
		}
		
		return sum;
	}
}
