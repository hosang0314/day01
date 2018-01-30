package mvc;

public class ProductDTO {
	private int id;
	private String name;
	private double price;
	public ProductDTO() {
	}
	public ProductDTO(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductDTO [id=").append(id).append(", name=").append(name).append(", price=").append(price)
				.append("]");
		return builder.toString();
	}
	
}
