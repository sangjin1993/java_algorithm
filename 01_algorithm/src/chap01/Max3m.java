package chap01;

public class Max3m {
	// a, b, c의 최댓값을 구하여 반환합니다.
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		return max;
	}
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("3, 4, 5, 6의 최대값: " + max4(3, 4, 5, 6));
		System.out.println("3, 4, 5 의 최소값: " + min3(3, 4, 5));
		System.out.println("3, 4, 5, 6의 최소값: " + min4(3, 4, 5, 6));
	}
}
