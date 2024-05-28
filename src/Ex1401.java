import javax.swing.*;
import java.awt.*;

public class Ex1401 extends JFrame {
	
	public Ex1401() {
		setTitle("프레임 및 아이콘");
		setSize(600, 300);
//		setDefaultCloseOperation(0);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		add(panel);
		
		setIconImage(new ImageIcon("Coca-Cola pug").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex1401();
	}

}
