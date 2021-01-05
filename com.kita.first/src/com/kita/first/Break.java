package com.kita.first;

public class Break {
	public static void main(String[] args) {
for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				for(int r = 0; r<3; r++) {
					System.out.printf("%d, %d, %d\n",i, j, r);
					if(j==1) {
						break;
				}
					
			}
		}
	}
	}
}

//같을때 continue결과
//0, 0, 0
//0, 0, 1
//0, 0, 2
//0, 2, 0
//0, 2, 1
//0, 2, 2
//1, 0, 0
//1, 0, 1
//1, 0, 2
//1, 2, 0
//1, 2, 1
//1, 2, 2