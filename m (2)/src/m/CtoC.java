package m;


import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class CtoC {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CtoC window = new CtoC();
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
	public CtoC() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 984, 599);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lbl_now = new JLabel("2201. \uC11C\uCD08\uAD6C \uBCF8\uB9C8\uC744 \uC815\uB958\uC18C \uC55E");
		lbl_now.setFont(new Font("돋움", Font.PLAIN, 25));
		lbl_now.setBounds(433, 36, 407, 34);
		panel.add(lbl_now);
		
		JComboBox cb_time = new JComboBox();
		cb_time.setBackground(Color.WHITE);
		cb_time.setModel(new DefaultComboBoxModel(new String[] {"  10\uBD84", "  15\uBD84", "  20\uBD84", "  30\uBD84"}));
		cb_time.setBounds(416, 246, 289, 34);
		panel.add(cb_time);
		
		JTextPane txt_CtoC = new JTextPane();
		txt_CtoC.setBackground(SystemColor.control);
		txt_CtoC.setText(" \uC804\uB2EC\uD560 \uBA54\uC138\uC9C0\uB97C \uC785\uB825\uD574\uC8FC\uC138\uC694.");
		txt_CtoC.setBounds(261, 339, 520, 119);
		panel.add(txt_CtoC);
		
		JButton btn_CtoC = new JButton("");
		btn_CtoC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "대여 예약 하시겠습니까? ", "대여 예약", JOptionPane.INFORMATION_MESSAGE);// 경고메세지
				frame.dispose();
				MyPage.main(null);
			}
		});
		btn_CtoC.setBounds(360, 491, 278, 40);
		panel.add(btn_CtoC);
		btn_CtoC.setBorderPainted(false); // 버튼 사라짐
		btn_CtoC.setContentAreaFilled(false); // 버튼 사라짐
		
		
//		-----------------------------------------------------------------------------------배경		
		URL url = this.getClass().getResource("../image/CtoC.jpg");
		String path = url.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로 
		Image image1 = new ImageIcon(path).getImage(); 
		panel.setLayout(null);
		
		JLabel lbl_CtoCBackground = new JLabel(new ImageIcon(image1.getScaledInstance(978, 600, Image.SCALE_SMOOTH)));
		lbl_CtoCBackground.setBounds(0, 0, 984, 599);
		panel.add(lbl_CtoCBackground);
		
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
		
		btn_home.setBounds(12, 10, 72, 60);
		panel.add(btn_home);
		
		
	}
}
