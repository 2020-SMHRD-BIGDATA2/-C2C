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
import java.awt.event.MouseMotionAdapter;
import java.net.URL;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class kangnam {

	JFrame frame;
	int cnt = 0;
	int cnt_1 =0;
	int cnt_2 =0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kangnam window = new kangnam();
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
	public kangnam() {
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
		JButton btnNewButton;
		
		URL url = this.getClass().getResource("../image/kangnam.jpg");
		String path = url.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로 
		
		Image image = new ImageIcon(path).getImage();

		
		JPanel panel = new JPanel();
		panel.setBounds(-1, 0, 986, 597);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		URL url1 = this.getClass().getResource("../image/banner.png");
		String path1 = url1.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로 
		Image image1 = new ImageIcon(path1).getImage();
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(300, 61, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(426, 96, 317, 61);
		panel.add(lblNewLabel);
		lblNewLabel.setVisible(false); //이미지 지우기
		
		

		btnNewButton = new JButton("");
		
		
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setVisible(false); //이미지 지우기
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setVisible(true);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "반납대기 자전거를 예약을 하시겠습니까? ","예약",JOptionPane.INFORMATION_MESSAGE);//경고메세지 팝업창	
				
				frame.dispose();
				CtoC.main(null);
				
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);

		btnNewButton.setBounds(440, 146, 35, 34);
		panel.add(btnNewButton);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"[2326] \uAC15\uB0A8\uAD6C \uB300\uCE58\uB3D9 \uC0BC\uC131\uB85C \uAC70\uCE58\uB300", "KN_001\t\uB300\uC5EC\uAC00\uB2A5", "KN_002\t\uB300\uC5EC\uBD88\uAC00\uB2A5"}));
		comboBox2.setBounds(486, 264, 222, 26);
		panel.add(comboBox2);
		comboBox2.setVisible(false); //강남구 대치동 
		
		
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			comboBox2.setVisible(true);
			cnt++;
			if(cnt%2==0) {
				comboBox2.setVisible(false);
			}

			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		
		btnNewButton_1.setBounds(451, 249, 35, 41);
		panel.add(btnNewButton_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				cnt_2++;
				int index = comboBox_1.getSelectedIndex();
				if((index == 1 || index==2) && cnt_2%2==0 ) {
					System.out.println(cnt_2);
					Payment1.main(null);
					frame.dispose();
				}
			}
		});
//		comboBox_1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				if(comboBox_1.getSelectedItem()!=null) {
//				Payment1.main(null);}
//			}
//		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"[2375] \uAC15\uB0A8\uAD6C \uC218\uC11C\uC5ED 1\uBC88 \uCD9C\uAD6C \uC55E", "KN_003\t\uB300\uC5EC\uAC00\uB2A5", "KN_004\t\uB300\uC5EC\uAC00\uB2A5"}));
		comboBox_1.setBounds(652, 349, 208, 26);
		panel.add(comboBox_1);
		comboBox_1.setVisible(false);//강남구 수서역 콤보박스
		
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				comboBox_1.setVisible(true);
				cnt_1++;
				if(cnt_1%2==0) {
					comboBox_1.setVisible(false);
				}
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(625, 335, 29, 52);
		panel.add(btnNewButton_2);
		
		btnNewButton_2.setBorderPainted(false); //버튼 사라짐
		btnNewButton_2.setContentAreaFilled(false); //버튼 사라짐
		
		
		JLabel lbl_MainSub = new JLabel(new ImageIcon(image.getScaledInstance(978, 600, Image.SCALE_SMOOTH)));
		lbl_MainSub.setBounds(0, 0, 986, 600);
		panel.add(lbl_MainSub);
		
		JButton btn_home = new JButton("");
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
	    
		btn_home.setBounds(12, 10, 79, 71);
		panel.add(btn_home);
		
		
		
		


		


	}
}
