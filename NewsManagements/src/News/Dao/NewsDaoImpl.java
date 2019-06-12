package News.Dao;

import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import News.Idao.*;
import News.bo.*;
import News.Dao.*;

public class NewsDaoImpl implements  INewsDao{
	public static	ArrayList<News> listNews = new ArrayList<News>();
	Scanner input = new Scanner(System.in);
	public void addNews(News n, Statement s) {
		// TODO Auto-generated method stub
		String sql =" insert into News(id, category_id, name, descriptions, detail, imagine, date, user_id) values("+n.getId() +", " +n.getCategory_id() 
		+ n.getName() +"','" +n.getDescription() + "'," + "'" +n.getDetail() + "'," + "'" +n.getImage() + "'," + "'" +n.getDate()+"," +n.getUser_id() +", '" 
		+ "'"+ ")";
		System.out.println(sql);
	}
	public void deleteNewsByName(String Named, Statement s) {
		// TODO Auto-generated method stub
		System.out.print("Nhap ten News muon xoa : ");
		String Named1 = input.nextLine();
		String sql =" delete News\r\n" + 
				"where name = "+"'"+Named1+"'";
		System.out.println(sql);
	}
	public void findNewsByName(String Namef, Statement s) {
		// TODO Auto-generated method stub
		 try {
				String sql = "select *from News\r\n" + 
						"where Name_news = "+"'"+Namef+"'";
				ResultSet rs=null;
				while (rs.next()) {
					int id = rs.getInt("id");
					int category_id = rs.getInt("category_id");
					String description = rs.getString("description");
					String name = rs.getString("name");
					String detail = rs.getString("detail");
					String image = rs.getString("imagine");
					Date date = rs.getDate("Date");
					int user_id = rs.getInt("user_id");
			
					News n = new News(id, category_id, description, name, image, date, user_id);
					listNews.add(n);	
				}
			} catch (Exception e) {
			
				e.printStackTrace();
			}
		 		for (News ns : listNews) {
		 			System.out.println(ns.getId()+"	 "+ns.getCategory_id()+"	"+ns.getName()+"	"+ns.getDescription()+" 	 "+ns.getDetail()+"		"+ns.getImage()+"	"+ns.getDate()+"  "+ns.getUser_id());
		 		}
	}
	public void getNews(Statement s) {
		// TODO Auto-generated method stub
		try {
			String sql = "select *from News";
			ResultSet rs=null;
			while (rs.next()) {
				int id = rs.getInt("id");
				int category_id = rs.getInt("category_id");
				String description = rs.getString("description");
				String name = rs.getString("name");
				String detail = rs.getString("detail");
				String image = rs.getString("imagine");
				Date date = rs.getDate("Date");
				int user_id = rs.getInt("user_id");
				
				News n = new News(id, category_id, description, name, image, date, user_id);
				listNews.add(n);
				for (News ns : listNews) {
		 			System.out.println(ns.getId()+"	 "+ns.getCategory_id()+"	"+ns.getName()+"	"+ns.getDescription()+" 	 "+ns.getDetail()+"		"+ns.getImage()+"	"+ns.getDate()+"  "+ns.getUser_id());
		 		}
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void updateNewsByName(String NameU, Statement s) {
		// TODO Auto-generated method stub
		System.out.print("Nhap ten News muon thay doi : ");
		String name = input.nextLine();
		String sql ="update News\r\n" + 
				"set name = "+"'"+name+"'"+"\r\n" + 
				"where Name_news ="+"'"+NameU+"'";
		
		
	}
	public void addNews(News n, java.beans.Statement s) {
		// TODO Auto-generated method stub
		
	}
	public void deleteNewsByName(String Named, java.beans.Statement s) {
		// TODO Auto-generated method stub
		
	}
	public void findNewsByName(String Namef, java.beans.Statement s) {
		// TODO Auto-generated method stub
		
	}
	public void getNews(java.beans.Statement s) {
		// TODO Auto-generated method stub
		
	}
	public void updateNewsByName(String NameU, java.beans.Statement s) {
		// TODO Auto-generated method stub
		
	}

}