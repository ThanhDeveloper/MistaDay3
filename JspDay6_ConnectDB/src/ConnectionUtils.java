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
	//Load News table 
	public static void loadNews() {
		Connection conn=null;
		try {
			
			conn=getConnection();
			String sql="Select * from news";
			Statement statement=conn.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			System.out.println("|id | category_id | name         | description | detail |  image  |  date | user_id");
			while (rs.next()) {
				int id=  rs.getInt("id");
				String name =rs.getString("name");
				int category_id=  rs.getInt("category_id");
				String description =rs.getString("description");
				String detail =rs.getString("detail");
				String image =rs.getString("image");
				Date date=(Date) rs.getDate("Timesta mp");
				String user_id =rs.getString("user_id");
				System.out.println("|"+id+"  | "+ category_id+"           | "+name+"          | "+description+" | "+detail+" |  "+image+"  | "+date+" | "+user_id );
				
				
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	//Load table news with FK Category
	public static void loadCategory_Name() {
		Connection conn=null;
		try {
			
			conn=getConnection();
			String sql="select * from categories \r\n" + 
					"left join \r\n" + 
					"news on news.category_id=categories.id";
			Statement statement=conn.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			System.out.println("|id | |name | |id | category_id | name         | description | detail |  image  |  date | user_id");
			while (rs.next()) {
				int id=  rs.getInt("id");
				String name =rs.getString("name");
				int category_id=  rs.getInt("category_id");
				String description =rs.getString("description");
				String detail =rs.getString("detail");
				String image =rs.getString("image");
				Date date=(Date) rs.getDate("Timestamp");
				String user_id =rs.getString("user_id");
				int idCate=  rs.getInt("id");
				String nameCate=rs.getString("name");
				System.out.println("|"+idCate+"|"+nameCate+"|"+id+"  | "+ category_id+"           | "+name+"          | "+description+" | "+detail+" |  "+image+"  | "+date+" | "+user_id );
				
				
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		loadNews();
		System.out.println();
		loadCategory_Name();
		
	}
}
