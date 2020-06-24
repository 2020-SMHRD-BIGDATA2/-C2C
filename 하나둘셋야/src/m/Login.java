package 하나둘셋야;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField txt_id;
	String name;
	CycleDAO dao = new CycleDAO();
	private JPasswordField txt_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 970,580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0,960,540);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_id = new JTextField();
		txt_id.setBounds(386, 189, 222, 30);
		panel.add(txt_id);
		txt_id.setColumns(10);
		txt_id.setOpaque(false);
		txt_id.setBorder(null);
		txt_id.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));
		
		txt_pw = new JPasswordField();
		txt_pw.setBounds(386, 256, 232, 30);
		panel.add(txt_pw);
		txt_pw.setOpaque(false);
		txt_pw.setBorder(null);
		txt_pw.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));

		JButton btn_login = new JButton("");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				CycleVO vo = new CycleVO(id, pw);
				name = dao.login(vo);
				if (name != null) { // 값이 입력돼서 로그인성공!
					JOptionPane.showMessageDialog(null, name + "님 환영합니다.");
					Login.main(null);
				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}
			}
		});
		btn_login.setBounds(503, 351, 135, 40);
		panel.add(btn_login);
		btn_login.setOpaque(false);
		btn_login.setBorder(null);
		btn_login.setContentAreaFilled(false);

		JButton btn_join = new JButton("");
		btn_join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Join.main(null);
				
			}
		});
		btn_join.setBounds(343, 351, 135, 40);
		panel.add(btn_join);
		btn_join.setOpaque(false);
		btn_join.setBorder(null);
		btn_join.setContentAreaFilled(false);

		String path = "C:\\Users\\SMHRD\\Desktop\\java_1\\하나둘셋야\\src\\image\\login.jpg";
		Image image = new ImageIcon(path).getImage();

		JLabel lbl_bg = new JLabel(new ImageIcon(image.getScaledInstance(960,540, Image.SCALE_SMOOTH)));
		lbl_bg.setBounds(0, 0,960,540);
		panel.add(lbl_bg);
		
		
	}
}
