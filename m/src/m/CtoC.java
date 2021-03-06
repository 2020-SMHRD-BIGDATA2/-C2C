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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CtoC {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CtoC window = new CtoC();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public CtoC(CycleVO vo) {
		initialize(vo);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(CycleVO vo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 984, 599);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btn_CtoC = new JButton("");
		btn_CtoC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_CtoC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "반납 대기를 신청하시겠습니까? ", "반납 대기 예약", JOptionPane.INFORMATION_MESSAGE);// 경고메세지
				frame.dispose();
				kangnam kang = new kangnam(vo);
			}
		});
		btn_CtoC.setBounds(360, 491, 278, 40);
		panel.add(btn_CtoC);
		btn_CtoC.setBorderPainted(false); // 버튼 사라짐
		btn_CtoC.setContentAreaFilled(false); // 버튼 사라짐

//		-----------------------------------------------------------------------------------배경		
		URL url = this.getClass().getResource("../image/rtn_waitform.jpg");
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
				home home = new home(vo);
				home.frame.setVisible(true);

			}
		});

		btn_home.setBorderPainted(false);
		btn_home.setContentAreaFilled(false);
		btn_home.setFocusPainted(true);

		btn_home.setBounds(12, 10, 72, 60);
		panel.add(btn_home);

	}
}
