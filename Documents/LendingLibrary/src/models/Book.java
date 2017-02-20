package models;

public class Book {

	private String title;
	private String author;
	private int bookID;
	private String ISBN;


	public Book(String title, String author, int bookID, String ISBN){

		this.title = title;
		this.author = author;
		this.bookID = bookID;
		this.ISBN = ISBN;

	}

	public String getTitle(){

		return title;

	}

	public String getAuthor(){

		return author;
	}


	public String getISBN(){

		return ISBN;
	}

	public int getBookID() {

		return bookID;
	}
	

	
}
