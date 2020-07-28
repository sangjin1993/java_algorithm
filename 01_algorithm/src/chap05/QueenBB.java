package chap05;
// 각 행, 열에 1개의 퀀을 배치하는 조합을 재귀적으로 나열합니다.

public class QueenBB {
	static boolean[] flag = new boolean[8];		// 각 행에 퀀을 배치했는지 체크
	static int[] pos = new int[8];				// 각 열의 퀀의 위치
	
	// 각 열의 퀀의 위치를 출력합니다.
	static void print() {
		for(int i = 0; i < 8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	// i열의 알맞은 위치에 퀀을 배치합니다.
	static void set(int i) {
		for(int j = 0; j < 8; j++) {	// j행에는 퀀을 아직 배치하지 않았다면
			if(flag[j] == false) {		// 퀀을 j행에 배치합니다.
				pos[i] = j;				// 모든 열에 배치한 경우
				if(i == 7) {
					print();
				} else {
					flag[j] = true;
					set(i + 1);
					flag[j] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
