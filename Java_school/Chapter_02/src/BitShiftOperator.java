// 비트 연산자와 시프트 연산자
public class BitShiftOperator {

	public static void main(String[] args) {
		short a = (short)0x55ff;	// 0x55ff: 0101 0101 1111 1111
		short b = (short)0x00ff;	// 0x00ff: 0000 0000 1111 1111
		// 비트 연산 
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b)); 	// 비트 AND
		System.out.printf("%04x\n", (short)(a | b));	// 비트 OR
		System.out.printf("%04x\n", (short)(a ^ b));	// 비트 XOR
		System.out.printf("%04x\n", (short)(~a));		// 비트 NOT
		
		byte c = 20; 	// 0x14: 0001 0100
		byte d = -8;	// 0xf8: 1111 1000
		// 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c << 2);		// c를 2비트 왼쪽 시프트. 0으로 채움. c에 4를 곱한 결과
		System.out.println(c >> 2);		// c를 2비트 오른쪽 시프트. 최상위 비트인 1로 채움. c를 4 나눈 결과
		System.out.println(d >> 2);		// d를 2비트 오른쪽 시프트. 최상위 비트인 1로 채움. d를 4 나눈 결과
		System.out.printf("%x", (d >>> 2));	// d를 2비트 오른쪽 시프트. 0으로 채움. 시프트 연산 전에 int 타입으로 바뀌어 32비트의 ffff fff8이 된다.
	}

}
