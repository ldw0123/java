package p220127;

public class Day06_ex03 {

	public static void main(String[] args) {

		for( int i =1; i <= 3; i++) { 			// 1~3��
			System.out.print( i + "�� \t");
		}
		System.out.println();

		for (int i =1; i <=3; i++) {
			for ( int j = 1; j <=3; j++) {
				System.out.print( j + "*" + i + "="  + (j * i) + "\t");
			}
			System.out.println();
		}

		for (int i =4; i <=6; i++) {
			for ( int j = 1; j <=3; j++) {
				System.out.print( j + "*" + i + "="  + (j * i) + "\t");
			}
			System.out.println();
		}
		for (int i =7; i <=9; i++) {
			for ( int j = 1; j <=3; j++) {
				System.out.print( j + "*" + i + "="  + (j * i) + "\t");
			}
			System.out.println();
		}
		System.out.println();

		for( int i =4; i <= 6; i++) { 			// 4~6��
			System.out.print( i + "�� \t");
		}
		System.out.println();

		for (int i =1; i <=3; i++) {
			for ( int j = 4; j <=6; j++) {
				System.out.print( j + "*" + i + "="  + (j * i) + "\t");
			}
			System.out.println();
		}

		for (int i =4; i <=6; i++) {
			for ( int j = 4; j <=6; j++) {
				System.out.print( j + "*" + i + "="  + (j * i) + "\t");
			}
			System.out.println();
		}
		for (int i =7; i <=9; i++) {
			for ( int j = 4; j <=6; j++) {
				System.out.print( j + "*" + i + "="  + (j * i) + "\t");
			}
			System.out.println();
		}
		System.out.println();

		for( int i =7; i <= 9; i++) { 			// 7~9��
			System.out.print( i + "�� \t");
		}
		System.out.println();

		for (int i =1; i <=3; i++) {
			for ( int j = 7; j <=9; j++) {
				System.out.print( j + "*" + i + "="  + (j * i) + "\t");
			}
			System.out.println();
		}

		for (int i =4; i <=6; i++) {
			for ( int j = 7; j <=9; j++) {
				System.out.print( j + "*" + i + "="  + (j * i) + "\t");
			}
			System.out.println();
		}
		for (int i =7; i <=9; i++) {
			for ( int j = 7; j <=9; j++) {
				System.out.print( j + "*" + i + "="  + (j * i) + "\t");
			}
			System.out.println();
		}
	}
}