package cn.jxufe.po;

public class Item {
	private Integer id;
	private String name;
	private double price;
	private int count;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Item(Integer id, String name, double price, int count) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public Item() {
	}
}
