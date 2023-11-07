package com.davis.library.model;

public class Books {
	private int id;
	private int isbn;
	private String bookName;
	
	//----------Constructor----------
	public Books() {}

	
	
	public Books(int isbn, String bookName) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
	}
	public Books(int id, int isbn, String bookName) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.bookName = bookName;
	}
	//-----Getter and Setter methods------


}
