package m;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class FontChange {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_pw;
	private FontMake fm = new FontMake();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FontChange window = new FontChange();
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
	public FontChange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 376, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fm.fontChange(ge);
		
		String fonts[] = ge.getAvailableFontFamilyNames();
		for (int i = 0; i < fonts.length; i++) {
			System.out.println(fonts[i]);
		}
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 360, 472);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txt_id = new JTextField();
		txt_id.setBounds(107, 170, 166, 27);
		panel.add(txt_id);
		txt_id.setColumns(10);
		txt_id.setOpaque(false); //투명도를 부여하는 기능
		txt_id.setBorder(null); //텍스트 필드의 선을 없애는기능
	
		
		txt_pw = new JTextField();
		txt_pw.setColumns(10);
		txt_pw.setBounds(107, 219, 166, 27);
		panel.add(txt_pw);
		
		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.setBounds(107, 263, 166, 27);
		panel.add(btn_login);
		
		JButton btn_delete = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		btn_delete.setBounds(107, 313, 166, 27);
		panel.add(btn_delete);
		
		JLabel lblNewLabel = new JLabel("\uBC15\uC218\uC9C4");
		lblNewLabel.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(70, 89, 240, 27);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(41, 176, 57, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PW");
		lblNewLabel_1_1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 16));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(41, 225, 57, 15);
		panel.add(lblNewLabel_1_1);
	}
}
