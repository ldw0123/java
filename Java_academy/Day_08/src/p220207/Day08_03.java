// p.120 2차원 배열

package p220207;

public class Day08_03 {

	public static void main(String[] args) {
		
		int[][] matrix1 = new int[3][3]; 		// 첫 번째
		
		matrix1[0][0] = 1;
		matrix1[0][1] = 2;
		matrix1[0][2] = 3;
		matrix1[1][0] = 4;
		matrix1[1][1] = 5;
		matrix1[1][2] = 6;
		matrix1[2][0] = 7;
		matrix1[2][1] = 8;
		matrix1[2][2] = 9;
		
		int [][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 	// 두 번째
		
		int [][] matrix3 = {		// 세 번째
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}		
		};
		
		System.out.println("[첫 번째]");
		for(int i = 0; i <matrix1.length; i++) {
			for (int j = 0; j <matrix1[i].length; j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("[두 번째]");
		for(int i = 0; i <matrix2.length; i++) {
			for (int j = 0; j <matrix2[i].length; j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("[세 번째]");
		for(int i = 0; i <matrix3.length; i++) {
			for (int j = 0; j <matrix3[i].length; j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
