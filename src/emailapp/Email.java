package emailapp;

import java.util.Scanner;

public class Email {

	
	private String Firstname;
	private String Lastname;
	private String Password;
	private String Email;
	private String Department;
	private int mailboxCapacity = 10;
	private int defaultpasswordlength = 10;
	private String alternateEmail;
	private String companySufix = "tonie.com";
	
	//constructor to receive last and first name 
	public Email(String Firstname, String Lastname) {
		
		
		//defining the Class level to the Local Variable 
		this.Firstname = Firstname;
		
		this.Lastname = Lastname;
		
		//System.out.println("Email Created :" + this.Firstname + " " + this.Lastname );
	
		//Call Method asking for Department 
		
		this.Department = setDepartment();
	
		//System.out.println("Department: " + this.Department);
		
		
		

		//call a method returns a RANDOM password
		
		
			this.Password = randomPassword(defaultpasswordlength);
		System.out.println("your password is : " + this.Password);
		
	

	//Generate Email
	
	Email = Firstname.toLowerCase() + "." + Lastname.toLowerCase() + "@" + Department + "." + companySufix;
	//System.out.println("your email is :" + Email);
	
	}
	//ask for Department 
	
	private String setDepartment() {
		
		System.out.println("new worker:" + Firstname + ". DepartmentCodes\n1 for sales\n2 for Development \n3 for Accounting \n0 for non \nEnter the Department: ");
		Scanner  in = new Scanner (System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "sales";
		}
		else if (depChoice == 2) {
			return "Dev";
		}
		else if (depChoice == 3) {
			return "Acc";
		}
		else {
			return "";
		}
		
	}
	

	
	
	//Generate Random Password
	
	private String randomPassword(int length) {
	
		String passwordSet = "ABCDEFGT123456";
		
		char[] password = new char[length];
		
		for (int i=0; i<length; i++) {
			
			
			int rand = (int) (Math.random() * passwordSet.length());
		 
			password[i] = passwordSet.charAt(rand);
		
		}
		
		return new String (password);
	}
	
	
	//Set mailbox Capacity 
	
	
	public void setMailboxCapacity(int capacity) {
		
		this.mailboxCapacity = capacity;
	}
	//Set Alternate Email
	
	public void setAlternateEmail(String altEmail){
		
		this.alternateEmail = altEmail;
	}
	
	
	
	//Change Password 
	
	public void changePassword(String npassword) {
		
		this.Password = npassword;
	}
	
	
	//Get Methods
	
	public int getMailboxcapacity (){
		
		return mailboxCapacity;
				}
	

	public String getAlternateEmail (){
		
		return alternateEmail;
				}
	

	public String getPassword (){
		
		return Password;
				}
	
	public String showInfo() {
		
		return "Display Name:"	+ Firstname + "" + Lastname +
				"\nComapny Mail :" + Email +
				"\nMail box Capacit: " + mailboxCapacity + "Mb";
				}
	
	
	
	
	
}
