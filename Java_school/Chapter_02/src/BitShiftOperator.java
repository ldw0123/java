// ��Ʈ �����ڿ� ����Ʈ ������
public class BitShiftOperator {

	public static void main(String[] args) {
		short a = (short)0x55ff;	// 0x55ff: 0101 0101 1111 1111
		short b = (short)0x00ff;	// 0x00ff: 0000 0000 1111 1111
		// ��Ʈ ���� 
		System.out.println("[��Ʈ ���� ���]");
		System.out.printf("%04x\n", (short)(a & b)); 	// ��Ʈ AND
		System.out.printf("%04x\n", (short)(a | b));	// ��Ʈ OR
		System.out.printf("%04x\n", (short)(a ^ b));	// ��Ʈ XOR
		System.out.printf("%04x\n", (short)(~a));		// ��Ʈ NOT
		
		byte c = 20; 	// 0x14: 0001 0100
		byte d = -8;	// 0xf8: 1111 1000
		// ����Ʈ ����
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c << 2);		// c�� 2��Ʈ ���� ����Ʈ. 0���� ä��. c�� 4�� ���� ���
		System.out.println(c >> 2);		// c�� 2��Ʈ ������ ����Ʈ. �ֻ��� ��Ʈ�� 1�� ä��. c�� 4 ���� ���
		System.out.println(d >> 2);		// d�� 2��Ʈ ������ ����Ʈ. �ֻ��� ��Ʈ�� 1�� ä��. d�� 4 ���� ���
		System.out.printf("%x", (d >>> 2));	// d�� 2��Ʈ ������ ����Ʈ. 0���� ä��. ����Ʈ ���� ���� int Ÿ������ �ٲ�� 32��Ʈ�� ffff fff8�� �ȴ�.
	}

}
