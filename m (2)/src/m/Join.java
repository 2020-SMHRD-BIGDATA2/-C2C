package m;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Join {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_pw;
	private JTextField txt_pn;
	
	CycleDAO dao = new CycleDAO();
	private JTextField txt_name;
	private JButton btn_check;	
	private FontMake fm = new FontMake();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join window = new Join();
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
	public Join() {
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
		frame.setBounds(100, 100, 970,580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0,960,540);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txt_id = new JTextField();
		txt_id.setBounds(378, 151, 226, 28);
		panel.add(txt_id);
		txt_id.setColumns(10);
		txt_id.setOpaque(false);
		txt_id.setBorder(null);
		txt_id.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));
		
		
		txt_pw = new JTextField();
		txt_pw.setBounds(378, 217, 226, 28);
		panel.add(txt_pw);
		txt_pw.setColumns(10);
		txt_pw.setOpaque(false);
		txt_pw.setBorder(null);
		txt_pw.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));
		
		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(378, 281, 226, 28);
		panel.add(txt_name);
		txt_name.setOpaque(false);
		txt_name.setBorder(null);
		txt_name.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));
		
		txt_pn = new JTextField();
		txt_pn.setBounds(383, 348, 226, 28);
		txt_pn.setColumns(10);
		panel.add(txt_pn);
		txt_pn.setOpaque(false);
		txt_pn.setBorder(null);
		txt_pn.setFont(new Font("KoPubWorld돋움체 Light", Font.PLAIN, 15));
		
		JButton btn_join = new JButton("");
		btn_join.setBounds(383, 419, 221, 43);
		btn_join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				String name = txt_name.getText();
				String pn = txt_pn.getText();
			
				CycleVO vo = new CycleVO(id, pw, name, pn);
				
				int cnt = dao.join(vo);
				if(cnt!=0) {
					JOptionPane.showMessageDialog(null, "회원가입성공");
					frame.dispose(); // frame.setVisible(false);
					Login.main(null);
				}else {
					JOptionPane.showMessageDialog(null, "회원가입실패");
				}
			}
		});
		panel.add(btn_join);
		btn_join.setBorder(null);
		btn_join.setBorderPainted(false);
		btn_join.setContentAreaFilled(false);

		btn_check = new JButton("");
		btn_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CycleDAO dao = new CycleDAO();
				boolean isCheck = dao.idCheck(txt_id.getText());
				if(isCheck) {
					JOptionPane.showMessageDialog(null, "사용할 수 없는 아이디 입니다.");
				}else {
					JOptionPane.showMessageDialog(null, "사용 가능한 아이디 입니다.");
				}
			}
		});
		btn_check.setBounds(628, 139, 64, 40);
		panel.add(btn_check);
		btn_check.setBorder(null);
		btn_check.setBorderPainted(false);
		btn_check.setContentAreaFilled(false);
		
		
		URL url = this.getClass().getResource("../image/join_00.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();
		
		JLabel lbl_bg = new JLabel(new ImageIcon(image.getScaledInstance(960,540, Image.SCALE_SMOOTH)));
		lbl_bg.setBounds(0, 0, 960,540);
		panel.add(lbl_bg);
		
	
		
	
		
	}
}
