package m;

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
import java.net.URL;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField txt_id;
	String name;
	ArrayList<CycleVO> list;
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
		frame.setBounds(100, 100, 970, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 960, 540);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		txt_id = new JTextField();
		txt_id.setBounds(393, 182, 232, 40);
		panel.add(txt_id);
		txt_id.setColumns(10);
		txt_id.setOpaque(false);
		txt_id.setBorder(null);
		txt_id.setFont(new Font("Dialog", Font.PLAIN, 20));

		txt_pw = new JPasswordField();
		txt_pw.setBounds(393, 246, 232, 40);
		panel.add(txt_pw);
		txt_pw.setOpaque(false);
		txt_pw.setBorder(null);
		txt_pw.setFont(new Font("Dialog", Font.PLAIN, 20));

		JButton btn_login = new JButton("");
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				CycleVO vo = new CycleVO(id, pw);
				list = dao.login(vo);
				if (list.get(0).getId() != null) { // 값이 입력돼서 로그인성공!
					JOptionPane.showMessageDialog(null, list.get(0).getName() + "님 환영합니다.");
					home home = new home(list.get(0));
				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}
			}
		});
		btn_login.setBounds(499, 352, 140, 40);
		panel.add(btn_login);
		btn_login.setOpaque(false);
		btn_login.setBorder(null);
		btn_login.setContentAreaFilled(false);

		JButton btn_join = new JButton("");
		btn_join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Join join = new Join(list.get(0));

			}
		});
		btn_join.setBounds(345, 352, 142, 40);
		panel.add(btn_join);
		btn_join.setOpaque(false);
		btn_join.setBorder(null);
		btn_join.setContentAreaFilled(false);

		// 상대경로
		URL url = this.getClass().getResource("../image/iogin_00.png");
		String path = url.getPath();
		System.out.println(path);
		Image image = new ImageIcon(path).getImage();

		JLabel lbl_bg = new JLabel(new ImageIcon(image.getScaledInstance(960, 540, Image.SCALE_SMOOTH)));
		lbl_bg.setBounds(0, 0, 960, 540);
		panel.add(lbl_bg);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				home home = new home(list.get(0));
				home.frame.setVisible(true);
			}
		});
		lblNewLabel.setBounds(25, 21, 74, 62);
		panel.add(lblNewLabel);

	}
}
