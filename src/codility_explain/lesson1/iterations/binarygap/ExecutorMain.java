package codility_explain.lesson1.iterations.binarygap;

public class ExecutorMain {
	/*
	 * 
	 * ���� ����  
	 * 1) int N�� �޾Ƽ� �������� �ٲ۴�
	 * 2) �������� �ٲپ��� �� 1�� 1���̸� Gap�̶�� �����ϴµ�
	 * �ִ� Gap�� ��ȯ�Ѵ�
	 * 3) ��� ��
	 * - N=9�̸� �������� 1001�̰� Gap�� 2�̰� ��ȯ���� 2�̴�
	 * - N=529�̸� �������� 100010001�̰� Gap�� 4�� 3�̰� ��ȯ���� 4�̴�
	 * - N=20�̸� �������� 10100�̰� Gap�� 1�̰� ��ȯ���� 1�̴�
	 * - N=15�̸� �������� 1111�̰� Gap�� �������� �ʰ� ��ȯ���� 0�̴�
	 * - N=32�̸� �������� 100000�̰� Gap�� �������� �ʰ� ��ȯ���� 0�̴�
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.solution(66561));

	}

}
