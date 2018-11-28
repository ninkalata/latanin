package com.nature.model;

public class dress {
	private String category = null;
	private String description = null;
	private int id = 0;

	private String name = null;
	private int price = 0;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "dress [category=" + category + ", description=" + description + ", id=" + id + ", name=" + name
				+ ", price=" + price + "]";
	}
}
	/*public Plant() {
		
	}
	public Plant(String name, String category, String description, int price) {
		super();
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;
	}*/
	