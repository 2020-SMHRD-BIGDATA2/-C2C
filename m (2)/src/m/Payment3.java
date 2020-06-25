package m;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSpinner;

public class Payment3 {

	public JFrame frame;
	private JTextField txt_card1;
	private JTextField txt_card2;
	private JTextField txt_card3;
	private JTextField txt_card4;
	private JTextField txt_cvc;
	private JTextField txt_pn1;
	private JTextField txt_pn2;
	private JTextField txt_pn3;
	private JButton btn_paysuccess;
	private int money;
	private JLabel price;
	private FontMake fm = new FontMake();
	private JSpinner spinner;

	public void setMoney(int money) {
		this.money = money;
		price.setText(money + "");
	}

	public Payment3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fm.fontChange(ge);

//		String fonts[] = ge.getAvailableFontFamilyNames();
//		for (int i = 0; i < fonts.length; i++) {
//			System.out.println(fonts[i]);
//		}

		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 984, 583);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_card1 = new JTextField();
		txt_card1.setBounds(325, 177, 77, 29);
		panel.add(txt_card1);
		txt_card1.setColumns(10);
		txt_card1.setOpaque(false);
		txt_card1.setBorder(null);
		txt_card1.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));

		txt_card2 = new JTextField();
		txt_card2.setColumns(10);
		txt_card2.setBounds(441, 175, 78, 33);
		panel.add(txt_card2);
		txt_card2.setOpaque(false);
		txt_card2.setBorder(null);
		txt_card2.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));

		txt_card3 = new JTextField();
		txt_card3.setColumns(10);
		txt_card3.setBounds(554, 177, 77, 29);
		panel.add(txt_card3);
		txt_card3.setOpaque(false);
		txt_card3.setBorder(null);
		txt_card3.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));

		txt_card4 = new JTextField();
		txt_card4.setColumns(10);
		txt_card4.setBounds(670, 172, 77, 29);
		panel.add(txt_card4);
		txt_card4.setOpaque(false);
		txt_card4.setBorder(null);
		txt_card4.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));

		txt_cvc = new JTextField();
		txt_cvc.setColumns(10);
		txt_cvc.setBounds(325, 246, 77, 29);
		panel.add(txt_cvc);
		txt_cvc.setOpaque(false);
		txt_cvc.setBorder(null);
		txt_cvc.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));

		txt_pn1 = new JTextField();
		txt_pn1.setColumns(10);
		txt_pn1.setBounds(325, 314, 77, 29);
		panel.add(txt_pn1);
		txt_pn1.setOpaque(false);
		txt_pn1.setBorder(null);
		txt_pn1.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));

		txt_pn2 = new JTextField();
		txt_pn2.setColumns(10);
		txt_pn2.setBounds(441, 314, 77, 29);
		panel.add(txt_pn2);
		txt_pn2.setOpaque(false);
		txt_pn2.setBorder(null);
		txt_pn2.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));

		txt_pn3 = new JTextField();
		txt_pn3.setColumns(10);
		txt_pn3.setBounds(554, 314, 77, 24);
		panel.add(txt_pn3);
		txt_pn3.setOpaque(false);
		txt_pn3.setBorder(null);
		txt_pn3.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));

		btn_paysuccess = new JButton("");
		btn_paysuccess.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// DB연결해서 ? 결제완료 하면 결제가 완료되었습니다. 창 띄우기!
				MyPage.main(null);

			}
		});
		btn_paysuccess.setBounds(315, 502, 419, 45);
		panel.add(btn_paysuccess);
		btn_paysuccess.setOpaque(false);
		btn_paysuccess.setBorder(null);
		btn_paysuccess.setContentAreaFilled(false);
		price = new JLabel("price");
		price.setHorizontalAlignment(SwingConstants.CENTER);
		price.setBounds(315, 421, 88, 58);
		panel.add(price);
		price.setFont(new Font("카페24 당당해", Font.PLAIN, 25));

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1592838000000L), null, null, Calendar.HOUR_OF_DAY));
		spinner.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String s = spinner.getValue().toString();
				String[] s2 = s.split(" ");
				System.out.println(s);
				System.out.println(s2[3]);
				
				// 시간만 따로 똑 떼서 계산을 뚝 하시면 될 것 같은데....
				// 똑뚝....
			}
		});
		spinner.setBounds(315, 372, 159, 38);
		panel.add(spinner);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerDateModel(new Date(1592838000000L), null, null, Calendar.DAY_OF_YEAR));
		spinner_1.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));
		spinner_1.setBounds(579, 372, 159, 38);
		panel.add(spinner_1);

		
		URL url = this.getClass().getResource("../image/paytime_0.png");
		String path = url.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로 
		Image image = new ImageIcon(path).getImage();
		panel.setLayout(null);

		JLabel lbl_bg = new JLabel(new ImageIcon(image.getScaledInstance(978, 600, Image.SCALE_SMOOTH)));
		lbl_bg.setBounds(3, 5, 978, 600);
		panel.add(lbl_bg);
		

	}
}
