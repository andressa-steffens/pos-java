package Product;

public class Product {

	//Instance field declarations
	private int id;
	private String name;
	private int nStock;
	private double price;

	private boolean active = true;
	
	public Product() {
	}

	public Product(int id, String name, int nStock, double price) {
		this.id = id;
		this.name = name;
		this.nStock = nStock;
		this.price = price;
	}
	
	public double getInventoryValue () {
		return this.price * this.nStock;
	}
	
	public String toString() {
		
		String productStatus = this.active ? "Active" : "Discontinued";
		double stockValue = getInventoryValue();
		
		String s1 = "Item Number      :" + id + "\n";
		String s2 = "Name             :" + name + "\n";
		String s3 = "Quantity in stock:" + nStock + "\n";
		String s4 = "Price            :" + price + "\n";
		String s5 = "Stock Value      :" + stockValue + "\n";
		String s6 = "Product Status   :" + productStatus + "\n";
		
		return s1 + s2 + s3 + s4 +s5 + s6;
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

	public int getnStock() {
		return nStock;
	}

	public void setnStock(int nStock) {
		this.nStock = nStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		this.price = d;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
