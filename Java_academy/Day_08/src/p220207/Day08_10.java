// p.128

package p220207;

public class Day08_10 {

	public static void main(String[] args) {

		// �迭 ����
		String[] names = {"ȫ�浿", "�̼���", "������"};
		int[] scores = {90, 80, 100};
		
		int i = 0; 		// �ε��� ���� 
		for (String name : names) { 		// names�� name�� �����ϰ� �ݺ�
			System.out.println(name + ": " + scores[i]);
			i++;
		}

	}

}
