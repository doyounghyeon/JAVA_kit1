package com.kita.first.Practice;

public class Practice28 {
	public static void main(String[] args) {
//		국어합계: ?, 평균: ? 00.0
//		수학합계: ?, 평균: ?
//		영어합계: ?, 평균: ?
//		전체합계: ?, 평균: ?
		int sum = 0;
		int[][] arr = {{90, 100, 88},   		//국어  00 01 02
						{34, 99, 45}, 			//수학  10 11 12
						{89, 65, 74}			//영어  20 21 22 
					};
		String[] clsArr = {"국어", "수학", "영어"};
		int[] sumArr = new int[clsArr.length];
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++){
				sumArr[i] += arr[i][j];
				}
			System.out.printf("%s합계: %d, 평균: %.1f\n", clsArr[i], sumArr[i], ((float)sumArr[i]/arr[i].length));
		}
		int totalSum =0;
		int totalCount = 0;
		for(int i=0; i <sumArr.length; i++) {
			totalSum += sumArr[i];
			totalCount += arr[i].length;
		}
		
		System.out.printf("전체합계: %d, 평균: %.1f\n", totalSum, (float)totalSum/totalCount);
		
  }
}
