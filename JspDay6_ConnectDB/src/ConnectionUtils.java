import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class ConnectionUtils {
//jdbc:sqlserver://localhost:1433;databasename=MyDatabase", "sa", "12345678"
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		String hostName="localhost";
		String sqlInstanceName="DESKTOP-8RGET33\\SQLEXPRESS";
		String database="News";
		String username="sa";
		String password="sa";
		String connectionURL="jdbc:sqlserver://"+ hostName +":1433;" +";databaseName="+database+";" ;
	
		Connection conn=DriverManager.getConnection(connectionURL, username, password);
		return conn;
	}
	public static void main(String[] args) {
		Connection conn=null;
		try {
			conn=getConnection();
			String sql="Select * from news";
			Statement statement=conn.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while (rs.next()) {
				int id=  rs.getInt("id");
				String name =rs.getString("name");
				System.out.println("id : "+id+"|"+"name : "+name );
				
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
