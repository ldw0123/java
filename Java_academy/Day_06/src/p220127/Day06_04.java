// 3*3 구구단 2

package p220127;

public class Day06_04 {

	public static void main(String[] args) {

		for(int i = 1; i < 10; i = i+3) {
			System.out.println(i + "단\t" + (i+1) +"단\t" + (i+2) +"단\t");
			
			for(int j = 1; j < 10; j++) {
				
				for(int k = i; k < i+3; k++) {
					System.out.print(k + "*" + j + "=" + j * k + "\t");    
				}
				
				System.out.println();    
			}
			
			System.out.println();   
		}   
	}
}