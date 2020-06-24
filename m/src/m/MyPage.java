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
import java.awt.GraphicsEnvironment;

public class MyPage {

	public JFrame frame;
	private JButton btn_home;
	private String ticket;
	private JLabel lbl_ticket;
	private String date;
	private FontMake fm = new FontMake();

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public void setDate(String date) {
		this.date = date;
	}

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

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fm.fontChange(ge);

		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 986, 597);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lbl_name = new JLabel(Login.name);
		lbl_name.setFont(new Font("KoPubWorld돋움체 Light", Font.BOLD, 20));
		lbl_name.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_name.setBounds(201, 362, 115, 33);
		panel.add(lbl_name);

		lbl_ticket = new JLabel();
//		lbl_ticket.setText(Payment1.ticket);
		if (Payment1.ticket.equals("7일권 이용중")) {
			URL url = this.getClass().getResource("../image/week.png");
			String path = url.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로
			Image image = new ImageIcon(path).getImage();
			lbl_ticket.setIcon(new ImageIcon(image));
		}else if (Payment1.ticket.equals("30일권 이용중")) {
			URL url = this.getClass().getResource("../image/month.png");
			String path = url.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로
			Image image = new ImageIcon(path).getImage();
			lbl_ticket.setIcon(new ImageIcon(image));
		}else if (Payment1.ticket.equals("365일권 이용중")) {
			URL url = this.getClass().getResource("../image/year.png");
			String path = url.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로
			Image image = new ImageIcon(path).getImage();
			lbl_ticket.setIcon(new ImageIcon(image));
		}
		lbl_ticket.setFont(new Font("KoPubWorld돋움체 Light", Font.BOLD, 20));
		lbl_ticket.setBounds(517, 342, 145, 41);
		panel.add(lbl_ticket);

		URL url = this.getClass().getResource("../image/mypage_00.png");
		String path = url.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로
		Image image = new ImageIcon(path).getImage();

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

		btn_home.setBounds(39, 21, 74, 63);
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

		btn_complete.setBounds(343, 502, 319, 41);
		panel.add(btn_complete);

		JLabel lbl_rentalN = new JLabel(date);
		lbl_rentalN.setBounds(517, 178, 151, 26);
		panel.add(lbl_rentalN);

		JLabel lbl_yata = new JLabel("New label");
		lbl_yata.setBounds(533, 392, 145, 33);
		panel.add(lbl_yata);

		JLabel lbl_rental = new JLabel("New label");
		lbl_rental.setBounds(517, 214, 145, 26);
		panel.add(lbl_rental);

		JLabel lbl_rtrn = new JLabel("New label");
		lbl_rtrn.setBounds(517, 270, 145, 26);
		panel.add(lbl_rtrn);

//		//// 

	}
}
