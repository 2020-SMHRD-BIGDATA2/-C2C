package �ϳ��Ѽ¾�;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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

		String fonts[] = ge.getAvailableFontFamilyNames();
		for (int i = 0; i < fonts.length; i++) {
			System.out.println(fonts[i]);
		}

		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 984, 583);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_card1 = new JTextField();
		txt_card1.setBounds(315, 158, 97, 38);
		panel.add(txt_card1);
		txt_card1.setColumns(10);
		txt_card1.setOpaque(false);
		txt_card1.setBorder(null);
		txt_card1.setFont(new Font("KoPubWorld����ü Light", Font.PLAIN, 15));

		txt_card2 = new JTextField();
		txt_card2.setColumns(10);
		txt_card2.setBounds(422, 158, 97, 38);
		panel.add(txt_card2);
		txt_card2.setOpaque(false);
		txt_card2.setBorder(null);
		txt_card2.setFont(new Font("KoPubWorld����ü Light", Font.PLAIN, 15));

		txt_card3 = new JTextField();
		txt_card3.setColumns(10);
		txt_card3.setBounds(531, 158, 97, 38);
		panel.add(txt_card3);
		txt_card3.setOpaque(false);
		txt_card3.setBorder(null);
		txt_card3.setFont(new Font("KoPubWorld����ü Light", Font.PLAIN, 15));

		txt_card4 = new JTextField();
		txt_card4.setColumns(10);
		txt_card4.setBounds(641, 158, 97, 38);
		panel.add(txt_card4);
		txt_card4.setOpaque(false);
		txt_card4.setBorder(null);
		txt_card4.setFont(new Font("KoPubWorld����ü Light", Font.PLAIN, 15));

		txt_cvc = new JTextField();
		txt_cvc.setColumns(10);
		txt_cvc.setBounds(315, 244, 127, 38);
		panel.add(txt_cvc);
		txt_cvc.setOpaque(false);
		txt_cvc.setBorder(null);
		txt_cvc.setFont(new Font("KoPubWorld����ü Light", Font.PLAIN, 15));

		txt_pn1 = new JTextField();
		txt_pn1.setColumns(10);
		txt_pn1.setBounds(325, 310, 69, 38);
		panel.add(txt_pn1);
		txt_pn1.setOpaque(false);
		txt_pn1.setBorder(null);
		txt_pn1.setFont(new Font("KoPubWorld����ü Light", Font.PLAIN, 15));

		txt_pn2 = new JTextField();
		txt_pn2.setColumns(10);
		txt_pn2.setBounds(431, 310, 88, 38);
		panel.add(txt_pn2);
		txt_pn2.setOpaque(false);
		txt_pn2.setBorder(null);
		txt_pn2.setFont(new Font("KoPubWorld����ü Light", Font.PLAIN, 15));

		txt_pn3 = new JTextField();
		txt_pn3.setColumns(10);
		txt_pn3.setBounds(551, 310, 88, 38);
		panel.add(txt_pn3);
		txt_pn3.setOpaque(false);
		txt_pn3.setBorder(null);
		txt_pn3.setFont(new Font("KoPubWorld����ü Light", Font.PLAIN, 15));

		btn_paysuccess = new JButton("");
		btn_paysuccess.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// DB�����ؼ� ? �����Ϸ� �ϸ� ������ �Ϸ�Ǿ����ϴ�. â ����!

			}
		});
		btn_paysuccess.setBounds(360, 508, 265, 49);
		panel.add(btn_paysuccess);
		btn_paysuccess.setOpaque(false);
		btn_paysuccess.setBorder(null);
		btn_paysuccess.setContentAreaFilled(false);
		price = new JLabel("New label");
		price.setHorizontalAlignment(SwingConstants.CENTER);
		price.setBounds(315, 420, 97, 58);
		panel.add(price);
		price.setFont(new Font("KoPubWorld����ü Light", Font.PLAIN, 15));

		String path = "C:\\Users\\SMHRD\\Desktop\\java_1\\�ϳ��Ѽ¾�\\src\\image\\pay_time.jpg";
		Image image = new ImageIcon(path).getImage();
		panel.setLayout(null);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1592838000000L), null, null, Calendar.HOUR_OF_DAY));
		spinner.setFont(new Font("KoPubWorld����ü Light", Font.PLAIN, 15));
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(spinner.getValue());
				// �ð��� ���� �� ���� ����� �� �Ͻø� �� �� ������....
				// �ȶ�....
			}
		});
		spinner.setBounds(325, 372, 159, 38);
		panel.add(spinner);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerDateModel(new Date(1592838000000L), null, null, Calendar.DAY_OF_YEAR));
		spinner_1.setFont(new Font("KoPubWorld����ü Light", Font.PLAIN, 15));
		spinner_1.setBounds(579, 372, 159, 38);
		panel.add(spinner_1);

		JLabel lbl_bg = new JLabel(new ImageIcon(image.getScaledInstance(978, 600, Image.SCALE_SMOOTH)));
		lbl_bg.setBounds(3, 5, 978, 600);
		panel.add(lbl_bg);

	}
}
