package NewsDemo;

import java.awt.Menu;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;
import News.Dao.NewsDaoImpl;
import News.Utils.ConnectionUtils;
import News.bo.News;
public class MainProgram {
	public static Scanner scanner = new Scanner(System.in);
	public static int input = 0;
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		ConnectionUtils conn = new ConnectionUtils();
		Connection conne1 = conn.getConnection();
		Statement s = (Statement) conne1.createStatement();
		// TODO Auto-generated method stub
		NewsDaoImpl news1 = new NewsDaoImpl();
		do {
			System.out.println("-------------------------");
			System.out.println("Choose one number below");
			System.out.println("1.Add News");
			System.out.println("2.Delete News");
			System.out.println("3.Search");
			System.out.println("4.Show News");
			System.out.println("5.Update Date");
			System.out.println("0.Exit");
			System.out.println("------------------------");
			System.out.println("---> Choose one number in MENU:  ");
			int input = scanner.nextInt();
			switch(input) {
			
			case 1:
				int input0 = scanner.nextInt();
				System.out.print("Nhap ID : ");
				int id = scanner.nextInt();
				System.out.print("Nhap id_catelogy : ");
				int category_id = scanner.nextInt();
				System.out.print("Nhap id_user : ");
				int user_id = scanner.nextInt();
				Scanner input1 = new Scanner(System.in);
				System.out.println("Nhap ten News : ");
				String name = input1.nextLine();
				System.out.println("Nhap mo ta :");
				String description = input1.nextLine();
				System.out.println("Nhap chi tiet :");
				String detail = input1.nextLine();
				System.out.println("Nhap hinh anh :");
				String image = input1.nextLine();
				Date date = new Date();
				News n = new News(id, category_id, description, name, image, date, user_id);
				news1.addNews(n, s);
				break;
			case 2:
				Scanner input2 = new Scanner(System.in);
				System.out.println("Nhap ten News can xoa : ");
				String Named = input2.nextLine();
				news1.deleteNewsByName(Named, s);
				break;
			case 3 :
				Scanner input3 = new Scanner(System.in);
				System.out.println("Nhap ten News can tim : ");
				String Namef = input3.nextLine();
				news1.findNewsByName(Namef, s);
				break;
			case 4 : 
				news1.getNews(s);
				break;
			case 5 :
				Scanner input4 = new Scanner(System.in);
				System.out.println("Nhap ten News update : ");
				String NameU = input4.nextLine();
				news1.updateNewsByName(NameU, s);
				
				break;
			}
		}while(input!=0);
	}

}
