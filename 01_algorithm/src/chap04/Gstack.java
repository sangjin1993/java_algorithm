package chap04;

public class Gstack<E> {
	private int max;	//스택의 용량
	private int ptr;	// 스택 포인터
	private E[] stk;	// 스택 본체
	
	// 실행할 때 예외: 스택이 비어 있음
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException( ) {
			
		}
	}
	
	// 실행할 때 예외: 스택이 가득 참
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {
			
		}
	}
	
	// 생성자
	public Gstack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max];	// 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없습니다.
			max = 0;
		}
	}
	
	// 스택에 x를 푸쉬
	public E push(E x) throws OverflowGstackException {
		if (ptr >= max) {	// 스택이 가득 
			throw new OverflowGstackException();
		}
		return stk[ptr++] = x;
	}
	
	// 스택에서 데이터를 팝(꼭대기의 데이터를 꺼냄)
	public E pop() throws EmptyGstackException {
		if(ptr <= 0) {
			throw new EmptyGstackException();
		}
		return stk[--ptr];
	}
	
}
