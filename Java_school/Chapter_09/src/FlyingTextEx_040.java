// KeyListener 활용
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx_040 extends JFrame {
	private JLabel la = new JLabel("Hello"); 	// 키 입력에 따라 움직일 레이블 컴포넌트
	
	public FlyingTextEx_040() {
		super("상, 하, 좌, 우 키를 이용하여 텍스트 움직이기"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); 		// 컨텐트팬의 배치관리자 삭제
		c.addKeyListener(new MyKeyListener());	// 컨텐트팬에 키 리스너 달기
		la.setLocation(50, 50); 	// 레이블의 초기 위치는 (50, 50)
		la.setSize(100,20);
		c.add(la);
		setSize(200, 200);
		setVisible(true);
		
		c.setFocusable(true); 	// 컨텐트팬이 포커스를 받을 수 있도록 설정
		c.requestFocus(); 		// 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
	}
	
	class MyKeyListener extends KeyAdapter { 	// Key 리스너 구현
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode(); 	// 입력된 키의 코드를 알아낸다
			switch(keyCode) { 	// 키 코드에 따라 상, 하, 좌, 우 키 판별, 레이블의 위치 이동
			case KeyEvent.VK_UP: 		// UP키
				la.setLocation(la.getX(), la.getY() - 10); break;
			case KeyEvent.VK_DOWN: 		// DOWN키
				la.setLocation(la.getX(), la.getY() + 10); break;
			case KeyEvent.VK_LEFT: 		// LEFT키
				la.setLocation(la.getX() - 10, la.getY()); break;
			case KeyEvent.VK_RIGHT: 	// RIGHT키
				la.setLocation(la.getX() + 10, la.getY()); break;
			}
		}
	}
	
	public static void main(String[] args) {
		new FlyingTextEx_040();
	}

}
