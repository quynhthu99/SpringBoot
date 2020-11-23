package Model.DTO;

public class Book {
	private String name;
	private int id;
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book() {

	}

	public Book(String name,int id, int price) {
		this.name = name;
		this.id = id;
		this.price=price;
	}

	@Override
	public String toString() {
		return "DTO [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	
}
