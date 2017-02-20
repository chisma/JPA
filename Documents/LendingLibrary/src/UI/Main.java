package UI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import models.*;
import utilities.GenderType;

public class Main {

	public static void main(String[] args) {
		
		
		
		Date today = new Date();
		System.out.println(today);
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		GregorianCalendar gCal = new GregorianCalendar();
		System.out.println(gCal.getTime());
		System.out.println(gCal.add(GregorianCalendar.DAY_OF_MONTH, 89));
//		BookCatalogue bookCatalogue = new BookCatalogue();
//		Customer simon = new Customer("Mr","Matt","Demaen","1234 pyers Street","12345","abc@dfc",12345,GenderType.MALE);
//		Customer joanne = new Customer("Miss","Joanne","Cooper","1 oxford Street","00000","aaa@asd.com",34567,GenderType.FEMALE);
//		
//		
//		System.out.println(simon.getFirstName());
//		System.out.println(joanne.getMailingName());
//		
//		
//		Book book1 = new Book("An Introduction to Java","Douglas Creech",1234,"123-ASD134e8");
//		Book book2 = new Book("More Head First Java for absolute beginners","Douglas Lodge", 8903, "009-344");
//		
//		bookCatalogue.addBook(book1);
//		bookCatalogue.addBook(book2);
//		UI ui = new UI();
//		ui.printHeader();
//		Book book3 = bookCatalogue.findBook("An introduction to Java");
//		//Book book4 = bookCatalogue.findBook("COme Along");
//		if(book3 != null){
//			
//	
//		System.out.println("We found the book with title " + book3.getTitle());
//		}
//		
//		ui.printBookCatalogue(bookCatalogue.getBookArray());
		
	}

}
