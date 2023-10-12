// 익명 클래스로 Action 이벤트 리스너 만들기
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener_040 extends JFrame {
	public AnonymousClassListener_040() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);

		// 익명 클래스로 Action리스너 작성
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");

				// AnonymousclassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
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
