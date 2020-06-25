package m;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ListSelectionModel;

public class notice {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					notice window = new notice();
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
	public notice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 988, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 978, 600);
		frame.getContentPane().add(panel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Q \uB530\uB989\uC774\uB97C \uC774\uC6A9\uD558\uACE0 \uC2F6\uC740\uB370 \uC5B4\uB5BB\uAC8C \uD574\uC57C \uD558\uB098\uC694?(\uAD6C\uB9E4/\uB300\uC5EC/\uBC18\uB0A9)", "Q \uC815\uAE30\uAD8C \uBC0F \uC774\uC6A9\uAD8C \uC774\uC6A9\uBC29\uBC95", "Q \uB530\uB989\uC774 \uBC18\uB0A9\uC740 \uC5B4\uB5BB\uAC8C \uD558\uB098\uC694?", "Q. \uB530\uB989\uC774 \uC2DC\uC124\uBB3C \uD604\uD669\uC744 \uC54C\uACE0 \uC2F6\uC2B5\uB2C8\uB2E4."}));
		comboBox.setBounds(176, 407, 655, 32);
		panel.add(comboBox);
		
		//테이블 만들기
		String[] colNames = {"제목","날짜"};  // 컬럼명
		Object[][] data = {
				{"[안내] 따릉이 이용관련 안전수칙 안내	","2020.06.23"},
				{"공공자전거 따릉이 방역, 이렇게 합니다!	","2020.06.22"},
				{"따릉이 서버 정기점검 안내	","2020.06.21"},
				{"[유용한 정보] 서울공공자전거 따릉이 리플릿	","2020.06.20"},				
				};
		
		table = new JTable(data,colNames);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		table.setBounds(176, 168, 655, 153);
		panel.add(table);
		
		JButton btn_home = new JButton("");
		btn_home.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				home.main(null);
				
			}
		});
		btn_home.setBorderPainted(false);
	    btn_home.setContentAreaFilled(false);
	    btn_home.setFocusPainted(true);
	    
		btn_home.setBounds(12, 23, 69, 61);
		panel.add(btn_home);
		
		URL url = this.getClass().getResource("../image/notice.jpg");
		String path = url.getPath(); /// url.getPaht << 위 경로로 사용하는겨 상대경로 
		Image image = new ImageIcon(path).getImage(); 
		panel.setLayout(null);
		
		
		JLabel lbl_notice = new JLabel(new ImageIcon(image.getScaledInstance(978, 600, Image.SCALE_SMOOTH)));
		lbl_notice.setBounds(0, 0, 978, 610);
		panel.add(lbl_notice);
		

		

		

		


		
		
		
	}
}
