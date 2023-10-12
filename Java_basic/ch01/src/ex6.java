// 6번 연습문제 별찍기

public class ex6 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for(int a=0; a<5; a++) {
			for(int b=0; b<5; b++) {
				if((a==0&&b==0)||(a==1&&b<2)||(a==2&&b<3)||(a==3&&b<4)||(a==4&&b<5)||(a==5&&b<6))
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for(int c=0; c<5; c++) {
			for(int d=0; d<5; d++) {
				if((c==0&&d<4)||(c==1&&d<3)||(c==2&&d<2)||(c==3&&d<1)||(c==4&&d<0)||(c==5&&d<0))
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for(int e=0; e<5; e++) {
			for (int f=0; f<9; f++) {
				if((e==0&&f==4)||(e==1&&f>2)&&(e==1&&f<6)||(e==2&&f>1)&&(e==2&&f<7)||(e==3&&f>0)&&(e==3&&f<8)||(e==4&&f<9))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		// 다이아몬드 상단
		for(int g = 0; g <= 3; g++){
			for(int h = g; h <= 2; h++){	// 상단 공백
				System.out.print(" ");
			}
			for(int h = 0; h < g; h++){		// 상단 별
				System.out.print("*");
			}
			for(int h = 0; h < g-1; h++){	// 상단 별
				System.out.print("*");
			}
			System.out.println();
		}
		// 다이아몬드 하단
		for(int g = 0; g <= 1; g++){
			for(int h = 0; h < g+1; h++){
				System.out.print(" ");
			}
			for(int h = g; h <= 1; h++){
				System.out.print("*");
			}
			for(int h = g+1; h <= 1; h++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}