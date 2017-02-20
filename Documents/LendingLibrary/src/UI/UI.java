package UI;
import models.Book;

public class UI {
	
	public void printHeader(){
		
		System.out.println("ID      Title                 Author             ");
		
	}

	public void printBook(Book book){
		
		
		System.out.println(fixedLengthString(book.getBookID(), 6) + "  "+ fixedLengthString(book.getTitle(), 20) + "  "+fixedLengthString(book.getAuthor(),20));
		
					
	}
	
	private String fixedLengthString(String start, int length){
		//TODO: Fix the string padding problem
		if(start.length() > length){
			
			return start.substring(0, length);
		}
		else
			while(start.length() < length)
			{
				start = start + " ";
			}
		return start;
	}
	private String fixedLengthString(int start, int length){
		
		
		String startString = String.valueOf(start);
		return fixedLengthString(startString, 6);
	}
	
	public void printBookCatalogue(Book[] bookCatalogue){
		
		for(int i = 0;i < bookCatalogue.length; i++){
			
			if(bookCatalogue[i] != null){
				
				printBook(bookCatalogue[i]);
				
			}
			
					
		}
		
				
	}
	
	
	
	
	
}
