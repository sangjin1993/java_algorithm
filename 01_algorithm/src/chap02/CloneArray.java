package chap02;

public class CloneArray {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();
		
		b[3] = 0;
		
		System.out.print("a =");
		toString(a);
		System.out.print("b =");
		toString(b);
	}
	
	static void toString(int[] n) {
		for(int i = 0; i < n.length; i++) {
			System.out.print(" " + n[i]);
		}
		System.out.println();
	}
}
