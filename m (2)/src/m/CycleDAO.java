package m;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

public class CycleDAO {
	private ResultSet rs;
	private Connection conn;
	private PreparedStatement psmt;

	// 커넥션 연결하는 메소드
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			// DB에 접근할 수 있는 주소, 접근가능한 아이디, 패스워드
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public int join(CycleVO vo) {

		int cnt = 0;

		try {

			getConnection();

			String sql = "INSERT INTO CLIENT VALUES(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			
			Random ran = new Random();
			
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getPn());
			

			cnt = psmt.executeUpdate();

			// 닫기

		} catch (Exception e) {

		} finally {
			close();
		}

		return cnt;
	}

	public String login(CycleVO vo) {
		String name = null;

		// try-catch하는 이유, 클래스를 찾을 수 없는 상황에 대한 예외처리
		try {
			getConnection();

			String sql = "SELECT * FROM CLIENT WHERE ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());

			rs = psmt.executeQuery();

			if (rs.next()) {
				name = rs.getString("name");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return name;
	}

//	public ArrayList<CycleVO> selectAll() {
//		ArrayList<CycleVO> list = new ArrayList<CycleVO>();
//		getConnection();
//		String sql = "SELECT * FROM MEMBERS";
//		try {
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery();
//			while (rs.next()) {
//				String id = rs.getString("ID");
//				String name = rs.getString("NAME");
//				int age = rs.getInt("AGE");
//
//				CycleVO vo = new CycleVO(id, name, pn);
//				list.add(vo);
//
//			}
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//
//		return list;
//	}

	public int delete(String id, String pw) {
		getConnection();
		String sql = "DELETE FROM MEMBERS WHERE ID = ? AND PW = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			int cnt = psmt.executeUpdate();
			
			if(cnt>0) {
				return cnt;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			close();
		}
		return 0;
	}

	public boolean idCheck(String text) {
		getConnection();
		
		boolean isCheck = false;
		try {
			
			String sql = "SELECT * FROM CLIENT WHERE ID = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, text);
			rs = psmt.executeQuery();
			if(rs.next()) {
				isCheck = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isCheck;
	}

}




















