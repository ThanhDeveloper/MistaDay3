package News.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	
	public  Connection getConnection() throws SQLException, ClassNotFoundException {
		String hostName="localhost";
		String sqlInstanceName="DESKTOP-8RGET33\\SQLEXPRESS";
		String database="News";
		String username="sa";
		String password="sa";
		String connectionURL="jdbc:sqlserver://"+ hostName +":1433;" +";databaseName="+database+";" ;
	
		Connection conn=DriverManager.getConnection(connectionURL, username, password);
		return conn;
	} 
	
	
}
