package m;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.net.URL;

public class home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
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
	public home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	//프레임
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 988, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 978, 600);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		

		//공지사항 버튼
		JButton btn_notice = new JButton("");
		btn_notice.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				
				frame.dispose();
				notice.main(null);
				
			}

		});
		
		btn_notice.setBorderPainted(false);
	    btn_notice.setContentAreaFilled(false);
	    btn_notice.setFocusPainted(true);
		
		
		btn_notice.setBounds(0, 506, 266, 94);
		panel.add(btn_notice);
		
	      
		JButton btn_pay = new JButton("\uACB0\uC81C");
		btn_pay.setBounds(272, 500, 231, 100);
		panel.add(btn_pay);
		
		JButton btn_wait = new JButton("\uBC18\uB0A9\uB300\uAE30");
		btn_wait.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MyPage.main(null);
			}
		});
		btn_wait.setBounds(508, 500, 240, 100);
		panel.add(btn_wait);
		
		JButton btn_return = new JButton("\uBC18\uB0A9\uD558\uAE30");
		btn_return.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				Return.main(null);
				
				
			}
		});
		btn_return.setBounds(756, 500, 222, 100);
		panel.add(btn_return);
		
		
		URL url = this.getClass().getResource("../image/retal_banner.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();
		JLabel lbl_kn = new JLabel(new ImageIcon(image.getScaledInstance(400,250 , Image.SCALE_SMOOTH)));		

		
		JButton btn_kn = new JButton("");
		
		btn_kn.setBorderPainted(false);
	    btn_kn.setContentAreaFilled(false);
	    btn_kn.setFocusPainted(true);
	    
	    lbl_kn.setVisible(false); //이미지 지우기
		btn_kn.addMouseListener(new MouseAdapter() {
			
			public void mouseExited(MouseEvent e) {
				lbl_kn.setVisible(false); //이미지 지우기
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_kn.setVisible(true);
						
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				kangnam.main(null);
				
			}
		

		});
		
		
		btn_kn.setBounds(575, 326, 30, 50);
		panel.add(btn_kn);
		
		
		lbl_kn.setBounds(555, 285, 231, 50);
		panel.add(lbl_kn);
		

		
		URL url1 = this.getClass().getResource("../image/seoul.jpg");
		String path1 = url1.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로 
		image = new ImageIcon(path1).getImage();
		JLabel lbl_seoul = new JLabel(new ImageIcon(image.getScaledInstance(978, 600, Image.SCALE_SMOOTH)));	
		
		
		lbl_seoul.setBounds(0, 0, 978, 600);
		panel.add(lbl_seoul);
		
		JButton btn_mypage = new JButton("New button");
		btn_mypage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				MyPage.main(null);
			}
		});
		
		btn_mypage.setBorderPainted(false);
	    btn_mypage.setContentAreaFilled(false);
	    btn_mypage.setFocusPainted(true);
		
		
		
		btn_mypage.setBounds(36, 10, 64, 62);
		panel.add(btn_mypage);
		

	}
}
