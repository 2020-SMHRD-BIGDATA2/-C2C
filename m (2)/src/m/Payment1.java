package m;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class Payment1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment1 window = new Payment1();
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
	public Payment1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000,622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 984, 583);
		frame.getContentPane().add(panel);
		
		JCheckBox cbx_time = new JCheckBox("");
		cbx_time.setHorizontalAlignment(SwingConstants.CENTER);
		cbx_time.setBackground(Color.WHITE);
		cbx_time.setBounds(168, 355, 96, 23);
		panel.add(cbx_time);
		
		
		JCheckBox cbx_week = new JCheckBox("");
		cbx_week.setHorizontalAlignment(SwingConstants.CENTER);
		cbx_week.setBackground(Color.WHITE);
		cbx_week.setBounds(353, 355, 96, 23);
		panel.add(cbx_week);
		
		JCheckBox cbx_month = new JCheckBox("");
		cbx_month.setHorizontalAlignment(SwingConstants.CENTER);
		cbx_month.setBackground(Color.WHITE);
		cbx_month.setBounds(534, 355, 96, 23);
		panel.add(cbx_month);
		
		JCheckBox cbx_year = new JCheckBox("");
		cbx_year.setHorizontalAlignment(SwingConstants.CENTER);
		cbx_year.setBackground(Color.WHITE);
		cbx_year.setBounds(715, 355, 96, 23);
		panel.add(cbx_year);
		
		ButtonGroup group = new ButtonGroup();
		group.add(cbx_time);
		group.add(cbx_week);
		group.add(cbx_month);
		group.add(cbx_year);
		
		
		JButton btn_payment = new JButton("");
		btn_payment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int money = 0;
				if(cbx_time.isSelected()) {
					money = 1000;
					Payment3 payment3 = new Payment3();
					payment3.setMoney(money);
					payment3.frame.setVisible(true);
					
				}else if(cbx_week.isSelected()) {
					money = 5000;
					
					Payment2 payment2 = new Payment2();
					payment2.setMoney(money);
					payment2.frame.setVisible(true);
					
				}else if(cbx_month.isSelected()) {
					money = 10000;
					
					Payment2 payment2 = new Payment2();
					payment2.setMoney(money);
					payment2.frame.setVisible(true);
				}else if(cbx_year.isSelected()) {
					money = 30000;
					
					Payment2 payment2 = new Payment2();
					payment2.setMoney(money);
					payment2.frame.setVisible(true);
				}
				
				
				
				
			}
		});
		btn_payment.setBounds(286, 453, 421, 47);
		panel.add(btn_payment);
		btn_payment.setOpaque(false);
		btn_payment.setBorder(null);
		btn_payment.setContentAreaFilled(false);
		
		
		URL url = this.getClass().getResource("../image/payment_00.png");
		String path = url.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로 
		Image image = new ImageIcon(path).getImage(); 
		panel.setLayout(null);
		
		JLabel lbl_bg = new JLabel(new ImageIcon(image.getScaledInstance(978, 600, Image.SCALE_SMOOTH)));
		lbl_bg.setBounds(3, 5, 978, 600);
		panel.add(lbl_bg);
		
	}

}
