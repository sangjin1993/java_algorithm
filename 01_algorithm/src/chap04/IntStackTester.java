package chap04;

import java.util.Scanner;

// int형 스택의 사용 예

public class IntStackTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.print("(1)푸쉬  (2)팝  (3)피크  (4)덤프  (0)종료 : ");
			int menu = scan.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
				case 1:
					System.out.print("데이터 : ");
					x = scan.nextInt();
					try {
						s.push(x);
					} catch (IntStack.OverFlowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
					
				case 2:
					try {
						x = s.pop();
						System.out.println("팝한 데이터는" + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				
				case 3:
					try {
						x = s.peek();
						System.out.println("픽한 데이터는 " + x + "입니다.");
					} catch(IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				
				case 4:
					s.dump();
					break;
			}
		}
	}

}
