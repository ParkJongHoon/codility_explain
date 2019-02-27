package codility_explain.lesson1.iterations.binarygap;

public class ExecutorMain {
	/*
	 * 
	 * 문제 설명  
	 * 1) int N을 받아서 이진수로 바꾼다
	 * 2) 이진수로 바꾸었을 때 1과 1사이를 Gap이라고 정의하는데
	 * 최대 Gap을 반환한다
	 * 3) 몇가지 예
	 * - N=9이면 이진수로 1001이고 Gap은 2이고 반환값은 2이다
	 * - N=529이면 이진수로 100010001이고 Gap은 4와 3이고 반환값은 4이다
	 * - N=20이면 이진수로 10100이고 Gap은 1이고 반환값은 1이다
	 * - N=15이면 이진수로 1111이고 Gap은 존재하지 않고 반환값은 0이다
	 * - N=32이면 이진수로 100000이고 Gap은 존재하지 않고 반환값은 0이다
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(66561));

	}

}
