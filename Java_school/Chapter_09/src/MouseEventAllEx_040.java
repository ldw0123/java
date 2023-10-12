// Mouse �̺�Ʈ ó�� ��
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventAllEx_040 extends JFrame {
	private JLabel la = new JLabel("   Move Me"); 	// ���콺�� �̵���ų ���̺� ������Ʈ

	public MouseEventAllEx_040(){
		setTitle ("MouseListener�� MouseMotionListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		MyMouseListener listener = new MyMouseListener();	// ���콺/��� ������ ��ü ����
		c.addMouseListener(listener); 	// MouseListener ������ ���
		c.addMouseMotionListener(listener); //MouseMotionListener ������ ���

		c.setLayout(null);	// ��ġ�����ڸ� �����Ͽ� ���̺��� ������� ������ �� �ְ� ��
		la.setSize(80, 20);
		la.setLocation(100, 80);
		c.add(la); 		// ���̺� ������Ʈ ����

		setSize(320, 200);
		setVisible(true);
	}

	// Mouse �����ʿ� MouseMotion �����ʸ� ��� ���� ������ ����
	class MyMouseListener implements MouseListener, MouseMotionListener {
		// MouseListener�� 5�� �޼��� ����
		public void mousePressed(MouseEvent e) {
			la.setLocation(e.getX(), e.getY()); // ���콺�� ������ ��ġ�� ���̺� �̵�
			setTitle("mousePressed (" + e.getX() + "," + e.getY() + ")"); // ������ ��ġ ���
		}
		public void mouseReleased (MouseEvent e) {
			la.setLocation(e.getX(), e.getY()); // ���콺�� ������ ��ġ�� ���̺� �̵�
			setTitle("mouseReleased(" + e.getX() + "," + e.getY() + ")"); // ������ ��ġ ���
		}
		public void mouseClicked (MouseEvent e) {}
		public void mouseEntered (MouseEvent e) {
			Component comp = (Component)e.getSource();
			comp.setBackground(Color.CYAN); // ���콺�� �ö� �� �� ����
		}
		public void mouseExited (MouseEvent e) {
			Component comp = (Component)e.getSource();
			comp.setBackground(Color.YELLOW); // ���콺�� ������ �� �� ����
			setTitle("mouseExited" + e.getX() + "," + e.getY() + ")"); // ��� ��ġ ���
		}
		// MouseMotionListener�� 2�� �޼��� ����
		public void mouseDragged (MouseEvent e) { // ���콺�� �巡��Ǵ� ���� ��� ȣ��
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseDragged(" + e.getX()+ "," + e.getY() + ")"); // �巡�� ��ġ ���
		}
		public void mouseMoved (MouseEvent e) { // ���콺�� �����̴� ���� ��� ȣ��
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseMoved (" + e.getX() + "," + e.getY() + ")"); // ���� ��ġ ���
		}
	}

	public static void main(String[] args) {
		new MouseEventAllEx_040();
	}
}
