// 3*3 구구단 3

package p220127;

public class Day06_05 {
	public class Day07_01 {
		public static void main(String[] args) {
			// 06일차-실습-2-해답 3 * 3 구구단 
			for (int m = 0; m < 3; m++) {    // m 변수는 0,1,2 로 변환됨
				System.out.println((3 * m + 1) + "단\t\t" + (3 * m + 2) + "단\t\t" + (3 * m + 3) + "단\t\t");
				//
				for (int n = 1; n <= 9; n++) {    // n 변수는 1,2,3,4,5,6,7,8,9 로 변환됨
					System.out.println(
							(3 * m + 1) + " * " + n + " = " + (3 * m + 1) * n + "\t" + 
							(3 * m + 2) + " * " + n + " = " + (3 * m + 2) * n + "\t" + 
							(3 * m + 3) + " * " + n + " = " + (3 * m + 3) * n + "\t");
					//        (3 * m + 1) 1                     (3 * m + 1) 1  
					//        (3 * m + 2) 2                     (3 * m + 2) 2  
					//        (3 * m + 3) 3                     (3 * m + 3) 3  
				}
				System.out.println();// 한 블럭을 출력한 후 줄바꿈
			}
		}
	}
}
