//Stack & Queue Ȱ�� ����2
import java.util.*;

public class Ex11_4 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; 	// Queue�� �ִ� 5�������� ����ǵ��� �Ѵ�

	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�");

		while(true) { 	// ���ѹݺ���
			System.out.print(">>");
			try {
				// ȭ�����κ��� ���� ������ �Է¹޴´�
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();

				if("".equals(input)) continue; 	// �Է� ������ ������ �Ʒ��� if-else���� �ǳʶٰ� �� ���� true�� �̵�

				if(input.equalsIgnoreCase("q")) { 	// q�� �Է��ϸ� ����
					// equalsIgnoreCase(): ��ҹ��� ������� ��
					System.out.println(" ���α׷��� �����մϴ�");
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ �����ݴϴ�");
					System.out.println(" q �Ǵ� Q - ���α׷��� �����մϴ�");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ " + MAX_SIZE + "�� �����ݴϴ�");
				} else if(input.equalsIgnoreCase("history")) {
					// �Է¹��� ��ɾ �����ϰ�,
					save(input);

					//LinkedList�� ������ �����ش�
					LinkedList list = (LinkedList)q;  //Queue Ÿ�Կ��� LinkedList Ÿ������ �������� ����ȯ

					final int SIZE = list.size();
					for(int i = 0; i < SIZE; i++)
						System.out.println((i+1) + "." + list.get(i));	// ���ʴ�� ��ȣ ���̱�
				} else {
					save(input);
					System.out.println(input);
				} // if(input.equalsIgnoreCase("q")) {
			} catch(Exception e) {
				System.out.println("�Է� �����Դϴ�");
			}
		} // while(true)
	} // main

	public static void save(String input) {
		// queue�� �����Ѵ�
		if(!"".equals(input)) 	// �� ���ڿ��� �ƴ� ��
			q.offer(input);

		// queue�� �ִ� ũ�⸦ ������ ���� ó�� �Էµ� ���� �����Ѵ�
		if(q.size() > MAX_SIZE) 	// size()�� Collection�������̽��� ����
			q.remove(); 	// q.poll();�� ����
	}
} // end of class
