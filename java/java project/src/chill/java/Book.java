package chill.java;

public class Book extends Author {
	private String bname;
	private Double price;
	private int Quantity=0;
	public Book(String bname) {
		super(name,email,gender);
		this.bname = bname;
	}

	
public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
public String toString () {
	return "Bookname :" + bname + "Book price :"+ price +"Book Quantity :"+Quantity;
}
}
