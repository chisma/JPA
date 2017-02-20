package models;
import utilities.GenderType;

public class Customer {

	private String firstName;
	private String surName;
	private String title;
	private String address;
	private String phoneNumber;
	private String e_mail;
	private int customerNumber;
	private GenderType gender;
	private boolean isValid;
	
	public Customer(String title, String firstName, String surName,String address, 
			String phoneNumber, String e_mail, int customerNumber,GenderType gender ){
		
		setName(firstName, surName, title);
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.e_mail = e_mail;
		this.customerNumber = customerNumber;
		this.gender = gender;
		this.isValid = true;
		
	}
	
	
	public String getFirstName(){
		
		return firstName; 
					
	}
	
	public String getSurName(){
		
		return surName;
	}
	
	public String getTitle(){
		
		return title;
	}
	
	public String getAddress(){
		
		return address;
		
	}
	
	public String getPhoneNumber(){
		
		return phoneNumber;
		
				
	}
	
	public String getEmail(){
		
		return e_mail;
		
	}
	public GenderType getGender(){
		
		return gender;
	}
	
	
	private void setName(String firstName, String surName, String title){
		
		this.firstName = firstName;
		this.surName = surName;
		this.title = title;
			
	}
	
	public String getMailingName(){
		
		return title + " " + firstName.substring(0, 1)+ " " + surName;
		
	}
	

	
	
	
	
	
	
	
	
	
}


