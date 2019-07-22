package demo.Connection;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class ConnectionUtils {
	public static  Connection getConnection() throws SQLException,ClassNotFoundException{
		String hostName="localhost";
		String sqlInstanceName="DESKTOP-1MGG60V";
		String database="UserManagement";
		String username="sa";
		String password="sa";
		String connectionURL="jdbc:sqlserver://"+ hostName +":1433;" +"databaseName="+database+";" ;
		
		Connection coon=DriverManager.getConnection(connectionURL,username,password);
		return coon;
	}
	//load db
	public static void load() {
		Connection conn=null;
		try {
	
			conn=getConnection();
			String sql="select username from Users";
			Statement statement=(Statement) conn.createStatement();
			ResultSet rs=((java.sql.Statement) statement).executeQuery(sql);
			System.out.println("This is username !!");
			while(rs.next()) {
				String user=rs.getString("username");
				System.out.println(user);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		load();
	}
}
