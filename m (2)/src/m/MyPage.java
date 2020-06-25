package m;


import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MyPage {

	private JFrame frame;
	private JButton btn_home;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyPage window = new MyPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		URL url = this.getClass().getResource("../image/mypage.jpg");
		String path = url.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로 
		Image image = new ImageIcon(path).getImage();

	
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 986, 597);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		URL url1 = this.getClass().getResource("../image/ReturnLate.png");
		String path1 = url1.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로 
		Image image1 = new ImageIcon(path1).getImage();
		
		
		
		JLabel lbl_MyPage_Background = new JLabel(new ImageIcon(image.getScaledInstance(978, 600, Image.SCALE_SMOOTH)));
		lbl_MyPage_Background.setBounds(0, 0, 986, 597);
		panel.add(lbl_MyPage_Background);
		
		btn_home = new JButton("New button");
		btn_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				home.main(null);
								
			}
		});
		
		
		btn_home.setBorderPainted(false);
	    btn_home.setContentAreaFilled(false);
	    btn_home.setFocusPainted(true);
		
		
		
		btn_home.setBounds(12, 10, 74, 63);
		panel.add(btn_home);
		
		JButton btn_complete = new JButton("New button");
		btn_complete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				JOptionPane.showMessageDialog(null, "반납하시겠습니까? ", "반납", JOptionPane.INFORMATION_MESSAGE);// 경고메세지
				JOptionPane.showMessageDialog(null, "반납이 완료되었습니다. ", "반납", JOptionPane.INFORMATION_MESSAGE);// 경고메세지
				
								
			}
		});

		btn_complete.setBorderPainted(false);
	    btn_complete.setContentAreaFilled(false);
	    btn_complete.setFocusPainted(true);
		
		btn_complete.setBounds(532, 504, 288, 41);
		panel.add(btn_complete);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("돋움", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(435, 123, 135, 41);
		panel.add(lblNewLabel);
//		//// 
		
	}
}
