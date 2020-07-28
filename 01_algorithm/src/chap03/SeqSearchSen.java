package chap03;
// 선형 검색(보초법)

import java.util.Scanner;

public class SeqSearchSen {
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;		//보초를 추가
		
		while(true) {
			if(a[i] == key)
				break;
			i++;
		}
		return i == n ? -1 : i;
	}
	
	static int seqSearchSen2(int[] a, int n, int key) {
		int i;
		a[n] = key;
		
		for(i = 0; a[i] != key; i++) {
			;
		}
		
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] x = new int[num + 1];			// 요솟수 num + 1
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = scan.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		}
	}
}
