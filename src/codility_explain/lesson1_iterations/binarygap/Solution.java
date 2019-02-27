package codility_explain.lesson1_iterations.binarygap;
/*
 * 
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

/*
 * 풀이
 * 1) 2진수 0번째부터 n번째까지 문자 하나하나를 돌려서 확인한다 (1인지 여부)
 * 2) count가 0일 때, 1인 문자가 나온 인덱스 i를 startSpot에 넣는다.
 * 3) count가 1일 때, 1인 문자가 나온 인덱스 i를 endSpot에 넣는다.
 *    그리고 endSpot - startSpot 값을 gap에 넣는다
 * 4) count가 2이상 일 때, 분기로 나눈다
 *  4-1) (i - endSpot -1) > gap 
 *  gap = i -endSpot -1; //gap 일때 gap 최대값을 삽입
    startSpot = endSpot;  //startSpot에 기존 endSpot을 넣는다
    endSpot = i; //endSpot에 i를 넣는다						
    count++; (수증가)
    4-2) (i - endSpot -1) <= gap
    startSpot = endSpot;  //startSpot에 기존 endSpot을 넣는다
    endSpot = i; //endSpot에 i를 넣는다						
    count++; (수증가)
    
 * 5) count가 0 또는 1 일때 return 0으로 반환하고 count가 2이상이면 gap을 반환한다 
 * 
 *   
 * 함정
 * 1) 보통 이문제를 접근하려고 할때 위치값을 배열이나 리스트로 담아서
 * for문을 돌리거나 Iteator로 돌릴 생각을 하지만 이미 앞에서 for문을
 * 돌렸기 때문에 for문을 한 개 돌리는 코드보다 성능이 떨어진다.
 * 이 경우 for문을 한 번 돌릴 때 2개의 지점값과 gap값을 그때마다
 * 비교하여 관리하는 것이 더 효율적이다.
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
