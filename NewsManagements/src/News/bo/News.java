package News.bo;

public class News {
	private int id;
	private int cartegory_id;
	private String name;
	private String description;
	private String detail;
	private String image;
	private String timestamp;
	public News(int cartegory_id, String name, String description, String detail, String image, String timestamp,
			int userId) {
		super();
		this.cartegory_id = cartegory_id;
		this.name = name;
		this.description = description;
		this.detail = detail;
		this.image = image;
		this.timestamp = timestamp;
		this.userId = userId;
	}
	private int userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public News(int id, int category_id, String name, String description, String detail, String image,
			String timestamp, int userId) {
		super();
		this.id = id;
		this.cartegory_id = category_id;
		this.name = name;
		this.description = description;
		this.detail = detail;
		this.image = image;
		this.timestamp = timestamp;
		this.userId = userId;
	}
	public int getCartegory_id() {
		return cartegory_id;
	}
	@Override
	public String toString() {
		return "values(" + id + ", " + cartegory_id + ",' " + name + "','" + description
				+ "',' " + detail + "',' " + image + "',' " + timestamp + "', " + userId +")";
	}
	public void setCartegory_id(int cartegory_id) {
		this.cartegory_id = cartegory_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
