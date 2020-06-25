package m;


import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class bikerent {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bikerent window = new bikerent();
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
	public bikerent() {
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
		int cnt = 0;
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 984, 599);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("2326. \uAC15\uB0A8\uC5ED");
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(282, 25, 409, 52);
		panel.add(lblNewLabel); //title 강남역
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(342, 270, 24, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBackground(Color.WHITE);
		chckbxNewCheckBox_1.setBounds(342, 316, 24, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBackground(Color.WHITE);
		chckbxNewCheckBox_2.setBounds(342, 368, 24, 23);
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
		chckbxNewCheckBox_3.setBackground(Color.WHITE);
		chckbxNewCheckBox_3.setBounds(342, 417, 24, 23);
		panel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("");
		chckbxNewCheckBox_4.setBackground(Color.WHITE);
		chckbxNewCheckBox_4.setBounds(835, 270, 24, 23);
		panel.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("");
		chckbxNewCheckBox_5.setBackground(Color.WHITE);
		chckbxNewCheckBox_5.setBounds(835, 316, 24, 23);
		panel.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("");
		chckbxNewCheckBox_6.setBackground(Color.WHITE);
		chckbxNewCheckBox_6.setBounds(835, 368, 24, 23);
		panel.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("");
		chckbxNewCheckBox_7.setBackground(Color.WHITE);
		chckbxNewCheckBox_7.setBounds(835, 417, 24, 23);
		panel.add(chckbxNewCheckBox_7);
		
		ButtonGroup group = new ButtonGroup();
		group.add(chckbxNewCheckBox);
		group.add(chckbxNewCheckBox_1);
		group.add(chckbxNewCheckBox_2);
		group.add(chckbxNewCheckBox_3);
		group.add(chckbxNewCheckBox_4);
		group.add(chckbxNewCheckBox_5);
		group.add(chckbxNewCheckBox_6);
		group.add(chckbxNewCheckBox_7);
		//chck box 하나만되게 설정하기
		
		JButton btn_Rent = new JButton("");
		btn_Rent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "대여 예약 하시겠습니까? ", "대여 예약", JOptionPane.INFORMATION_MESSAGE);// 경고메세지
			}
		});//마우스 클릭이벤트
		btn_Rent.setBounds(366, 508, 252, 35);
		panel.add(btn_Rent);//대여 예약 버튼
		btn_Rent.setBorderPainted(false); // 버튼 사라짐
		btn_Rent.setContentAreaFilled(false); // 버튼 사라짐
		
		
		
//		-----------------------------------------------------------------------------------배경
		URL url = this.getClass().getResource("../image/Rent.jpg");
		String path = url.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로 
		Image image1 = new ImageIcon(path).getImage(); 
		panel.setLayout(null);

		
		JLabel lbl_Rent_Background = new JLabel(new ImageIcon(image1.getScaledInstance(978, 600, Image.SCALE_SMOOTH)));
		lbl_Rent_Background.setBounds(0, 0, 984, 599);
		panel.add(lbl_Rent_Background);
		
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
	    
		btn_home.setBounds(12, 10, 74, 67);
		panel.add(btn_home);
		
		
		
	}
}
