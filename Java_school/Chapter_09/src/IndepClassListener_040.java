// ���� Ŭ������ Action �̺�Ʈ ������ �����

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class IndepClassListener_040 extends JFrame {
	public IndepClassListener_040() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); 		// Action �̺�Ʈ ������ �ޱ�
		c.add(btn);
		
		setSize(250, 120);
		setVisible(true);
	}
	public static void main(String[] args) {
		new IndepClassListener_040();
	}

}

// ������ Ŭ������ �̺�Ʈ �����ʸ� �ۼ��Ѵ�
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource(); // �̺�Ʈ �ҽ� ��ư �˾Ƴ���
		if(b.getText().equals("Action"))	// ��ư�� ���ڿ��� "Action"���� ��
			b.setText("�׼�"); 				// ��ư�� ���ڿ��� "�׼�"���� ����
		else
			b.setText("Action"); 			// ��ư�� ���ڿ��� "Action"���� ����
				
	}
}