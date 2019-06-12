package News.bo;

import java.sql.Date;

public class News {
	private int id;
	private int category_id;
	private String description;
	private String name;
	private String detail;
	private String image;
	private Date date;
	private int user_id;

public News(int id, int category_id, String description, String name, String image, Date date, int user_id) {
	this.id = id;
	this.category_id = category_id;
	this.description = description;
	this.name = name;
	this.image = image;
	this.date = date;
	this.user_id = user_id;
}

public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
}



