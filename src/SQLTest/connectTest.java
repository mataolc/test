package SQLTest;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class connectTest {
	public static void main(String[] args){
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test02?"+
			"user=root&password=root");
			
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test02",
//					"root","root");
			
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from city");
			
			while(rs.next()){
				System.out.println(rs.getString(2));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally{
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				rs = null;
			}
			
			if(st != null){
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				st = null;
			}
		}
	}
}
