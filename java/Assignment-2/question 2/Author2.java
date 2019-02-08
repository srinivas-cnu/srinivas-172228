package com.assign3;

public class Author2 {
	public static void main(String[] args)
	{
		Author a=new Author("Wonderfull","gopi@gmail.com",'m');
		Book b=new Book("hsasgd");
		b.setPrice(800);
		b.setQty(20);
		System.out.println(b);
	}
}
