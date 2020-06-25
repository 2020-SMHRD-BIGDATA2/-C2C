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

public class Return {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Return window = new Return();
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
	public Return() {
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
		
		
		URL url = this.getClass().getResource("../image/rtrn_office.jpg");
		String path = url.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로 
		Image image = new ImageIcon(path).getImage();
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 986, 597);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		URL url1 = this.getClass().getResource("../image/rtrn_banner.png");
		String path1 = url1.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로 
		Image image1 = new ImageIcon(path1).getImage();
		
		JLabel lbl_Message = new JLabel(new ImageIcon(image1.getScaledInstance(300, 79, Image.SCALE_SMOOTH)));
		lbl_Message.setBounds(429, 188, 422, 95);
		panel.add(lbl_Message);
		lbl_Message.setVisible(false); // 이미지 지우기
		
		JButton btn_YJ = new JButton("");
		btn_YJ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_Message.setVisible(false); // 이미지 지우기
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_Message.setVisible(true);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "반납하시겠습니까? ", "반납", JOptionPane.INFORMATION_MESSAGE);// 경고메세지
				
			}
		});
		btn_YJ.setBounds(498, 275, 44, 65);
		panel.add(btn_YJ);
		btn_YJ.setBorderPainted(false); // 버튼 사라짐
		btn_YJ.setContentAreaFilled(false); // 버튼 사라짐
		
		URL url2 = this.getClass().getResource("../image/rtrn_banner.png");
		String path2 = url2.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로 
		Image image2 = new ImageIcon(path2).getImage();
		
		JLabel lbl_Message2 = new JLabel(new ImageIcon(image2.getScaledInstance(300, 79, Image.SCALE_SMOOTH)));
		lbl_Message2.setBounds(640, 251, 346, 107);
		panel.add(lbl_Message2);
		lbl_Message2.setVisible(false); // 이미지 지우기
		
		
		JButton btn_NG = new JButton("");
		btn_NG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_Message2.setVisible(false); // 이미지 지우기
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_Message2.setVisible(true);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "반납하시겠습니까? ", "반납", JOptionPane.INFORMATION_MESSAGE);// 경고메세지
			}
		});
		btn_NG.setBounds(666, 331, 44, 65);
		panel.add(btn_NG);
		btn_NG.setBorderPainted(false); // 버튼 사라짐
		btn_NG.setContentAreaFilled(false); // 버튼 사라짐
		
		
		
		JLabel lbl_Background = new JLabel(new ImageIcon(image.getScaledInstance(978, 600, Image.SCALE_SMOOTH)));
		lbl_Background.setBounds(0, 0, 986, 600);
		panel.add(lbl_Background);
		
		JButton btn_home = new JButton("New button");
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
		
		
		btn_home.setBounds(33, 10, 75, 65);
		panel.add(btn_home);
		
		
		
		
		
		
		
		
	}

}
