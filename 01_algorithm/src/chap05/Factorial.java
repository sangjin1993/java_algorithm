package chap05;
// 팩토리얼을 재귀적으로 구현

import java.util.Scanner;

public class Factorial {
	// 양의 정수 n의 팩토리얼을 반환합니다.
	static int factorial(int n) {
		if(n > 0) {
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}
	
	static int forFactorial(int n) {
		int result = 1;
		
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요. : ");
		int x = scan.nextInt();
		
		System.out.println(x + "의 팩도리얼은 " + factorial(x) + "입니다.");
		System.out.println(x + "의 팩도리얼은 " + forFactorial(x) + "입니다.");
	}
}
