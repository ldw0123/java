// �͸� Ŭ������ Action �̺�Ʈ ������ �����
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener_040 extends JFrame {
	public AnonymousClassListener_040() {
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);

		// �͸� Ŭ������ Action������ �ۼ�
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("�׼�");
				else
					b.setText("Action");

				// AnonymousclassListener�� ����� JFrame�� ����� ȣ���� �� ����
				setTitle(b.getText());
			}
		});

		setSize(200, 120);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymousClassListener_040();
	}
}
