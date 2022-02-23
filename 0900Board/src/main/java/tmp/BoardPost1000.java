package tmp;

import dao.MemberDAO;
import java.sql.*;

public class BoardPost1000 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://3.36.137.234:3330/shopdb";
		String id = "dbconn";
		String pw = "Zhfldk11!";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pw);
			
			for(int i=1;i<=1000;i++) {
			pstmt=conn.prepareStatement("insert into board_tbl values(null,?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1,"b"+i+"@naver.com");
			pstmt.setString(2, "1234");
			pstmt.setString(3,"제목"+i);
			pstmt.setString(4,"내용"+i);
			pstmt.setString(5,"2022-02-03");
			pstmt.setString(6,"127.0.0.1");
			pstmt.setInt(7,0);
			pstmt.setString(8,"NONE");
			pstmt.setInt(9,0);
			pstmt.executeUpdate();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{pstmt.close();}catch(Exception e){}
			try{conn.close();}catch(Exception e){}
		}

	}

}
