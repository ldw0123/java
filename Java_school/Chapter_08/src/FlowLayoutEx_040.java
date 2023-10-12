// FlowLayout ��ġ������
import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx_040 extends JFrame {
	public FlowLayoutEx_040() {
		setTitle("FlowLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane(); 	// ����Ʈ�� �˾Ƴ���
		
		// ���� ���ķ�, ���� ������ 30, ���� ������ 40 �ȼ��� ��ġ�ϴ� FlowLayout ����
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("divide"));
		
		setSize(300, 200); 		// ������ ũ�� 300x200 ����
		setVisible(true);	 	// ȭ�鿡 ������ ���
	}

	public static void main(String[] args) {
		new FlowLayoutEx_040();
	}
}
