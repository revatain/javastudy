package ch20;

//���� java.sql.* �ΰɷ� import �ؾ� ��������
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCTestEx02 {

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

	//DB������ ����
	public static void insertDB(Statement stmt, String table, int id, String name){
		String query = "INSERT INTO "+table+" (id, name) VALUES ("+id+",'"+name+"')";
		try {
			stmt.executeUpdate(query); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//DB������ �˻�
	public static void selectDB(Statement stmt, String table){
		String query = "SELECT * FROM "+table; 

		try {
			ResultSet rs = stmt.executeQuery(query);

			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println(id+" "+name); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	//DB������ ����
	public static void alterDB(Statement stmt, String table, String oldName, String newName){
		String query = "UPDATE "+table+" SET name='"+newName+"' WHERE name='"+oldName+"'"; 
		try {
			stmt.executeUpdate(query); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//DB ������ ����
	public static void deleteDB(Statement stmt, String table, String name){
		String query = "DELETE FROM "+table+" WHERE name = " + "'"+name+"'";
		try {
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try {
			Connection con = makeConnection(); 
			Statement stmt = con.createStatement();
			String table = "books"; 
			
			System.out.println("----------------�˻����---------------");
			selectDB(stmt, table); 
			
			System.out.println("----------------���԰��---------------");
			insertDB(stmt, table, 10, "����å"); 
			selectDB(stmt, table); 
			
			System.out.println("----------------�������---------------");
			alterDB(stmt, table, "����å", "����å"); 
			selectDB(stmt, table); 
			
			System.out.println("----------------�������---------------");
			deleteDB(stmt, table, "����å");
			selectDB(stmt, table); 
			
			stmt.close(); 
			con.close(); 
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}