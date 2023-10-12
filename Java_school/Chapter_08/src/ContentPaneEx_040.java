// 3���� ��ư ������Ʈ�� ���� ���� ������ �����
import javax.swing.*;
import java.awt.*;

public class ContentPaneEx_040 extends JFrame {
	public ContentPaneEx_040() {
		setTitle("ContentPane�� JFrame ����"); 		// ������ Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// ������ �����츦 ������ ���α׷� ����
		
		Container contentPane = getContentPane(); 	// ����Ʈ���� �˾Ƴ���
		contentPane.setBackground(Color.ORANGE); 	// �������� ��� ����
		contentPane.setLayout(new FlowLayout()); 	// ����Ʈ�ҿ� FlowLayout ��ġ������ �ޱ�
		
		contentPane.add(new JButton("OK")); 		// OK ��ư �ޱ�
		contentPane.add(new JButton("Cancel")); 	// Cancel ��ư �ޱ�
		contentPane.add(new JButton("Ignore")); 	// Ignore ��ư �ޱ�
		
		setSize(300, 150); 		// ������ ũ�� 300x150 ����
		setVisible(true); 		// ȭ�鿡 ������ ���
	}
	
	public static void main(String[] args) {
		// ContentPaneEx_040 cf = new ContentPaneEx_040();
		new ContentPaneEx_040(); 	// �̸� ���� ��ü
	}

}
