package News.Idao;

import java.awt.List;
import java.sql.Statement;

import News.bo.News;

public interface INewsDao {
	public void addNews(News n, Statement s);
	public void deleteNewsByName(String Named, Statement s);
	public void findNewsByName(String Namef, Statement s);
	public void getNews(Statement s);
	public void updateNewsByName(String NameU, Statement s);
}
