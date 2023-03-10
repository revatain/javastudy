package ch20;
// ���� java.sql.* �ΰɷ� import �ؾ� ��������
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTestEx01 {

	public static Connection makeConnection(){ 
		String url = "jdbc:mysql://localhost/myjava";
		String id = "root"; 
		String password ="1111"; 
		Connection con = null; 

		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			System.out.println("����̹� ã�Ҿ�~~ ^^");

			con = DriverManager.getConnection(url, id, password); 
			System.out.println("DBMS���ῡ �����Ͽ���~~ ^^");

		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� �� ã�Ҿ��~~ �Ф�");
		} catch (SQLException e) {
			System.out.println("DBMS ���ῡ �����߾�� ~~ �Ф�");
		}
		return con; 
	}
	
	public static void main(String[] args) {

		try {
			Connection con = makeConnection(); 
			Statement stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery("SELECT * FROM books");

			while(rs.next()){ 
				int id = rs.getInt("id"); 
				String name = rs.getString("name");
				System.out.println(id+" "+name); 
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}