import javax.swing.*;
import java.awt.*;

public class Ex1404 extends JFrame {
	
	public Ex1404() {
		setTitle("계산기");
		setSize(300, 250);
		
		//제목 페널
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 300, 40);
		add(titlePanel);
		JLabel title = new JLabel("계산기, JLabel.CENTER");
		title.setFont(new Font("함초롱돋음", Font.BOLD, 20));
		titlePanel.add(title);
		
		
		//숫자 페널
		JPanel numPanel = new JPanel();
		numPanel.setBounds(0, 40, 300, 40);
		//추가
		numPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		add(numPanel);
		
		
		JTextField num1 = new JTextField(5);
		numPanel.add(num1);
		JTextField num2 = new JTextField(5);
		numPanel.add(num2);
		
		//버튼
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(100, 80, 100, 80);
		//추가
		btnPanel.setLayout(new GridLayout(2, 2, 10, 5));
		
		add(btnPanel);
		JButton plus = new JButton("+");
		btnPanel.add(plus);
		JButton minus = new JButton("-");
		btnPanel.add(minus);
		
		
		JPanel btnPanel2 = new JPanel();
		btnPanel.setBounds(0, 120, 300, 40);
		add(btnPanel2);
		JButton muit = new JButton("*");
		btnPanel2.add(muit);
		JButton div = new JButton("/");
		btnPanel2.add(div);
		
		
		JPanel resPanel1 = new JPanel();
		resPanel1.setBounds(0, 160, 300, 40);
		add(resPanel1);
		JLabel lbl1 = new JLabel("결과값: ");
		resPanel1.add(lbl1);
		JLabel lbl2 = new JLabel("");
		resPanel1.add(lbl2);
	
		//프레임 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex1404();

	}

}
