package chap05;
// 각 열에 1개의 퀀을 배치하는 조합을 재귀적으로 나열합니다.

public class QueenB {
	static int[] pos = new int[8];	// 각 열의 퀀의 위치
	
	// 각 열의 퀀의 위치를 출력합니다.
	static void print() {
		for(int i = 0; i < 8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	// i열에 퀀을 놓습니다.
	static void set(int i) {
		for(int j = 0; j < 8; j++) {
			pos[i] = j;
			if(i == 7) {
				print();
			} else {
				set(i + 1);		//다음 열에 퀀을 배치합니다.
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);		// 0열에 퀀을 배치합니다.
	}
}
