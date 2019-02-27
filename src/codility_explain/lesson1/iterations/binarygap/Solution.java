package codility_explain.lesson1.iterations.binarygap;
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

/*
 * Ǯ��
 * 1) 2���� 0��°���� n��°���� ���� �ϳ��ϳ��� ������ Ȯ���Ѵ� (1���� ����)
 * 2) count�� 0�� ��, 1�� ���ڰ� ���� �ε��� i�� startSpot�� �ִ´�.
 * 3) count�� 1�� ��, 1�� ���ڰ� ���� �ε��� i�� endSpot�� �ִ´�.
 *    �׸��� endSpot - startSpot ���� gap�� �ִ´�
 * 4) count�� 2�̻� �� ��, �б�� ������
 *  4-1) (i - endSpot -1) > gap 
 *  gap = i -endSpot -1; //gap �϶� gap �ִ밪�� ����
    startSpot = endSpot;  //startSpot�� ���� endSpot�� �ִ´�
    endSpot = i; //endSpot�� i�� �ִ´�						
    count++; (������)
    4-2) (i - endSpot -1) <= gap
    startSpot = endSpot;  //startSpot�� ���� endSpot�� �ִ´�
    endSpot = i; //endSpot�� i�� �ִ´�						
    count++; (������)
    
 * 5) count�� 0 �Ǵ� 1 �϶� return 0���� ��ȯ�ϰ� count�� 2�̻��̸� gap�� ��ȯ�Ѵ� 
 * 
 *   
 * ����
 * 1) ���� �̹����� �����Ϸ��� �Ҷ� ��ġ���� �迭�̳� ����Ʈ�� ��Ƽ�
 * for���� �����ų� Iteator�� ���� ������ ������ �̹� �տ��� for����
 * ���ȱ� ������ for���� �� �� ������ �ڵ庸�� ������ ��������.
 * �� ��� for���� �� �� ���� �� 2���� �������� gap���� �׶�����
 * ���Ͽ� �����ϴ� ���� �� ȿ�����̴�.
 */

class Solution {
	public int solution(int N){
		
		String binaryString = Integer.toBinaryString(N);
		int startSpot = 0;
		int endSpot = 0;
		int count =0;
		int gap = 0;
		for (int i =0; i<binaryString.length(); i++){
			if (binaryString.charAt(i) =='1'){
				if (count ==0){
					startSpot = i;
					count++;	
				} else if (count == 1){
					endSpot = i;
					gap = endSpot - startSpot -1;
					count++;
				} else {
					if((i - endSpot -1) > gap){
						gap = i -endSpot -1;
						startSpot = endSpot;
						endSpot = i;						
						count++;
					} else {
						startSpot = endSpot;
						endSpot = i;						
						count++;
					}
				}
				
			}
		}
		
		if(count ==0 || count ==1)
			return 0;
		else
			return gap;		
	}

}
