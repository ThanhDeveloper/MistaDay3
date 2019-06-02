package News.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import News.bo.News;
import News.Idao.INewsDao;
import News.Utils.ConnectionUtils;

public class NewsDaoImpl extends ConnectionUtils implements INewsDao {
	public static int inputNumber;
	public static Scanner input = new Scanner(System.in);
	public static boolean isEndProgram = false;
	//impl Load
	@Override
	public void LoadNews() { 	
		Connection conn=null;
		try {
			
			conn=getConnection();
			String sql="Select * from news";
			Statement statement=conn.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			
			while (rs.next()) {
				int id=  rs.getInt("id");
				String name =rs.getString("name");
				int category_id=  rs.getInt("category_id");
				String description =rs.getString("description");
				String detail =rs.getString("detail");
				String image =rs.getString("image");
				Date date=(Date) rs.getDate("Timestamp");
				String user_id =rs.getString("user_id");
				//Print
				System.out.println("ID_News : "+id);
				System.out.println("News_name : "+name);
				System.out.println("Category_Id : "+category_id);
				System.out.println("Description_News : "+description);
				System.out.println("Detail : "+detail);
				System.out.println("Image : "+image);
				System.out.println("TimeStamp : "+date );
				System.out.println("User_Id : "+user_id);	
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------------------");
				
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	////impl Edit
	@Override
	public void EditNews() {
		Scanner ScannerDes=new Scanner(System.in);
		Connection conn=null;
try {
			
			conn=getConnection();
			
			//Print
				System.out.println("Input ID Update :");
				System.out.println("ID_News : ");
				int id=  Integer.parseInt(ScannerDes.nextLine());
				System.out.println("News_name : ");
				String name =ScannerDes.nextLine();
				System.out.println("Category_Id : ");
				int category_id=  Integer.parseInt(ScannerDes.nextLine());
				System.out.println("Description_News : ");
				String description =ScannerDes.nextLine();
				System.out.println("Detail : ");
				String detail =ScannerDes.nextLine();
				System.out.println("Image : ");
				String image =ScannerDes.nextLine();
				System.out.println("TimeStamp : ");
				String date=ScannerDes.nextLine();
				System.out.println("User_Id : ");				
				int user_id =ScannerDes.nextInt();
				News newObj=new News( category_id, name, description, detail, image, date, user_id);
				String sql="update news set "
						+"category_id="+newObj.getCartegory_id()+","
						+"Name='"+newObj.getName()+"',"
						+"user_id="+newObj.getUserId()+","
						+"description='"+newObj.getDescription()+"',"
						+"detail='"+newObj.getDetail()+"',"
						+"image='"+newObj.getImage()+"',"
						+"timestamp='"+date+"'"
						+"where id="+id;
					
						
				Statement statement=conn.createStatement();
				statement.executeUpdate(sql);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	//impl Add
	@Override
	public void AddNews() {
		Scanner ScannerDes=new Scanner(System.in);
		Connection conn=null;
try {
			
			conn=getConnection();
			
			//Print
				System.out.println("Input New News :");
				System.out.println("ID_News : ");
				int id=  Integer.parseInt(ScannerDes.nextLine());
				System.out.println("News_name : ");
				String name =ScannerDes.nextLine();
				System.out.println("Category_Id : ");
				int category_id=  Integer.parseInt(ScannerDes.nextLine());
				System.out.println("Description_News : ");
				String description =ScannerDes.nextLine();
				System.out.println("Detail : ");
				String detail =ScannerDes.nextLine();
				System.out.println("Image : ");
				String image =ScannerDes.nextLine();
				System.out.println("TimeStamp : ");
				String date=ScannerDes.nextLine();
				System.out.println("User_Id : ");				
				int user_id =ScannerDes.nextInt();
				News newObj=new News(id, category_id, name, description, detail, image, date, user_id);
				String sql="insert into news(id,category_id,name,description,detail,image,Timestamp,user_id) "
						+ newObj.toString();
				
				Statement statement=conn.createStatement();
				statement.executeUpdate(sql);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
	//impl delete
	@Override
	public void DeleteNews() {
		Scanner del=new Scanner(System.in);
		int idDel=del.nextInt();
		Connection conn=null;
		try {
			System.out.println("Input id News to delete");
			conn=getConnection();
			String sql="delete from news where id="+idDel;
			Statement statement=conn.createStatement();
			statement.executeUpdate(sql);
			
	 } catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	//impl Find
	@Override
	public void FindNews() {
		Scanner inp=new Scanner(System.in);
		System.out.println("Please input News name and category_id to find");
		Connection conn=null;
		try {
			conn=getConnection();
		System.out.println("input name");
		String nameNews=inp.nextLine();
		System.out.println("input category_id");
		int carId=inp.nextInt();
		String sql="Select * from news where name ='"+nameNews+"' and category_id="+carId;
		System.out.println(sql);
		Statement statement=conn.createStatement();
		ResultSet rs=statement.executeQuery(sql);
		while (rs.next()) {
			int id=  rs.getInt("id");
			String name =rs.getString("name");
			int category_id=  rs.getInt("category_id");
			String description =rs.getString("description");
			String detail =rs.getString("detail");
			String image =rs.getString("image");
			Date date=(Date) rs.getDate("Timestamp");
			String user_id =rs.getString("user_id");
			//Print
			System.out.println("ID_News : "+id);
			System.out.println("News_name : "+name);
			System.out.println("Category_Id : "+category_id);
			System.out.println("Description_News : "+description);
			System.out.println("Detail : "+detail);
			System.out.println("Image : "+image);
			System.out.println("TimeStamp : "+date );
			System.out.println("User_Id : "+user_id);	
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------");
			
			
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
}

	@Override
	public void menu() {
		NewsDaoImpl action=new NewsDaoImpl();
		// TODO Auto-generated method stub
		do {
			// menu CodeTodo
						System.out.println("1: Show  news");
						System.out.println("2: Create News");
						System.out.println("3: Edit News");
						System.out.println("4: Delete News");
						System.out.println("5: Find News");
						System.out.println("Enter 0 to ESC");
						System.out.println("--------------------------------------");
						System.out.println("Choose one Action !");
						inputNumber = input.nextInt();
						
		switch (inputNumber) {
		case 0:
			break;
		case 1:
			action.LoadNews();
			askForContinues();
			break;
		case 2:
			action.AddNews();
			askForContinues();
			break;
		case 3:
			action.EditNews();
			askForContinues();
			break;
		case 4:
			action.DeleteNews();
			askForContinues();
			break;
		case 5:
			action.FindNews();
			askForContinues();
			
			break;

		default:
			System.out.println(" Your input wrong,Enter again! ");
			break;
			
		}				
						
		} while ( inputNumber!=0);
		
			
	}

	@Override
	public void askForContinues() {
		System.out.println("Do you want to continue? (Press 0 to end proram, 1 to come back menu) : ");
		int inputNo = input.nextInt();
		switch (inputNo) {
		case 1:
			menu();
			break;
		case 0:
			isEndProgram = true;
			break;
		default:
			break;
		}
		
	}
}
